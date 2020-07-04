package com.springproject.FleetApp.Repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.FleetApp.Models.InvoiceStatus;

@Repository
@ComponentScan
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

}
