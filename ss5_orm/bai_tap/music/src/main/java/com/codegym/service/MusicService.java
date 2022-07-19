package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface MusicService {

    List<Music> showList();

    void create(Music music);

    Music findById(int id);

    void edit(Music music);

    void delete(int id);
}
