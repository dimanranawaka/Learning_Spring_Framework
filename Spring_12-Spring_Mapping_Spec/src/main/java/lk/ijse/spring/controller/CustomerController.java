package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    public CustomerController() {
        System.out.println("CustomerController : Instantiated");
    }
}
