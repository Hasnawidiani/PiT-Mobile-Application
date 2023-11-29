package com.example.wikeenlogin2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TimePicker;

public class add_alarm extends AppCompatActivity {

    EditText editText;
    TimePicker timePicker;
    int jam, menit;
    AppCompatCheckBox everyday;
    CheckBox minggu, senin, selasa, rabu, kamis, jumat, sabtu;
    Button btn_no, btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_alarm);

        // Mengambil ActionBar
        ActionBar actionBar = getSupportActionBar();

        // Memeriksa apakah ActionBar tidak null (untuk menghindari NullPointerException)
        if (actionBar != null) {
            // Menyembunyikan ActionBar
            actionBar.hide();
        }

        editText = findViewById(R.id.edit_alarm_name);
        timePicker = findViewById(R.id.tv_timepicker);
        everyday = findViewById(R.id.every_day);
        btn_no = findViewById(R.id.btn_batal);
        btn_save = findViewById(R.id.btn_simpan);



        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hourOfDay, int minute) {
                jam = hourOfDay;
                menit = minute;
            }
        });

        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(add_alarm.this, alarm1.class);
                startActivity(intent);
            }
        });

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(add_alarm.this, data_alarm.class);
                startActivity(intent);
            }
        });

    }
}