package com.example.paras.assignment_61;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usr,pwd;
    Button loginbtn;
    int attempts = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usr = (EditText)findViewById(R.id.usr);
        pwd = (EditText)findViewById(R.id.pwd);
        loginbtn = (Button)findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usr.getText().toString().equals("paras") && pwd.getText().toString().equals("12345678"))
                {
                    Toast.makeText(MainActivity.this,"Signing in",Toast.LENGTH_LONG).show();
                    usr.setVisibility(View.VISIBLE);
                    usr.setBackgroundColor(Color.GREEN);
                    pwd.setBackgroundColor(Color.GREEN);
                }
                else {
                    usr.setVisibility(View.VISIBLE);
                    usr.setBackgroundColor(Color.RED);
                    pwd.setBackgroundColor(Color.RED);
                    attempts--;
                    Toast.makeText(MainActivity.this,"Attempts Left:"+attempts,Toast.LENGTH_SHORT).show();
                    if(attempts == 0)
                    {
                        loginbtn.setEnabled(false);
                    }
                }

            }
        });
    }
}