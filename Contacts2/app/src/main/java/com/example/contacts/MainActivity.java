package com.example.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        btn = (Button)findViewById(R.id.loginbtn);

        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)
            {

                Intent i = new Intent(getBaseContext(), SecondAct.class);

                if(username.getText().toString().equals("Lockhart85") && password.getText().toString().equals("12345678")){
                    Toast.makeText(MainActivity.this, "Log In Successful!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }

                else if(TextUtils.isEmpty(username.getText().toString())){
                    Toast.makeText(MainActivity.this, "Username cannot be empty", Toast.LENGTH_SHORT).show();
                }

                else if(TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(MainActivity.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
                }

                else if(TextUtils.isEmpty(username.getText().toString()) && TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(MainActivity.this, "Empty fields", Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
