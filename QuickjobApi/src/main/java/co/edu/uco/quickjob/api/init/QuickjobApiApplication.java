package co.edu.uco.quickjob.api.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"co.edu.uco.quickjob"})
@ComponentScan(basePackages = {"co.edu.uco.quickjob"} )
@EntityScan(basePackages = {"co.edu.uco.quickjob" })
public class QuickjobApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuickjobApiApplication.class, args);
    }
}
