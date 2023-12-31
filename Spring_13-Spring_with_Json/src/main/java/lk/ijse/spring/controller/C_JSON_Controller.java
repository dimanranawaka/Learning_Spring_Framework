package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class C_JSON_Controller {

    // So there are many ways that we can pass data between
    // Client and Server
    // 01 Query String
    // 02 X-WWW-Form-Url-Encoded
    // 03 JSON
    // 04 Path Variable with Path Segments

    // 03 JSON
    // How to access above type data from spring
    // @RequestBody -> HTTP Converters : This is a required annotation
    // @RequestBody -> It needs an JSON content from the request body

    @PostMapping
    public String receiveDataWithJson(@RequestBody CustomerDTO dto){
        return "Json : "+dto.toString();
    }
}
