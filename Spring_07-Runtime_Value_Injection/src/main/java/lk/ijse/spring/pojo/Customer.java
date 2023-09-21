package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;

@Component
public class Customer {
    /*public Customer(@Value("IJSE")String name) {
        System.out.println("Customer : Instantiated ");
    }*/

    public Customer(@Value("10,20,30,40") String names []) {
        System.out.println("Customer : Instantiated ");
        for (String a:
             names) {
            System.out.println(a);
        }
    }

    //What you can assign with @Value Annotation
        // Primitive Data Types
        // String Data
        // Arrays
}
