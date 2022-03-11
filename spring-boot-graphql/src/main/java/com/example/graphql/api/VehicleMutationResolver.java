package com.example.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.dtos.VehicleDto;
import com.example.graphql.entity.Vehicle;
import com.example.graphql.helpers.VehicleMutationResolverHelper;
import com.example.graphql.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * SAVE , UPDATE operations
 */

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDto vehicleDto){
        return vehicleRepository.save(VehicleMutationResolverHelper.dtoToEntity(vehicleDto));
    }

}
