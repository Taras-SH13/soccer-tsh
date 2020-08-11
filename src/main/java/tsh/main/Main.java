package tsh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "tsh")
@EnableJpaRepositories(basePackages = "tsh.bd")
@EntityScan(basePackages = "tsh.bd")

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
