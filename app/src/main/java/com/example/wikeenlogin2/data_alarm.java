package com.example.wikeenlogin2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class data_alarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_alarm);

        // Mendapatkan referensi ke TextView
        TextView namaTanamanTextView = findViewById(R.id.nama_tanaman);
        TextView alarmTimeTextView = findViewById(R.id.alarm_time);
        TextView dayTanamanTextView = findViewById(R.id.day_tanaman);

        // Mengatur teks secara dinamis
        namaTanamanTextView.setText("Wortel");
        alarmTimeTextView.setText("23:20");
        dayTanamanTextView.setText("Setiap Hari");

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
                Intent intent = new Intent(data_alarm.this, Home.class);
                startActivity(intent);
            }
        });
    }


}
