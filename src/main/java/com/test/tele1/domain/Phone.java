package com.test.tele1.domain;

import com.test.tele1.util.Utils;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@IdClass(PhonePk.class)
public class Phone implements Serializable {


    @Id
    @Size(min = 4, max = 10)
    private String phonenumber;

    @Id
    private String name;



    public Phone() {

        }


    public Phone(@Size(min = 4, max = 10) String phonenumber, String name) {
        this.phonenumber = phonenumber;
        this.name = name;
    }

    public String getPhonenumber() {
        return Utils.getPrettyString(phonenumber);
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

    public Phone formatPhone(){
        this.phonenumber = Utils.getPrettyString(this.phonenumber);
        return this;
    }

}
