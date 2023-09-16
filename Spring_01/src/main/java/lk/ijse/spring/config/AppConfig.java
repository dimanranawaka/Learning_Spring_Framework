package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // This annotation will identify that this is a configuration file
@ComponentScan(basePackages = "lk.ijse.spring") // This will direct PoJo's location
public class AppConfig {

    public AppConfig(){
        System.out.println("AppConfig:Instantiated");
    }

    @Bean
    public BasicDataSource basicDataSource(){
        return new BasicDataSource(); // returning that class object constructor
    }

}
