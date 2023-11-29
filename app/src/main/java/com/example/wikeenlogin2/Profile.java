package com.example.wikeenlogin2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Mengambil ActionBar
        ActionBar actionBar = getSupportActionBar();

        // Memeriksa apakah ActionBar tidak null (untuk menghindari NullPointerException)
        if (actionBar != null) {
            // Menyembunyikan ActionBar
            actionBar.hide();
        }

        // Inisialisasi ImageView arrowBack di dalam onCreate()
        ImageView arrowBack = findViewById(R.id.arrowback);

        // Setup onClickListener for arrowBack
        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click on the arrow back image
                Intent intent = new Intent(Profile.this, Home.class);
                startActivity(intent);
            }
        });
    }
}
