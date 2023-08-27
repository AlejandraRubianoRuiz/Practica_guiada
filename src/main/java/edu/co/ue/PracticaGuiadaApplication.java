package edu.co.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"edu.co.ue.controller"})
public class PracticaGuiadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaGuiadaApplication.class, args);
	}

}
