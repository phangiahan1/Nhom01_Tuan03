package com.example.nhom01_tuan03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send_button = (Button) findViewById(R.id.signUpBtn1);
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Create the Intent object of this class Context() to Second_activity class
                Intent intent = new Intent(getApplicationContext(), Registerform.class);

                // now by putExtra method put the value in key, value pair
                // key is message_key by this key we will receive the value, and put the string

                // start the Intent
                startActivity(intent);
            }
        });
    }
}