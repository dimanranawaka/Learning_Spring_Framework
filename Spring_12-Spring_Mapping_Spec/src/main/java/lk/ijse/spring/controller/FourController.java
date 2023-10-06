package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
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
    /*@GetMapping(consumes = {"application/json"})
    public String testOne(){
        return "Method one Invoked";
    }
    @GetMapping
    public String testTwo(){
        return "Method Two Invoked";
    }*/

    // consumes = Content-Type=application/json
    // produce = Accept=> we want this type of response
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public String testOne(){
        return "Method one Invoked";
    }
    @GetMapping(produces = {MediaType.TEXT_HTML_VALUE})
    public String testTwo(){
        return "Method Two Invoked";
    }
}
