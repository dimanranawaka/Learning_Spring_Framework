package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class OneController {
    //one/b
    @GetMapping(path = "b")
    public String testOne(){
        return "Get Method One Invoke";
    }
    //one/a
    @GetMapping(path = "/a")
    public String testTwo(){
        return "Get Method Two Invoke";
    }
}
