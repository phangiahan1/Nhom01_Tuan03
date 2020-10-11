package com.example.nhom01_tuan03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.security.cert.Extension;

public class Registerform extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerform);
        Button send_button = (Button) findViewById(R.id.signUpBtn);
        final EditText send_text = (EditText) findViewById(R.id.user);
        final EditText send_text1 = (EditText) findViewById(R.id.pass);
        final EditText send_text2 = (EditText) findViewById(R.id.birthdate);
        final RadioGroup send_text3 = (RadioGroup) findViewById(R.id.radio_group);
        final CheckBox send_text4 = (CheckBox) findViewById(R.id.tennisCB);
        final CheckBox send_text5 = (CheckBox) findViewById(R.id.footballCB);
        final CheckBox send_text6 = (CheckBox) findViewById(R.id.othersCB);
        // add the OnClickListener in sender button
        // after clicked this button following Instruction will run

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str3=""; // store the text corresponding to  the RadioButton which is clicked
                switch(send_text3.getCheckedRadioButtonId()) {
                    case R.id.maleRadio:
                        str3 = "Male";
                        break;
                    case R.id.femaleRadio:
                        str3 = "Female";
                        break;
                }
                String str4 = null;
                if(send_text4.isChecked() && !send_text5.isChecked() && !send_text6.isChecked()){
                    str4 = send_text4.getText().toString();
                }
                if(send_text5.isChecked() && !send_text4.isChecked() && !send_text6.isChecked()){
                   str4 = send_text5.getText().toString();
                }
                if(send_text6.isChecked() && !send_text5.isChecked() && !send_text4.isChecked()){
                  str4 = send_text6.getText().toString();
                }
                if(send_text4.isChecked() && send_text5.isChecked() && send_text6.isChecked()){
                   str4 = send_text4.getText().toString() + ", " +send_text5.getText().toString() + ", " +send_text6.getText().toString();
                }
                if(send_text4.isChecked() && send_text5.isChecked() && !send_text6.isChecked()){
                   str4 = send_text4.getText().toString() + ", " +send_text5.getText().toString();
                }
                if(send_text4.isChecked() && !send_text5.isChecked() && send_text6.isChecked()){
                    str4 = send_text4.getText().toString() + ", " +send_text6.getText().toString();
                }
                if(!send_text4.isChecked() && send_text5.isChecked() && send_text6.isChecked()){
                    str4 = send_text5.getText().toString() + ", " +send_text6.getText().toString();
                }
                // get the value which input by user in EditText
                // and convert it to string
                String str = send_text.getText().toString();
                String str1 = send_text1.getText().toString();
                String str2 = send_text2.getText().toString();

                // Create the Intent object of this class Context() to Second_activity class
                Intent intent = new Intent(getApplicationContext(), Resultform.class);

                // now by putExtra method put the value in key, value pair
                // key is message_key by this key we will receive the value, and put the string

                intent.putExtra("message_key", str);
                intent.putExtra("message_key1", str1);
                intent.putExtra("message_key2", str2);
                intent.putExtra("message_key3", str3);
                intent.putExtra("message_key4", str4);
                // start the Intent
                startActivity(intent);
            }

        });
    }

}