package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @PostMapping
    public String addCustomer(CustomerDTO dto){
        customerService.addCustomer(dto);
        return  "Customer Added!";
    }
    @GetMapping
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAllCustomer();
    }
    @PutMapping
    public String updateCustomer(@RequestBody CustomerDTO dto){
        customerService.updateCustomer(dto);
        return "Customer "+dto.getId()+" is updated!";
    }
    @DeleteMapping
    public String deleteCustomer(String id){
        customerService.deleteCustomer(id);
        return "Customer "+id+" is deleted!";
    }
    @GetMapping(params = "id")
    public CustomerDTO searchCustomer(String id){
       return customerService.searchCustomer(id);
    }
}
