package com.example.user.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button button_intent;
    EditText txt_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_main = (EditText)findViewById(R.id.txt_main);
        button_intent = (Button)findViewById(R.id.button_intent);
        button_intent.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, NextActivity.class);
        intent.putExtra("edit_name", txt_main.getText().toString());
        startActivity(intent);
        finish();
    }
}
