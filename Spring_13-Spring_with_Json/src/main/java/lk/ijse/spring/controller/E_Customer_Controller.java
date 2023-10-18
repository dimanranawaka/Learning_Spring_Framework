package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class E_Customer_Controller {
    @PostMapping
    public void addCustomer(@RequestBody CustomerDTO dto){

    }
    @DeleteMapping(params = "id")
    public void deleteCustomer(@RequestParam String id){

    }
    @GetMapping(params = "id")
    public void searchCustomer(@RequestParam String id){

    }
    @PutMapping
    public void updateCustomer(@RequestBody CustomerDTO dto){

    }
    @GetMapping
    public void getAllCustomers(){

    }
}
