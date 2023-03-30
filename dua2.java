package com.example.javaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dua2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua2);
        Button back1= (Button) findViewById(R.id.button1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent
                Intent intent = new Intent(dua2.this, MainActivity.class);
                // start activity
                startActivity(intent);
            }
        });
    }
}