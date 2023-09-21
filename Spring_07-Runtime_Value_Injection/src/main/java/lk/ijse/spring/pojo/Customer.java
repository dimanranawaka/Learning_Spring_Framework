package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    public Customer(@Value("IJSE")String name) {
        System.out.println("Customer : Instantiated ");
    }
}
