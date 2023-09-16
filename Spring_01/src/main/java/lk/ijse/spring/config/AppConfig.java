package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // This annotation will identify that this is a configuration file
@ComponentScan(basePackages = "lk.ijse.spring") // This will direct PoJo's location
public class AppConfig {

    public AppConfig(){
        System.out.println("AppConfig:Instantiated");
    }
}
