package com.qsige.spring.customersdata.repository;

import com.qsige.spring.customersdata.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c FROM Customer c WHERE c.name LIKE %?1%")
    <Optional> Customer findCustomerByName(String name);
    <Optional> Customer findCustomerByPhone(String phone);
    <Optional> Customer findCustomerByEmail(String email);

}
