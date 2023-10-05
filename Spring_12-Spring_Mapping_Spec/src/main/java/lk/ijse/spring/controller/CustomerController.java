package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    public CustomerController() {
        System.out.println("CustomerController : Instantiated");
    }
    @GetMapping
    public String testOne(){
        return "Get Method Invoked";
    }
    @PostMapping
    public String testTwo(){
        return "Post Method Invoked";
    }
    @PutMapping
    public String testThree(){
        return "Put Method Invoked";
    }
    @DeleteMapping
    public String testFour(){
        return "Delete Method Invoked";
    }
}
