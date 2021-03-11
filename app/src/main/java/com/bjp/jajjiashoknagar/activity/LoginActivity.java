package com.bjp.jajjiashoknagar.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bjp.jajjiashoknagar.R;

public class LoginActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        textView = findViewById(R.id.txt_signUp);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });


//        textView = findViewById(R.id.txt_jajpal);
//
//        String text = "Jajpal Singh Jajji";
//        SpannableString ss = new SpannableString(text);
//
//        ForegroundColorSpan fcsOrange = new ForegroundColorSpan(Color.RED);
//        ForegroundColorSpan fcsGreen = new ForegroundColorSpan(Color.GREEN);
//
//        ss.setSpan(fcsOrange,1,12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        ss.setSpan(fcsGreen,13,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        textView.setText(ss);

    }
}