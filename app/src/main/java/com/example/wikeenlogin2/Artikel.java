package com.example.wikeenlogin2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Artikel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel1);

        ImageView iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            finish();
            Intent back = new Intent(this, KontenPage.class);
            startActivity(back);
        });
    }
}