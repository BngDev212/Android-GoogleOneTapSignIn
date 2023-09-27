package com.tmdsimple.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    txtUserName = findViewById(R.id.txtUserName);
    //
        Intent intent = getIntent();
        String str = intent.getStringExtra("user_name");
        txtUserName.setText(str);
    //

    }
}