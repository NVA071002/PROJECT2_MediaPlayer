package com.example.project2_mediaplayer;

public class Music {
    private int musicId;
    private String musicName;
    private String musicAuthor;

    private String musicImage;

    public Music(int musicId, String musicName, String musicAuthor, String musicImage) {
        this.musicId = musicId;
        this.musicName = musicName;
        this.musicAuthor = musicAuthor;
        this.musicImage = musicImage;
    }

    public Music(int musicId, String musicName, String musicAuthor) {
        this.musicId = musicId;
        this.musicName = musicName;
        this.musicAuthor = musicAuthor;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getMusicImage() {
        return musicImage;
    }

    public void setMusicImage(String musicImage) {
        this.musicImage = musicImage;
    }
}
