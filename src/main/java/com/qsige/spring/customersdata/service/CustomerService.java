package com.qsige.spring.customersdata.service;

import com.qsige.spring.customersdata.entity.Customer;
import com.qsige.spring.customersdata.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }


}
