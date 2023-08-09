package codygym.vn.upload.service;

import codygym.vn.upload.entity.Song;

import java.util.List;

public interface SongService{
    List<Song> findAll();
    Song findById(int id);
    void uploadSong(Song song);
}
