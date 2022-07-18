package com.codegym.model;

public class Declare {
    private int stt;
    private String name;
    private String birthDay;
    private String move;
    private String starDay;
    private String outDay;
    private String other;

    public Declare() {
    }

    public Declare(int stt, String name, String birthDay, String move, String starDay, String outDay, String other) {
        this.stt = stt;
        this.name = name;
        this.birthDay = birthDay;
        this.move = move;
        this.starDay = starDay;
        this.outDay = outDay;
        this.other = other;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getStarDay() {
        return starDay;
    }

    public void setStarDay(String starDay) {
        this.starDay = starDay;
    }

    public String getOutDay() {
        return outDay;
    }

    public void setOutDay(String outDay) {
        this.outDay = outDay;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
