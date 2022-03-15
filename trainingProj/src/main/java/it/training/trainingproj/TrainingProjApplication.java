package it.training.trainingproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "it.training")
@EntityScan(basePackages = "it.training")
@EnableJpaRepositories("it.training")
public class TrainingProjApplication {

    public static void main(final String[] args) {
	SpringApplication.run(TrainingProjApplication.class, args);
    }

}
