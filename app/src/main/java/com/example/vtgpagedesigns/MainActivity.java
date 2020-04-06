package com.example.vtgpagedesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    ImageView profile_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =findViewById(R.id.button1);
        b2 =findViewById(R.id.button2);
        b3 =findViewById(R.id.button3);
        b4 =findViewById(R.id.button4);
        b5 =findViewById(R.id.button5);

        b6 =findViewById(R.id.button6);
        b7 =findViewById(R.id.button7);
        b8 =findViewById(R.id.button8);
        b9 =findViewById(R.id.button9);

        b10 =findViewById(R.id.button10);
        b11 =findViewById(R.id.button11);
        b12 =findViewById(R.id.button12);
        b13 =findViewById(R.id.button13);
        b14 =findViewById(R.id.button14);
        profile_image = findViewById(R.id.profile_img);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,com.example.vtgpagedesigns.proflie.class);
                startActivity(intent);
            }
        });


    }
}
