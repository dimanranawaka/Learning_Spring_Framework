package lk.ijse.spring.controller;

import lk.ijse.spring.dao.CustomerDAO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerDAO customerDAO;
    @PostMapping
    public void addCustomer(Customer customer){
        customerDAO.save(customer);
    }
    @DeleteMapping
    public String deleteCustomer(){
        customerDAO.deleteById("C001");
        return "Customer Deleted Successfully";
    }

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerDAO.findAll();
    }
    @GetMapping(params = {"id"})
    public Customer searchCustomer(String id){
        return customerDAO.findById(id).get();
    }

}
