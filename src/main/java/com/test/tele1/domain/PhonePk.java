package com.test.tele1.domain;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;


public class PhonePk implements Serializable {

    @Size(min = 4, max = 10)
    private String phonenumber;

    private String name;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhonePk(String phonenumber, String name) {
        this.phonenumber = phonenumber;
        this.name = name;
    }


    public PhonePk()
    {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhonePk phonePk = (PhonePk) o;
        return Objects.equals(phonenumber, phonePk.phonenumber) &&
                Objects.equals(name, phonePk.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phonenumber, name);
    }
}
