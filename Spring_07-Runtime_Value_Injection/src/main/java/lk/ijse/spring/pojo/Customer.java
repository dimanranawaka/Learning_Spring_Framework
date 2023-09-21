package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    public Customer(String name) {
        System.out.println("Customer : Instantiated "+ name);
    }
}
