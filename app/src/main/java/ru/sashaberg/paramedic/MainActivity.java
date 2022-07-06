package ru.sashaberg.paramedic;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBaby(View view) {
        Intent intent = new Intent(this, BabyMenu.class);
        startActivity(intent);
    }
    public void onClickKids(View view) {
        Intent intent = new Intent(this, KidsMenu.class);
        startActivity(intent);
    }
    public void onClickTeens(View view) {
        Intent intent = new Intent(this, TeensMenu.class);
        startActivity(intent);
    }

}