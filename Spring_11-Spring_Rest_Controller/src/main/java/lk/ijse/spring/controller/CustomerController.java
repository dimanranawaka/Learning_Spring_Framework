package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller("/customer")
public class CustomerController {
    @GetMapping
    public String test(){
        return "Hello Customer";
    }
}
