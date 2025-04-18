package com.shayan.springCoreConcepts;

import com.shayan.springCoreConcepts.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		Person p = new Person(); //object of Person class
		p.playWithAnimal();
		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

}
