package codygym.vn.upload.entity;

import javafx.scene.media.AudioTrack;

import java.util.List;

public class Song {
    private int id;
    private String nameSong;
    private String singer;
    private String category;
    private String link;

    public Song(int id, String nameSong, String singer, String category, String link) {
        this.id = id;
        this.nameSong = nameSong;
        this.singer = singer;
        this.category = category;
        this.link = link;
    }

    public Song() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public String getFormatSong(Song song){
        int endString = song.getLink().length();
        int startString = endString-4;
        return song.getLink().substring(startString,endString);
    }

}
