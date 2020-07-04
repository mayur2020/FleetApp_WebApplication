package com.springproject.FleetApp.Repositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.FleetApp.Models.Contact;

@Repository
@ComponentScan
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
