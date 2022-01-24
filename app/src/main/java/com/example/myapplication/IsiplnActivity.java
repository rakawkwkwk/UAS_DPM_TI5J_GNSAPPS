package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class IsiplnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isipln);
    }
    public void onBackClick(View view){
        startActivity(new Intent(this,DashbordActivity.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);

    }
    public void onDashbordClick(View View){
        startActivity(new Intent(this,DashbordActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
}