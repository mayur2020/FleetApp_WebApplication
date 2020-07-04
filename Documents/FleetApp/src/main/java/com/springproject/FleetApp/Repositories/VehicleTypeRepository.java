package com.springproject.FleetApp.Repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springproject.FleetApp.Models.VehicleType;

@Repository
@ComponentScan
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
