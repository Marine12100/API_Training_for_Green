package api.training_for_green;

import dao.Training_for_Green.repositories.UsersRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= UsersRepository.class)
@EntityScan("dao.Training_for_Green.dto")
public class TrainingForGreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingForGreenApplication.class, args);
	}

}
