package com.example.restapptest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.stream.Stream;

@SpringBootApplication
public class RestappTestApplication{

	public static void main(String[] args) {
		SpringApplication.run(RestappTestApplication.class, args);

	}
}

@Bean
CommandLineRunner commandLineRunner(PersonRepository personRepository){
	return strings -> {

	};
}

@RepositoryRestResource
interface PersonRepository extends JpaRepository<Person,Long>{

}

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
class Person{

	@Id
	@GeneratedValue
	private Long id;
	private String personName;
	private String personDept;


}

