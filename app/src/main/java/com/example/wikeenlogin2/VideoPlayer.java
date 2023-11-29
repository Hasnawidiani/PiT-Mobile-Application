package com.example.wikeenlogin2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

public class VideoPlayer extends AppCompatActivity {
    private SimpleExoPlayer exoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        String linkYgDiterima = "";
        String title = "";


        Intent intent = getIntent();
        if (intent.hasExtra("KEYDATA") && intent.hasExtra("KEYJUDUL")) {
            linkYgDiterima = intent.getStringExtra("KEYDATA");
            title = intent.getStringExtra("KEYJUDUL");

            Log.e("erorr?" , linkYgDiterima);

        }

        // Mengambil ActionBar
        ActionBar actionBar = getSupportActionBar();

        // Memeriksa apakah ActionBar tidak null (untuk menghindari NullPointerException)
        if (actionBar != null) {
            // Menyembunyikan ActionBar
            actionBar.hide();
        }

        TextView tv_title = findViewById(R.id.tv_title);
        ImageView iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(view -> {
            finish();
            exoPlayer.stop();
            Intent back = new Intent(this, KontenPage.class);
            startActivity(back);
        });
        tv_title.setText(title);

        exoPlayer = new SimpleExoPlayer.Builder(this).build();

        MediaItem mediaItem = MediaItem.fromUri(linkYgDiterima);

        exoPlayer.setMediaItem(mediaItem);
        exoPlayer.prepare();

        PlayerView playerView = findViewById(R.id.playerView);
        playerView.setPlayer(exoPlayer);

        exoPlayer.play();



    }

    public void onBackPressed() {
        exoPlayer.stop();
        super.onBackPressed();
    }


}