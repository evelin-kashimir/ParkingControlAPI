package com.API.parkingcontrol.repository;

import com.API.parkingcontrol.model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//Extendendo o JPA repository para facilitar as transações com o banco de dados
//setando o model e referenciando onde serão feitas as transações
@Repository //anotação para transações com base de dados
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
