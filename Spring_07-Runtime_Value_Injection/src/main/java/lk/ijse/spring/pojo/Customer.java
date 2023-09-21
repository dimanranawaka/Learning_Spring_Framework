package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;

@Component
public class Customer {
    /*public Customer(@Value("IJSE")String name) {
        System.out.println("Customer : Instantiated ");
    }*/
    @Autowired(required = false)
    public Customer(@Value("Dasun,Hansaka,Ravindu,Sanchana") String names []) {
        System.out.println("Customer : Instantiated ");
        for (String name:
             names) {
            System.out.println(name);
        }
    }
    @Autowired(required = false)// Here Spring runs the Greedious Constructor
    public Customer(@Value("Diman") String name,@Value("10")int i) {

        System.out.println("Customer : Instantiated :"+name+" "+i);

    }

    //What you can assign with @Value Annotation
        // Primitive Data Types
        // String Data
        // Arrays
}
