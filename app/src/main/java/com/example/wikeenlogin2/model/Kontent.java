package com.example.wikeenlogin2.model;

import androidx.annotation.Nullable;

public class Kontent {
    private String judul;
    private String link;
    private String coverImg;
    private Boolean isFavorite;


    public Kontent(@Nullable String judul, @Nullable String link, @Nullable String coverImg, @Nullable Boolean isFavorite) {
        this.judul = judul;
        this.link = link;
        this.coverImg = coverImg;
        this.isFavorite = isFavorite;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }


}
