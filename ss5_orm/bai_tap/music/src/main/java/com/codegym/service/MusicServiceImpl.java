package com.codegym.service;

import com.codegym.model.Music;
import com.codegym.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    MusicRepository musicRepository;

    @Override
    public List<Music> showList() {
        return musicRepository.showList();
    }

    @Override
    public void create(Music music) {
        musicRepository.create(music);
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id);
    }

    @Override
    public void edit(Music music) {
        musicRepository.edit(music);
    }

    @Override
    public void delete(int id) {
        musicRepository.delete(id);
    }
}
