package com.codegym.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int count;

    @ManyToMany
    @JoinTable(name = "borrow_book", joinColumns = @JoinColumn(name = "id_b"), inverseJoinColumns = @JoinColumn(name = "id_p"))
    private Set<PersonBorrow> personBorrowSet;

    public Book() {
    }

    public Book(int id, String name, int count, Set<PersonBorrow> personBorrowSet) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.personBorrowSet = personBorrowSet;
    }

    public int getId() {
        return id;
    }

    public void setIdB(int idB) {
        this.id = id;
    }

    public String getNameB() {
        return name;
    }

    public void setNameB(String nameB) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Set<PersonBorrow> getPersonBorrowSet() {
        return personBorrowSet;
    }

    public void setPersonBorrowSet(Set<PersonBorrow> personBorrowSet) {
        this.personBorrowSet = personBorrowSet;
    }
}
