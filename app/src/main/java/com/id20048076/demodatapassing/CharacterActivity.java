package com.id20048076.demodatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CharacterActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        tv = findViewById(R.id.textView);
        Intent i = getIntent();
        Character c = i.getCharExtra("character",'z');
        tv.setText("Character value received is: a");
    }
}