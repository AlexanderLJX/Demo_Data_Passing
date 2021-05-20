package com.id20048076.demodatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntegerActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integer);

        tv = findViewById(R.id.textView);
        Intent i = getIntent();
        int num = i.getIntExtra("integer",0);
        tv.setText("Integer value received is: "+num);

    }
}