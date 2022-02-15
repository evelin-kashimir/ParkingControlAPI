package br.com.devdojo.awesome.start;

//Classe responsavel em iniciar o spring boot

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//Ele gerencia todas as dependências na aplicação de acordo com a necessidade
@EnableAutoConfiguration

//Anotacao para setar o caminho onde estao os endpoints
@ComponentScan(basePackages = "br.com.devdojo.awesome.endpoint")

public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class,args);

    }

}
