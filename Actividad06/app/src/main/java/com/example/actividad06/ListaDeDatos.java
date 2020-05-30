package com.example.actividad06;
//package example.javatpoint.com.recyclerviewlist;
public class ListaDeDatos{
    private String description;
    private int imgId;
    public ListaDeDatos(String description, int imgId) {
        this.description = description;
        this.imgId = imgId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}