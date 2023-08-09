package com.cinar.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    ConstraintLayout cls;
    CheckedTextView chck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton);
        cls = findViewById(R.id.cls);
        chck = findViewById(R.id.checkedTextView);

    imageButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"İmage button clicked",Toast.LENGTH_LONG).show();
            cls.setBackgroundColor(Color.BLUE);
            chck.setText("İmage button clicked");
            chck.setTextSize(34);


        }
    });
    }
}