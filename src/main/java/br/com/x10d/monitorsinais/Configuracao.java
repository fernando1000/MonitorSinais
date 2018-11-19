package br.com.x10d.monitorsinais;

import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableScheduling
public class Configuracao {

	public static void main(String[] args) {
				
		SpringApplication.run(Configuracao.class, args);
	}
	
}
