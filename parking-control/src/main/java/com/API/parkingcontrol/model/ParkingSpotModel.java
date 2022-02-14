package com.API.parkingcontrol.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

//Inserindo anotações JPA
@Entity //Declara que será uma entidade (tabela do banco)
@Table(name = "TB_PARKING_SPOT")        //Serial de dados que serão armazenados
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionID = 1l; //controla o fluxo de dados

    //Atributos - Campos na tabela
    @Id //Identificador da entidade (tabela)
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto increment - ID gerado automaticamente
    private UUID id; //tipo de id, unico (especial para microsservices)

    @Column(nullable = false, unique = true, length = 10) //not null - unico - varchar(10)
    private String parkingSpotNumber; //numero da vaga

    @Column(nullable = false, unique = true, length = 7)  //not null - unico - varchar(7)
    private String licensePlateCar;   //placa do carro

    @Column(nullable = false, length = 70) //not null - varchar(70)
    private String modelCar;  //modelo do carro

    @Column(nullable = false, length = 70) //not null - varchar(70)
    private String colorCar;  //cor do carro

    @Column(nullable = false)
    private LocalDateTime registrationDate; //data de registro

    @Column(nullable = false, length = 130)
    private String reposibleName; //Nome do responsável

    @Column(nullable = false, length = 30)
    private String apartment; //apartamento

    @Column(nullable = false, length = 30)
    private String block;   //bloco

    public UUID getId() {return id;}
    public void setId(UUID id) {this.id = id;}

    public String getParkingSpotNumber() {return parkingSpotNumber;}
    public void setParkingSpotNumber(String parkingSpotNumber) {this.parkingSpotNumber = parkingSpotNumber;}

    public String getLicensePlateCar() {return licensePlateCar;}
    public void setLicensePlateCar(String licensePlateCar) {this.licensePlateCar = licensePlateCar;}

    public String getModelCar() {return modelCar;}
    public void setModelCar(String modelCar) {this.modelCar = modelCar;}

    public String getColorCar() {return colorCar;}
    public void setColorCar(String colorCar) {this.colorCar = colorCar;}

    public LocalDateTime getRegistrationDate() {return registrationDate;}
    public void setRegistrationDate(LocalDateTime registrationDate) {this.registrationDate = registrationDate;}

    public String getReposibleName() {return reposibleName;}
    public void setReposibleName(String reposibleName) {this.reposibleName = reposibleName;}

    public String getApartment() {return apartment;}
    public void setApartment(String apartment) {this.apartment = apartment;}
    
    public String getBlock() {return block;}
    public void setBlock(String block) {this.block = block;}
}
