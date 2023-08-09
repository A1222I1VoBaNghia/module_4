package codygym.vn.upload.service;

import codygym.vn.upload.entity.Song;
import codygym.vn.upload.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService{
    @Autowired
    private SongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id);
    }

    @Override
    public void uploadSong(Song song) {
        songRepository.uploadSong(song);
    }
}
