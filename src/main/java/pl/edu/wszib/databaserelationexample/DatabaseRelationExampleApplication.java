package pl.edu.wszib.databaserelationexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.edu.wszib.databaserelationexample.repository.OwnerRepository;
import pl.edu.wszib.databaserelationexample.repository.VehicleRepository;
import pl.edu.wszib.databaserelationexample.repository.entity.OwnerEntity;

@Slf4j
@SpringBootApplication
public class DatabaseRelationExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseRelationExampleApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(OwnerRepository ownerRepository, VehicleRepository vehicleRepository) {
		return args -> {
			log.info("Owner count: " + ownerRepository.count());
			log.info("Vehicle count: " + vehicleRepository.count());

			log.info("Owners: " + ownerRepository.findAll());
		};
	}
}
