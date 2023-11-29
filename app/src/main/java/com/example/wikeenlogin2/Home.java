package com.example.wikeenlogin2;



import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Mengambil ActionBar
        ActionBar actionBar = getSupportActionBar();

        // Memeriksa apakah ActionBar tidak null (untuk menghindari NullPointerException)
        if (actionBar != null) {
            // Menyembunyikan ActionBar
            actionBar.hide();
        }
        //herbal
        ImageView herbalImageView = findViewById(R.id.btnherbal);
        herbalImageView.setOnClickListener(view -> moveTo(HerbalHome.class));

        //tanaman hias
        ImageView hiasImageView = findViewById(R.id.btnhias);
        hiasImageView.setOnClickListener(view -> moveTo(TanamanHiasHome.class));

        //buah
        ImageView buahImageView = findViewById(R.id.btnbuah);
        buahImageView.setOnClickListener(view -> moveTo(BuahHome.class));

        //sayur
        ImageView sayurImageView = findViewById(R.id.btnsayur);
        sayurImageView.setOnClickListener(view -> moveTo(SayuranHome.class));

        //iconlocasi
        ImageView iconlokasiImageView = findViewById(R.id.iconlokasi);
       iconlokasiImageView.setOnClickListener(view -> moveTo(MainActivity.class));

        //artikel_1
        ImageView artikel_1ImageView = findViewById(R.id.artikelpic1);
        artikel_1ImageView.setOnClickListener(view -> moveTo(Artikel1.class));

        //artikel_2
        ImageView artikel_2ImageView = findViewById(R.id.artikelpic2);
        artikel_2ImageView.setOnClickListener(view -> moveTo(Artikel2.class));

        //artikel_3
        ImageView artikel_3ImageView = findViewById(R.id.artikelpic3);
        artikel_3ImageView.setOnClickListener(view -> moveTo(Artikel3.class));
        //KontenFavorite
        ImageView kontenfavImageView = findViewById(R.id.kontenfav);
        kontenfavImageView.setOnClickListener(view -> moveTo(KontenFavorite.class));
        //IconProfile
        ImageView profileImageView = findViewById(R.id.profile);
        profileImageView.setOnClickListener(view -> moveTo(Profile.class));
        //Iconalarm
        ImageView alarmImageView = findViewById(R.id.alarm);
      alarmImageView.setOnClickListener(view -> moveTo(alarm1.class));
        //lihatLebih
        TextView tvLihatLebih = findViewById(R.id.tv_lihatLebih);
        tvLihatLebih.setOnClickListener(view -> {
            Intent intent = new Intent(Home.this, KontenPage.class);
            startActivity(intent);
        });


    }

    private void moveTo(Class<?> destinationClass) {
        Intent intent = new Intent(Home.this, destinationClass);
        startActivity(intent);
    }

//    private void moveToSelectedActivity(String selectedItem) {
//        Class<?> destinationClass = destinationMap.get(selectedItem);
//        if (destinationClass == null) {
//            destinationClass = MainActivity.class;
//        }
//        moveTo(destinationClass);
//    }
}