package codygym.vn.upload.repository;

import codygym.vn.upload.entity.Song;

import java.util.List;

public interface SongRepository {
    List<Song> findAll();
    Song findById(int id);
    void uploadSong(Song song);
}
