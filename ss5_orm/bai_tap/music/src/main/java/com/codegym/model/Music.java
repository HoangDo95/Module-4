package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Music {
    @Id
    private int id;
    private String nameSong;
    private String singer;
    private String style;
    private String linkSong;

    public Music() {
    }

    public Music(int id, String nameSong, String singer, String style, String linkSong) {
        this.id = id;
        this.nameSong = nameSong;
        this.singer = singer;
        this.style = style;
        this.linkSong = linkSong;
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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getLinkSong() {
        return linkSong;
    }

    public void setLinkSong(String linkSong) {
        this.linkSong = linkSong;
    }
}
