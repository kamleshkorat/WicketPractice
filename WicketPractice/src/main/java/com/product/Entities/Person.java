package com.product.Entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kkorat on 6/19/2015.
 */
public class Person implements Serializable {

    private String name;
    private String surname;
    private String address;
    private String eamil;
    private String postalcode;

    private Person spouse;
    private List<Person> children;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName(){
        return name+" "+surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
