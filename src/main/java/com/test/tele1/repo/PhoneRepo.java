package com.test.tele1.repo;

import com.test.tele1.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepo extends JpaRepository<Phone, String>
{
    List<Phone> findByPhonenumberLike(String  phonenumber);

    Phone findByPhonenumber(String  phonenumber);
}
