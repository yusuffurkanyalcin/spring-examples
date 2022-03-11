package com.example.graphql.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.entity.Vehicle;
import com.example.graphql.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * GET operations
 */

@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles(String type){
        return vehicleRepository.getByVehicleTypeLike(type);
    }

    public Optional<Vehicle> getByID(int id){
        return vehicleRepository.findById(id);
    }

}
