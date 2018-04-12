package com.example.jpaexample;

import java.util.Collection;
import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@SpringBootApplication
public class JpaexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaexampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ReservationRepository pr) {
		return args -> {
			Stream.of("Ashish", "Amit", "Amar", "Tushar").forEach(pname -> pr.save(new Reservation(pname)));

		};
	}
}

@RepositoryRestResource
interface ReservationRepository extends JpaRepository<Reservation, Long> {

	@RestResource(path = "by-name")
	Collection<Reservation> findByReservationName(@Param("pn") String pname);

}

@Entity
class Reservation {

	@Id
	@GeneratedValue
	private long id;
	private String reservationName;

	public Reservation(String name) {
		this.reservationName = name;
	}

	public Reservation() {
		// for JPA
	}

	public long getId() {
		return id;
	}

	public String getReservationName() {
		return reservationName;
	}

}
