package com.API.parkingcontrol.service;

//Usado para implementar as regras de negócio

import com.API.parkingcontrol.model.ParkingSpotModel;
import com.API.parkingcontrol.repository.ParkingSpotRepository;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {
    //Controller aciona o service > service aciona o repository e azciona a base de dados


    //ingeção de dependencia

    final ParkingSpotRepository parkingSpotRepository; //implementando outra classe

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional  //Acaso algo dê errado, ele roda novamente sem quebrar nenhum dado
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
