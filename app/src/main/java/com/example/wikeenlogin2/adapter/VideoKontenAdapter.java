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

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.wikeenlogin2.R;
import com.example.wikeenlogin2.VideoPlayer;
import com.example.wikeenlogin2.model.Kontent;

import java.util.ArrayList;
import java.util.List;

public class VideoKontenAdapter extends RecyclerView.Adapter<VideoKontenAdapter.ViewHolder> {


    private Context context;
    private List<Kontent> kontentList;

    public VideoKontenAdapter(Context context, List<Kontent> kontentList) {
        this.context = context;
        if(kontentList == null){
            this.kontentList = new ArrayList<>();
        }else {
            this.kontentList = kontentList;
        }
    }

    @NonNull
    @Override
    public VideoKontenAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_video, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoKontenAdapter.ViewHolder holder, int position) {
        Kontent kontent = kontentList.get(position);

        if(kontent != null){

            Glide.with(context)
                    .load(kontent.getCoverImg()) // URL gambar dari kontent
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .into(holder.coverImg);

//           holder.coverImg.setImageResource(R.drawable.img_default);
            holder.txt_judul.setText(kontent.getJudul());
            holder.iv_favorite.setVisibility(kontent.getFavorite()? View.VISIBLE : View.GONE);

            holder.btn_kontenVideo.setOnClickListener(view -> {
                String videoLink = kontent.getLink();
//               Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoLink));
//               view.getContext().startActivity(intent);
                Intent intent = new Intent(this.context, VideoPlayer.class)
                        .putExtra("KEYDATA", videoLink)
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
        LinearLayout btn_kontenVideo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            coverImg = itemView.findViewById(R.id.iv_coverImg);
            txt_judul = itemView.findViewById(R.id.tv_judul);
            iv_favorite = itemView.findViewById(R.id.iv_favorite);
            btn_kontenVideo = itemView.findViewById(R.id.btn_kontenVideo);

        }
    }
}
