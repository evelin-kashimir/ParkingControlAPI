package com.API.parkingcontrol.controller;

import com.API.parkingcontrol.dto.ParkingSpotDTO;
import com.API.parkingcontrol.model.ParkingSpotModel;
import com.API.parkingcontrol.service.ParkingSpotService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

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
    @PostMapping //define que é um metodo post
    //Object pra criar diferentes tipos de retorno | RequestBody traz um objeto json do formulario |Valid valida os campos
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO){
        var parkingSpotModel = new ParkingSpotModel();
        //Dados de entrada, DTO - Sendo salvo um model com to_do o mapeamento da entidade
        //copy proprieties converte o dto para o parkingModel
        BeanUtils.copyProperties(parkingSpotDTO, parkingSpotModel);
        //setando a data de cadastro no momento do post
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));

        //Sempre que o cliente mandar um post, sera enviado para /parking-spot definindo o metodo post http
        // e assim esse metodo save(parkingSpotModel) vai ser acionado para responder a essa solicitação
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
    }
}
