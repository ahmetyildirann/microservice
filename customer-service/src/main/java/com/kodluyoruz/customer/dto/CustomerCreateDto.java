package com.kodluyoruz.customer.dto;

import com.kodluyoruz.customer.model.Customer;
import lombok.Setter;

@Setter
public class CustomerCreateDto {

    private String name;
    private String password;
    private Long accountId;



    public Customer toCustomer(){

        return Customer.builder()
                .name(this.name)
                .password(this.password)
                .accountId(this.accountId)
                .build();

    }
}
