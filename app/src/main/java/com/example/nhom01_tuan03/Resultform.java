package com.example.nhom01_tuan03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultform extends Activity {

    TextView receiver_msg;
    TextView receiver_msg1;
    TextView receiver_msg2;
    TextView receiver_msg3;
    TextView receiver_msg4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultform);
        receiver_msg = (TextView)findViewById(R.id.viewRecive);
        receiver_msg1 = (TextView)findViewById(R.id.viewReceive1);
        receiver_msg2 = (TextView)findViewById(R.id.viewReceive2);
        receiver_msg3 = (TextView)findViewById(R.id.viewReceive3);
        receiver_msg4 = (TextView)findViewById(R.id.viewReceive4);
        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str = intent.getStringExtra("message_key");
        String str1 = intent.getStringExtra("message_key1");
        String str2 = intent.getStringExtra("message_key2");
        String str3 = intent.getStringExtra("message_key3");
        String str4 = intent.getStringExtra("message_key4");

        // display the string into textView
        receiver_msg.setText(str);
        receiver_msg1.setText(str1);
        receiver_msg2.setText(str2);
        receiver_msg3.setText(str3);
        receiver_msg4.setText(str4);
    }
}