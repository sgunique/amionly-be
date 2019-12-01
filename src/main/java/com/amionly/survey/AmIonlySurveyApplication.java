package com.amionly.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AmIonlySurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmIonlySurveyApplication.class, args);
	}

}
