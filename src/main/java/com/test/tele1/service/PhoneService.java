package com.test.tele1.service;

import com.test.tele1.domain.Phone;
import com.test.tele1.repo.PhoneRepo;
import com.test.tele1.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {

    @Autowired
    private PhoneRepo phoneRepo;

    // read all phones
    public List<Phone> readAll()
    {
        return phoneRepo.findAll();
    }

    // read phone
    public  List<Phone> readPhone(String phoneNumber){
        List<Phone> byPhonenumberLike = phoneRepo.findByPhonenumberLike(phoneNumber);
        return byPhonenumberLike;
    }

    public Phone findByPhonenumber(String phone){
        return phoneRepo.findByPhonenumber(phone);
    }

    // create phone
    public Phone create(Phone phone){

        return phoneRepo.save(phone);

        }

    //delete phone
    public void delete (Phone p){
        phoneRepo.delete(p);
    }


}
