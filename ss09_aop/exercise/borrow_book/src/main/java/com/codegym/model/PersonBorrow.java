package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class PersonBorrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int code;

    @ManyToMany(mappedBy = "personBorrowSet")
    private Set<Book> bookSet;

    public PersonBorrow() {
    }

    public PersonBorrow(int id, int code, Set<Book> bookSet) {
        this.id = id;
        this.code = code;
        this.bookSet = bookSet;
    }

    public int getIdP() {
        return id;
    }

    public void setIdP(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }
}
