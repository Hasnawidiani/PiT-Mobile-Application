package com.example.wikeenlogin2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.wikeenlogin2.fragment.ArtikelFragment;
import com.example.wikeenlogin2.fragment.VideoFragment;

public class KontenPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konten_page);

        // Mengambil ActionBar
        ActionBar actionBar = getSupportActionBar();

        // Memeriksa apakah ActionBar tidak null (untuk menghindari NullPointerException)
        if (actionBar != null) {
            // Menyembunyikan ActionBar
            actionBar.hide();
        }

        Button btn_video = findViewById(R.id.btn_video);
        Button btn_artikel = findViewById(R.id.btn_artikel);
        VideoFragment videoFragment = new VideoFragment();
        ArtikelFragment artikelFragment = new ArtikelFragment();

        setFragment(artikelFragment);

        btn_artikel.setOnClickListener(view -> {
            setFragment(artikelFragment);
            btn_artikel.setAlpha((float) 1);
            btn_video.setAlpha((float) 0.5);
        });

        btn_video.setOnClickListener(view -> {
            setFragment(videoFragment);
            btn_video.setAlpha((float) 1);
            btn_artikel.setAlpha((float) 0.5);
        });

        ImageView iv_back = findViewById(R.id.iv_Return);
        iv_back.setOnClickListener(view -> {
            finishAffinity();
            Intent back = new Intent(this, Home.class);
            startActivity(back);
        });


    }

    private void  setFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.layout_frame, fragment);
        fragmentTransaction.commit();
    }
}