package com.eazybytes.eazyschool.Repository;

import com.eazybytes.eazyschool.model.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact,Integer> {
    List<Contact> findByStatus(String status);
}