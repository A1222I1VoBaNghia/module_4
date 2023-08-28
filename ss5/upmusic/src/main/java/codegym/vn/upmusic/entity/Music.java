package codegym.vn.upmusic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "music")
public class Music {
    @Id
    @Column(name = "music_id",columnDefinition = "varchar(15)")
    private String id;
    private String name;
    private String singer;
    private String category;
    private String link;

    public Music() {
    }

    public Music(String id, String name, String singer, String category, String link) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.category = category;
        this.link = link;
    }
}
