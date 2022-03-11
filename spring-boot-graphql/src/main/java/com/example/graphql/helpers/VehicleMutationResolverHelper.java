package com.example.graphql.helpers;

import com.example.graphql.dtos.VehicleDto;
import com.example.graphql.entity.Vehicle;

import java.util.Date;

public class VehicleMutationResolverHelper {

    public static Vehicle dtoToEntity(VehicleDto vehicleDto){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleType(vehicleDto.getVehicleType());
        vehicle.setBrandName(vehicleDto.getBrandName());
        vehicle.setLaunchDate(new Date());
        vehicle.setModelCode(vehicleDto.getModelCode());

        return vehicle;
    }
}
