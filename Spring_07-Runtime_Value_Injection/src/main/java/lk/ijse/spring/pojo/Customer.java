package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    // Will take this and run this as the Default Constructor , And will ignore the other one
    public Customer() {
        System.out.println("Default Constructor ");
    }

    public Customer(String name) {
        System.out.println("Customer : Instantiated "+ name);
    }
}
