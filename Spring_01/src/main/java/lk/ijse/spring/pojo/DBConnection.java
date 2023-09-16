package lk.ijse.spring.pojo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component // This will help to identify the current file as a component
public class DBConnection {
    public DBConnection(){
        System.out.println("DBConnection : Instantiated");
    }
    public void testConnection(){
        System.out.println("Connection Received!");
    }
}
