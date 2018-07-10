package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Main class of Spring Boot application.
 *
 * @EnableScheduling ensures that a background task executor is created. Without it, nothing gets scheduled.
 *
 * @author Giuseppe Iacono
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class);
    }

}
