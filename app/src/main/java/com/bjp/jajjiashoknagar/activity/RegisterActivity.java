package com.bjp.jajjiashoknagar.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bjp.jajjiashoknagar.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
    }
}