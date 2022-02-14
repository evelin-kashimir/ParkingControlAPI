package com.API.parkingcontrol.controller;

import com.API.parkingcontrol.service.ParkingSpotService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)  //Permite que seja acessado de qlq fonte
@RequestMapping("/parking-spot")            //request a nivel de classe
public class ParkingSpotController {

    final ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService parkingSpotService){
       this.parkingSpotService = parkingSpotService;
    }

    //Métodos CRUD

    //Post - Salvar novo registro
}
