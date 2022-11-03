package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button sendButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.et_username);
        password=findViewById(R.id.et_password);
        sendButton=findViewById(R.id.bt_send);

    }

    @Override
    protected void onResume() {
        super.onResume();
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName= username.getText().toString();
                String pssWord = password.getText().toString();
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("Key1", userName);
                bundle.putString("Key2", pssWord);
               intent.putExtras(bundle);
                startActivity(intent);

            }
        });



    }
}