package com.kodluyoruz.customer.controller;


import com.kodluyoruz.customer.VO.ResponseTemplateVo;
import com.kodluyoruz.customer.dto.CustomerCreateDto;
import com.kodluyoruz.customer.dto.CustomerDto;
import com.kodluyoruz.customer.model.Customer;
import com.kodluyoruz.customer.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping( "/")
    public CustomerDto create(@RequestBody CustomerCreateDto dto){

        Customer customer = customerService.saveCustomer(dto.toCustomer());
        return CustomerDto.builder()
                .customerId(customer.getCustomerId())
                .name(customer.getName())
                .password(customer.getPassword())
                .accountId(customer.getAccountId())
                .build();
    }


    @GetMapping("/{id}")
    public ResponseTemplateVo getCustomerWithDepartment(
            @PathVariable("id") Long customerId){

        return customerService.getCustomerWithDepartment(customerId );
    }
}
