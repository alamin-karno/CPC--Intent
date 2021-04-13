package com.alaminkarno.cpc_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phoneET,nameET;
    String number,name;
    public static final String NAME = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneET = findViewById(R.id.phone_no_ET);
        nameET = findViewById(R.id.name_no_ET);

    }


    public void CallNow(View view) {

        number = phoneET.getText().toString().trim();

        if(number.isEmpty() || name.length()<11 || number.length()>11){
            Toast.makeText(this, "Please enter 11 digit number", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent();

            intent.setAction(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+number));

            startActivity(intent);
        }

    }

    public void nextActivity(View view) {

        name = nameET.getText().toString();

        if(name.isEmpty()){
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
            intent.putExtra(NAME,name);
            startActivity(intent);
        }



        /*startActivity(new Intent(MainActivity.this,WelcomeActivity.class));*/
    }
}