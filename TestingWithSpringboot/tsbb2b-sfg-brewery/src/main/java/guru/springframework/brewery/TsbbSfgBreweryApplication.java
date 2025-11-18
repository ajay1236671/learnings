package guru.springframework.brewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class TsbbSfgBreweryApplication {

    public static void main(String[] args) {
        System.out.println("Starting TsbbSfgBreweryApplication");
        SpringApplication.run(TsbbSfgBreweryApplication.class, args);
        
    }

}
