package com.kodluyoruz.customer.repository;

import com.kodluyoruz.customer.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {


    Customer findByCustomerId(Long customerId);


}
