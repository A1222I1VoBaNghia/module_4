package codygym.vn.upload.repository;

import codygym.vn.upload.entity.Song;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SongRepositoryImpl implements SongRepository{
    private static Map<Integer,Song> songMap;
    static{
        songMap = new HashMap<>();
        songMap.put(1,new Song(1,"Fast Forward","JEON SOMI", "Ballad", "FastForward-NhacCuaTui-10622256.mp3"));
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
