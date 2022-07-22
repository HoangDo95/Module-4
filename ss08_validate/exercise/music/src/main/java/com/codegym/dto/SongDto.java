package com.codegym.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
//^[a-zA-Z\\s\\d\\p{L}]+$
public class SongDto {
    private int id;
    @NotBlank
    @Size(max = 800)
    @Pattern(regexp = "^[a-zA-Z\\\\s\\\\d\\\\p{L}]+$")
    private String name;
    @NotBlank
    @Size(max = 300)
    @Pattern(regexp = "[@&'(\\\\\\\\s)<>#]\"")
    private String singer;
    @NotBlank
    @Size(max = 1000)
    @Pattern(regexp = "[@&'(\\\\\\\\s)<>#]\"")
    private String style;

    public SongDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public SongDto(int id, String name, String singer, String style) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.style = style;
    }
}
