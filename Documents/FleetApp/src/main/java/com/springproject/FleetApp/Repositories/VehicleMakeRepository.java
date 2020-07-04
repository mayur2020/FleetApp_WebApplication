package com.springproject.FleetApp.Repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.FleetApp.Models.VehicleMake;

@Repository
@ComponentScan
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
