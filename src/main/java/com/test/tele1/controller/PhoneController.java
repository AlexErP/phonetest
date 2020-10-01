package com.test.tele1.controller;

import com.test.tele1.domain.Phone;
import com.test.tele1.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("phones")
public class PhoneController {

    @Autowired
    private PhoneService  phoneService;

    @GetMapping
    public List<Phone> readAllPones(){
        List<Phone> phones = phoneService.readAll();
        return phones;
    }

    @GetMapping("/{phonepumber}")
    public List<Phone> readOne(@PathVariable String phonepumber)
    {
        List<Phone> phones = phoneService.readPhone(phonepumber+"%");
        return phones;
    }


    @PutMapping("/{phonepumber}")
    public Phone updatePhone(@PathVariable String phonepumber, @RequestBody Phone phone){

        return phoneService.update(phonepumber,phone);
    }

    @PostMapping
    public Phone createPhone(@RequestBody Phone phone) {
        return phoneService.create(phone);
    }


    @DeleteMapping("/{phonenumber}")
    public void deleteMessage(@PathVariable String phonenumber)
    {
        Phone it = phoneService.findByPhonenumber(phonenumber);
        phoneService.delete(it);
    }

}
