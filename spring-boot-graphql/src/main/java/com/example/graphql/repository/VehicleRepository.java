package com.example.graphql.repository;

import com.example.graphql.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

    List<Vehicle> getByVehicleTypeLike(String type);
}
