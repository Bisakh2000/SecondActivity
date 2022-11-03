package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView user,pass;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        user=findViewById(R.id.username);
        pass=findViewById(R.id.password);

        Bundle bundle = getIntent().getExtras();
        user.setText(bundle.getString("Key1","default values"));
        pass.setText(bundle.getString("Key2","default value"));

    }
}