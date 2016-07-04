package com.example.user.test;

/**
 * Created by user on 2016-05-24.
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends MainActivity implements OnClickListener {
    Button button_intent;
    TextView txt_next;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        String name = intent.getStringExtra("edit_name");

        txt_next = (TextView)findViewById(R.id.txt_next);
        txt_next.setText(name);

        button_intent = (Button)findViewById(R.id.button_intent);
        button_intent.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
