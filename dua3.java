package com.example.javaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dua3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua3);
        Button back2= (Button) findViewById(R.id.button3);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent
                Intent intent = new Intent(dua3.this, MainActivity.class);
                // start activity
                startActivity(intent);
            }
        });
    }
}