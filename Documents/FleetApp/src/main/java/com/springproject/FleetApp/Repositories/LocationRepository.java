package com.springproject.FleetApp.Repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.FleetApp.Models.Location;

@Repository
@ComponentScan
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
