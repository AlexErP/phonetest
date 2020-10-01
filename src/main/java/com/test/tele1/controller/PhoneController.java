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

    @PostMapping
    public Phone createPhone(@RequestBody Phone phone) {
        return phoneService.create(phone.formatPhone());
    }

    @DeleteMapping
    public List<Phone>  deleteMessage(@RequestBody Phone phone)
    {
        phoneService.delete(phone.formatPhone());
        return phoneService.readAll();
    }

}
