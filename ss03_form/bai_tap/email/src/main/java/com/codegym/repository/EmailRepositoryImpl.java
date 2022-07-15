package com.codegym.repository;

import com.codegym.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepositoryImpl implements EmailRepository {
    static List<Email> emailList;
    static List<String> sList;
    static List<Integer> iList;

    static {
        emailList = new ArrayList<>();
        emailList.add(new Email(1, "English", 20, true, "haha"));
        emailList.add(new Email(2, "Japanese", 10, false, "haha"));
        emailList.add(new Email(3, "Vietnamese", 50, true, "haha"));
        emailList.add(new Email(4, "Chinese", 5, false, "haha"));
    }

    static {
        sList = new ArrayList<>();
        sList.add("English");
        sList.add("Vietnamese");
        sList.add("Japanese");
        sList.add("Chinese");
    }

    static {
        iList = new ArrayList<>();
        iList.add(5);
        iList.add(10);
        iList.add(15);
        iList.add(25);
        iList.add(50);
        iList.add(100);
    }

    @Override
    public List<Email> showAll() {
        return emailList;
    }

    @Override
    public List<String> showString() {
        return sList;
    }

    @Override
    public List<Integer> showInteger() {
        return iList;
    }

    @Override
    public Email findId(Integer id) {
        Email email = null;
        for (Email item : emailList) {
            if (item.getId() == id) {
                email = new Email(item.getId(), item.getLanguage(), item.getPageSize(), item.isFilter(), item.getSignature());
            }
        }
        return email;
    }

    @Override
    public void edit(Integer id, Email email) {
        for (Email item : emailList) {
            if (id.equals(item.getId())) {
                item.setLanguage(email.getLanguage());
                item.setPageSize(email.getPageSize());
                item.setFilter(email.isFilter());
                item.setSignature(email.getSignature());
            }
        }
    }
}
