package com.codegym.repository;

import com.codegym.model.Declare;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DeclareRepositoryImpl implements DeclareRepository {
    static List<Declare> declareList = new ArrayList<>();
    static String[] birthDayList = new String[]{"1995", "1996", "1997"};
    static String[] moveList = new String[]{"bay", "tàu", "ô tô", "khác"};
    static String[] starDayList = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9",};
    static String[] endDayList = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9",};

    static {
        declareList.add(new Declare(1, "Hoang", "1995", "oto", "10", "20", "Da Nang"));
        declareList.add(new Declare(2, "Hai", "1996", "tau", "11", "21", "Quang Nam"));
        declareList.add(new Declare(3, "Huy", "1997", "bay", "12", "22", "Hue"));
    }

    @Override
    public List<Declare> showList() {
        return declareList;
    }

    @Override
    public String[] showBirthDay() {
        return birthDayList;
    }

    @Override
    public String[] showMove() {
        return moveList;
    }

    @Override
    public String[] showStarDay() {
        return starDayList;
    }

    @Override
    public String[] showEndDay() {
        return endDayList;
    }

    @Override
    public void create(Declare declare) {
        declareList.add(declare);
    }

    @Override
    public Declare findByID(int stt) {
        Declare declare = null;
        for (Declare item : declareList) {
            if (item.getStt() == stt) {
                declare = new Declare(item.getStt(),item.getName(),item.getBirthDay(),item.getMove(),item.getStarDay(),item.getOutDay(),item.getOther());
            }
        }
        return declare;
    }

    @Override
    public void edit(int stt, Declare declare) {
        for (Declare item : declareList) {
            if (item.getStt() == stt) {
                item.setName(declare.getName());
                item.setMove(declare.getMove());
                item.setStarDay(declare.getStarDay());
                item.setOutDay(declare.getOutDay());
                item.setOther(declare.getOther());
            }
        }
    }
}
