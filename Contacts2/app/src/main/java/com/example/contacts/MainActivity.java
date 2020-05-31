package com.example.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.loginbtn);

        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)
            {
                Intent i = new Intent(getBaseContext(), SecondAct.class);
                startActivity(i);
            }
        });
    }
}
