package com.movieapp.demo;

public class Movies {

    private String title;
    private String genre;
    private String time;
    private int pY;

    public Movies() {
    }

    public Movies(String title, String genre, String time, int pY) {
        this.title = title;
        this.genre = genre;
        this.time = time;
        this.pY = pY;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getpY() {
        return pY;
    }

    public void setpY(int pY) {
        this.pY = pY;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", time=" + time +
                ", pY=" + pY +
                '}';
    }
}
