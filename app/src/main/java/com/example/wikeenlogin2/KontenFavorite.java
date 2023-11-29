package com.example.wikeenlogin2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class KontenFavorite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konten_favorite);

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
                Intent intent = new Intent(KontenFavorite.this, Home.class);
                startActivity(intent);
            }
        });
    }

    // Method untuk pindah ke activity tertentu
    private void moveTo(Class<?> cls) {
        Intent intent = new Intent(KontenFavorite.this, cls);
        startActivity(intent);
    }
}
