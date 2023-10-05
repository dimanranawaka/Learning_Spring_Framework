package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller("/customer")
public class CustomerController {
    @GetMapping
    public String testOne(){
        //We can return any compatible data type with rest controllers
        // no need of view resolvers
        return "Hello Customer";
    }
    @GetMapping
    public String testTwo(){ // this is a duplicate(Ambiguous) mapping
        return "Hello";
    }
}
