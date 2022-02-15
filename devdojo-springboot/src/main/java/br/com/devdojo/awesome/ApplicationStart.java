package br.com.devdojo.awesome;

//Classe responsavel em iniciar o spring boot

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*Ele gerencia todas as dependências na aplicação de acordo com a necessidade
@EnableAutoConfiguration
@ComponentScan
@Configuration*/
@SpringBootApplication //Substitui todas as anotações acima
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class,args);

    }

}
