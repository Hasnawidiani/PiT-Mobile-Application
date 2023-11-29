package com.example.wikeenlogin2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wikeenlogin2.Artikel1;
import com.example.wikeenlogin2.R;
import com.example.wikeenlogin2.model.Kontent;

import java.util.ArrayList;
import java.util.List;

public class ArtikelKontenAdapter extends RecyclerView.Adapter<ArtikelKontenAdapter.ViewHolder> {


    private Context context;
    private List<Kontent> kontentList;

    public ArtikelKontenAdapter(Context context, List<Kontent> kontentList) {
        this.context = context;
        if(kontentList == null){
            this.kontentList = new ArrayList<>();
        }else {
            this.kontentList = kontentList;
        }
    }

    @NonNull
    @Override
    public ArtikelKontenAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_artikel, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Kontent kontent = kontentList.get(position);

        if(kontent != null){

            holder.coverImg.setImageResource(R.drawable.cover_artikel);
            holder.txt_judul.setText(kontent.getJudul());
            holder.iv_favorite.setVisibility(kontent.getFavorite()? View.VISIBLE : View.GONE);

            holder.btn_kontenArtikel.setOnClickListener(view -> {
                String gambar = kontent.getCoverImg();
                Intent intent = new Intent(this.context, Artikel1.class)
                        .putExtra("GAMBAR", gambar)
                        .putExtra("KEYJUDUL", kontent.getJudul());
                view.getContext().startActivity(intent);
            });
        }


    }

    @Override
    public int getItemCount() {
        return kontentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView coverImg;
        TextView txt_judul;
        ImageView iv_favorite;
        LinearLayout btn_kontenArtikel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            coverImg = itemView.findViewById(R.id.iv_coverArtikel);
            txt_judul = itemView.findViewById(R.id.tv_judulArtikel);
            iv_favorite = itemView.findViewById(R.id.iv_favoriteArtikel);
            btn_kontenArtikel = itemView.findViewById(R.id.btn_kontenArtikel);

        }
    }
}
