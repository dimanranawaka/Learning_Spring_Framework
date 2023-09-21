package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig : Instantiated");
    }
    @Bean
    public PojoTwo pojoTwo(){
        // Inter-Bean Dependencies Invocation
        PojoThree pojoThree = pojoThree();
        System.out.println(pojoThree);
        return new PojoTwo();
    }
    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
