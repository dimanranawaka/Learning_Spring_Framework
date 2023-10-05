package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class OneController {
    //one/b
    /*@GetMapping(path = "z/b")
    public String testOne(){
        return "Get Method One Invoke";
    }
    //one/a
    @GetMapping(path = "z/a")
    public String testTwo(){
        return "Get Method Two Invoke";
    }*/

    /*@GetMapping(path = "/id/{C001}/{Diman}")
    public String testOne(@PathVariable("C001") String id, @PathVariable("Diman") String name){
        System.out.println(id);
        System.out.println(name);
        return "Get Method One Invoke";
    }*/

    // Alias
    @GetMapping(path = "/id/{id:[C]{1}[0-9]{3}}/{name:[A-Z]{4}}")
    public String testOne(@PathVariable String id, @PathVariable String name){
        System.out.println(id);
        System.out.println(name);
        return "Get Method One Invoke";
    }

    @GetMapping(path = "/id/{id:[C]{2}[0-9]{3}}/{name:[a-z]{5}}")
    public String testOne1(@PathVariable String id, @PathVariable String name){
        System.out.println(id);
        System.out.println(name);
        return "Get Method One Invoke";
    }
}
