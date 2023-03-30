package com.example.javaactivity;

import static com.example.javaactivity.R.id.imageView3;
import static com.example.javaactivity.R.id.imageView4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imgb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgb=(ImageButton) findViewById(R.id.imageView2);

        imgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Toast.makeText(MainActivity.this, "deleted 1", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton img = (ImageButton) findViewById(imageView3);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "deleted 2", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton imga ;
                imga= (ImageButton) findViewById(imageView4);

        imga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "deleted 3", Toast.LENGTH_SHORT).show();
            }
        });
        Button btn1= (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent
                Intent intent = new Intent(MainActivity.this,dua1.class);
                // start activity
                startActivity(intent);
            }
        });
        Button btn2= (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent
                Intent intent = new Intent(MainActivity.this,dua2.class);
                // start activity
                startActivity(intent);
            }
        });
        Button btn3= (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent
                Intent intent = new Intent(MainActivity.this,dua3.class);
                // start activity
                startActivity(intent);
            }
        });
    }
}