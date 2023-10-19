package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional // Manage all the transactions here
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ModelMapper modelMapper;

    public CustomerServiceImpl() {
        System.out.println("CustomerServiceImpl : Instantiated");
    }

    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        // First parameter = source
        // Second parameter = Type you want to convert
        customerRepo.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepo.deleteById(id);
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer> all = customerRepo.findAll();
        return modelMapper.map(all,new TypeToken<List<CustomerDTO>>(){}.getType());
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        Customer customer = customerRepo.findById(id).get();
        return modelMapper.map(customer,CustomerDTO.class);
    }

    @Override
    public void updateCustomer(CustomerDTO c) {
        Customer customer = modelMapper.map(c, Customer.class);
        customerRepo.save(customer);
    }
}
