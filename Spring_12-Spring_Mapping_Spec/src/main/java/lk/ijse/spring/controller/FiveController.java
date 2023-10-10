package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/five")
public class FiveController {

    // This is alternative to instead of putting produce/consume same time
    @GetMapping(headers = {"Content-Type = application/json","Accept = text/html"})
    public String testOne(){
        return "Method One Invoked";
    }
}
