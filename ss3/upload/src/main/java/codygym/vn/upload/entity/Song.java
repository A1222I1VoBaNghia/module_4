package codygym.vn.upload.entity;

import java.util.List;

public class Song {
    private int id;
    private String nameSong;
    private String author;
    private List<String> formatSong;
    private String link;

    public Song(int id, String nameSong, String author, List<String> formatSong, String link) {
        this.id = id;
        this.nameSong = nameSong;
        this.author = author;
        this.formatSong = formatSong;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getFormatSong() {
        return formatSong;
    }

    public void setFormatSong(List<String> formatSong) {
        this.formatSong = formatSong;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public String displayFormatSong() {
        if (formatSong == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        boolean flag = true;
        for (String f: formatSong) {
            if (flag) {
                flag = false;
            } else {
                builder.append(",");
            }
            builder.append(f);
        }
        return builder.toString();
    }
}
