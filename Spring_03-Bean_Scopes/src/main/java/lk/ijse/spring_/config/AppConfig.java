package lk.ijse.spring_.config;

import lk.ijse.spring_.pojo.PojoThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring_")
public class AppConfig {

    public AppConfig() {
    }
    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }

}
