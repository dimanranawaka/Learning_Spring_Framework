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

    @GetMapping("/C??DEF")
    public String testOne1(){
        return "Method two Invoked";
    }

    @GetMapping("/*/mypath/A")
    public String testOne2(){
        return "Method three Invoked";
    }
    // In here : zero or any amount
    @GetMapping("/**/mypath/A")
    public String testOne3(){
        return "Method four Invoked";
    }

}
