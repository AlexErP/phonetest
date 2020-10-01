package com.test.tele1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Phone {

    @Id
    private String phonenumber;

    private String name;

    public Phone() {

        }

    public Phone(String phoneNumber, String name) {
        this.phonenumber = phoneNumber;
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phoneNumber) {
        this.phonenumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
