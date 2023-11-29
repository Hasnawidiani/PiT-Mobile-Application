package com.example.wikeenlogin2;

import android.content.Intent;
import android.os.AsyncTask;
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
import java.util.HashMap;
import java.util.Map;

public class Herbal extends AppCompatActivity {

    private Map<String, Class<?>> destinationMap = new HashMap<>();
    private String selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herbal);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        setupSpinnerAndButton(R.id.spinnerLokasi, R.id.btnlokasi, R.array.lokasi, "SpinnerLokasi");
        setupSpinnerAndButton(R.id.spinnerJenis, R.id.btnjenis, R.array.jenis, "SpinnerJenis");

        initDestinationMap();
        //arugula
        ImageView arugulaImageView = findViewById(R.id.arugula);
        arugulaImageView.setOnClickListener(view -> moveTo(Arugula.class));
        //Seledri
        ImageView seledriImageView = findViewById(R.id.seledri);
        seledriImageView.setOnClickListener(view -> moveTo(Seledri.class));
        //BitMerah
        ImageView bitmerahImageView = findViewById(R.id.bitmerah);
        bitmerahImageView.setOnClickListener(view -> moveTo(Bit.class));
        //Brusel
        ImageView bruselImageView = findViewById(R.id.brusel);
        bruselImageView.setOnClickListener(view -> moveTo(Brusel.class));
        //Kemangi
        ImageView kemangiImageView = findViewById(R.id.kemangi);
        bruselImageView.setOnClickListener(view -> moveTo(Kemangi.class));
        //Koriander
        ImageView wortelImageView = findViewById(R.id.koriander);
        wortelImageView.setOnClickListener(view -> moveTo(Koriander.class));
        //Bawang Putih
        ImageView bawangputihImageView = findViewById(R.id.bawangputih);
       bawangputihImageView.setOnClickListener(view -> moveTo(BawangPutih.class));
     //Jahe
        ImageView jaheImageView = findViewById(R.id.jahe);
        jaheImageView.setOnClickListener(view -> moveTo(Jahe.class));


        // Implementasikan ImageView untuk tanaman lainnya
        // ...

        ImageView arrowBack = findViewById(R.id.arrowback);
        arrowBack.setOnClickListener(view -> moveTo(Home.class));
    }

    private void initDestinationMap() {
        destinationMap.put("Utara", MainActivity.class);
        destinationMap.put("Selatan", Selatan.class);
        destinationMap.put("Herbal", Herbal.class);
        destinationMap.put("Tanaman Hias", TanamanHias.class);
        destinationMap.put("Buah-buahan", Buah.class);
        destinationMap.put("Sayuran", Sayuran.class);
    }

    private void setupSpinnerAndButton(int spinnerId, int buttonId, int arrayId, final String logTag) {
        Spinner spinner = findViewById(spinnerId);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                arrayId,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                selectedItem = adapterView.getItemAtPosition(position).toString();
                Log.d(logTag, "Selected: " + selectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Tidak melakukan apa-apa
            }
        });

        Button button = findViewById(buttonId);
        button.setOnClickListener(view -> {
            if (selectedItem != null) {
                showConfirmationDialog(selectedItem);
            }
        });
    }

    private void showConfirmationDialog(final String selectedItem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Konfirmasi");
        builder.setMessage("Anda yakin ingin pindah melihat rekomendasi tanaman " + selectedItem + "?");

        builder.setPositiveButton("Ya", (dialogInterface, i) -> moveToSelectedActivity(selectedItem));

        builder.setNegativeButton("Batal", (dialogInterface, i) -> {
            // Tidak melakukan apa-apa
        });

        builder.show();
    }

    private void moveToSelectedActivity(String selectedItem) {
        Class<?> destinationClass = destinationMap.get(selectedItem);
        if (destinationClass == null) {
            destinationClass = MainActivity.class;
        }
        moveTo(destinationClass);
    }

    private void handleItemClick(Class<?> destinationClass) {
        showConfirmationDialog(destinationClass.getSimpleName());
    }

    private void moveTo(Class<?> destinationClass) {
        Intent intent = new Intent(Herbal.this, destinationClass);
        startActivity(intent);
        finish();
    }

    private class LongTaskAsync extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            simulateLongTask();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            runOnUiThread(() -> {
                showConfirmationDialog(selectedItem);
            });
        }

        private void simulateLongTask() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}