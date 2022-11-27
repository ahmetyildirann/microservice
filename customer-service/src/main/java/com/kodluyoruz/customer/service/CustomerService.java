package com.kodluyoruz.customer.service;

import com.kodluyoruz.customer.VO.Account;
import com.kodluyoruz.customer.VO.ResponseTemplateVo;
import com.kodluyoruz.customer.model.Customer;
import com.kodluyoruz.customer.repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public CustomerService(CustomerRepository customerRepository, RestTemplate restTemplate) {
        this.customerRepository = customerRepository;
        this.restTemplate = restTemplate;
    }

    public Customer saveCustomer(Customer customer) {

        return customerRepository.save(customer);

    }


    public ResponseTemplateVo getCustomerWithDepartment(Long id) {
        ResponseTemplateVo vo = new ResponseTemplateVo();
        Customer customer = customerRepository.findByCustomerId(id);


        Account account =
//                restTemplate.getForObject("http://localhost:9001/account/"
                restTemplate.getForObject("http://ACCOUNT-SERVICE/account/"
                                + customer.getAccountId()
                             ,Account.class);
        vo.setCustomer(customer);
        vo.setAccount(account);

        return  vo;
    }
}
