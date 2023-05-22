package co.edu.uco.quickjob.api.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages ="co.edu.uco.quickjob" )
public class QuickjobApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(QuickjobApiApplication.class, args);
    }

}
