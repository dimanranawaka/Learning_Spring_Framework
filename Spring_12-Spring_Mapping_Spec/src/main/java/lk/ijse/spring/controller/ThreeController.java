package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/three")
public class ThreeController {

    // Narrow down request with query String Parameters

    /** ?id=C001&name=IJSE -> QueryString Parameter */

    @GetMapping(params ={"id","name"})
    public String testOne(){
        return "Method One Invoked";
    }

    @GetMapping(params ={"address","salary"})
    public String testTwo(){
        return "Method Two Invoked";
    }
}
