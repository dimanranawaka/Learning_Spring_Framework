package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class TwoController {
    // Character Mapping

    // If we have a doubt in exact mapping we can use ? for that character
    @GetMapping("/C?DEF")
    public String testOne(){
        return "Method One Invoked";
    }
}
