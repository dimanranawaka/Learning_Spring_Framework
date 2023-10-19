package lk.ijse.spring.controller;

import lk.ijse.spring.dao.CustomerDAO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerDAO customerDAO;
    @PostMapping
    public void addCustomer(Customer customer){
        customerDAO.save(customer);
    }
}
