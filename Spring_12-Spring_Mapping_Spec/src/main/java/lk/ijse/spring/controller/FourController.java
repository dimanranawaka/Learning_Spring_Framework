package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/four")
public class FourController {
    // How many parts are there in an HTTP Request?
        // There are two parts
            // Headers (Meta Data) "Content-Type=application/json"
            // Body(Context)

    // We can narrow down request using headers also
    @GetMapping(consumes = {"application/json"})
    public String testOne(){
        return "Method one Invoked";
    }
    @GetMapping
    public String testTwo(){
        return "Method Two Invoked";
    }
}
