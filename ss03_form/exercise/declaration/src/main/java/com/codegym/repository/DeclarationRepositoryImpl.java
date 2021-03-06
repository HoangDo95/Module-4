package com.codegym.repository;

import com.codegym.model.Declaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DeclarationRepositoryImpl implements DeclarationRepository {
    static List<Declaration> declarationList = new ArrayList<>();
    String[] year = new String[]{"1989", "1990", "...", "2022"};
    String[] gender = new String[]{"Male", "Female", "Other"};
    String[] nationality = new String[]{"Viet Nam", "Lao", "Campuchia"};
    String[] transportType = new String[]{"Phane", "Car", "Boat", "Other"};
    String[] inputDay = new String[]{"1", "2", "3", "4", "...", "30"};
    String[] outDay = new String[]{"1", "2", "3", "4", "...", "30"};
    String[] inputMonth = new String[]{"1", "2", "3", "4", "...", "12"};
    String[] outMonth = new String[]{"1", "2", "3", "4", "...", "12"};
    String[] inputYear = new String[]{"2019", "2020", "2021", "2022"};
    String[] outYear = new String[]{"2019", "2020", "2021", "2022"};

    static {
        declarationList.add(new Declaration(1, "Hoang", "1995", "Male", "Viet Nam", "123456789", "car", "43A-99999", "3", "1", "2", "2021", "2", "3", "2021", "Da Nang"));
    }

    @Override
    public List<Declaration> showList() {
        return declarationList;
    }

    @Override
    public String[] getBirthYear() {
        return year;
    }

    @Override
    public String[] getGender() {
        return gender;
    }

    @Override
    public String[] getNational() {
        return nationality;
    }

    @Override
    public String[] getTransportType() {
        return transportType;
    }


    @Override
    public String[] getInputDay() {
        return inputDay;
    }

    @Override
    public String[] getInputMonth() {
        return inputMonth;
    }

    @Override
    public String[] getInputYear() {
        return inputYear;
    }

    @Override
    public String[] getOutDay() {
        return outDay;
    }

    @Override
    public String[] getOutMonth() {
        return outMonth;
    }

    @Override
    public String[] getOutYear() {
        return outYear;
    }

    @Override
    public void create(Declaration declaration) {
        declarationList.add(declaration);
    }

    @Override
    public Declaration findId(int id) {
        Declaration declaration = null;
        for(Declaration item : declarationList){
            if(item.getId() == id){
                declaration = new Declaration(item.getId(),item.getName(),item.getBirthYear(),item.getGender(),
                        item.getNational(),item.getIdCard(),item.getTransportType(),item.getTransportId(),
                        item.getSeat(),item.getInputDay(),item.getInputMonth(),item.getInputYear(),
                        item.getOutDay(),item.getOutMonth(),item.getOutYear(),item.getOther());
            }
        }
        return declaration;
    }

    @Override
    public void edit(int id, Declaration declaration) {
        for (Declaration item : declarationList) {
            if(item.getId() == id){
                item.setName(declaration.getName());
                item.setBirthYear(declaration.getBirthYear());
                item.setGender(declaration.getGender());
                item.setNational(declaration.getNational());
                item.setIdCard(declaration.getIdCard());
                item.setTransportType(declaration.getTransportType());
                item.setTransportId(declaration.getTransportId());
                item.setSeat(declaration.getSeat());
                item.setInputDay(declaration.getInputDay());
                item.setInputMonth(declaration.getInputMonth());
                item.setInputYear(declaration.getInputYear());
                item.setOutDay(declaration.getOutDay());
                item.setOutMonth(declaration.getOutMonth());
                item.setOutYear(declaration.getOutYear());
                item.setOther(declaration.getOther());
            }
        }
    }
}
