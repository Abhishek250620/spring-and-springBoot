package com.vehicledb;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepo extends CrudRepository<Vehicle, Integer> {
	List<Vehicle> findByColor(String color);
	
	@Query(value="select * from vehicleboot where year>2020",nativeQuery=true)
	List<Vehicle> vehicleAfterTwenty();
	
}
