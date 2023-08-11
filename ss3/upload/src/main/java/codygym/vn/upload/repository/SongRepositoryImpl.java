package codygym.vn.upload.repository;

import codygym.vn.upload.entity.Song;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SongRepositoryImpl implements SongRepository{
    private static Map<Integer,Song> songMap;
    static{
        songMap = new HashMap<>();
        songMap.put(1,new Song(1,"Fast Forward","JEON SOMI", Collections.singletonList(".mp3"),"codygym/vn/upload/entity/data/FastForward-NhacCuaTui-10622256.mp3"));
        songMap.put(2,new Song(2,"Huế xưa","Châu Kỳ", Collections.singletonList(".m4p"),"https://zingmp3.vn/bai-hat/Hue-Xua-Van-Khanh/ZW6UCCD7.html"));
        songMap.put(3,new Song(3,"Ai ra Xứ Huế","Phú Quang", Collections.singletonList(".wav"),"https://mp3.zing.vn/bai-hat/Ai-Ra-Xu-Hue-Ai-Van/ZWZ9FD7D.html"));
    }
    @Override
    public List<Song> findAll() {
        return new ArrayList<>(songMap.values());
    }

    @Override
    public Song findById(int id) {
        return songMap.get(id);
    }

    @Override
    public void uploadSong(Song song) {
        if (!songMap.containsKey(song.getId())) {
            songMap.put(song.getId(), song);
        }
    }
}
