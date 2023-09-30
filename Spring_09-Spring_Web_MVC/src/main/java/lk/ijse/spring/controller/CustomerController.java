package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")// Handler Mapping : Concept that binds an url to Handler method, Which is in a Controller Class
public class CustomerController {
    //Handler Methods : Mapping methods that are inside the controllers
    @GetMapping
    public String helloSpring(){
        return "Hello I'm Spring : Your Request Received";
    }
}
