package com.example.rajkotcity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView travel,hotel,tourism,fro,culture,food,education,language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        travel = findViewById(R.id.Travel);
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TravelActivity.class));
            }
        });

        hotel=findViewById(R.id.Hotel);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HotelActivity.class));
            }
        });

        tourism=findViewById(R.id.Tourism);
        tourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,turisiumActivity.class));
            }
        });

        fro=findViewById(R.id.FRO);
        fro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FROActivity.class));
            }
        });

        culture=findViewById(R.id.Culture);
        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,culturActivity.class));
            }
        });

        food=findViewById(R.id.Food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FoodActivity.class));
            }
        });

        education=findViewById(R.id.Education);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,EducationActivity.class));
            }
        });

        language=findViewById(R.id.Language);
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LanguageActivity.class));
            }
        });
    }
}