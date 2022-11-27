package com.kodluyoruz.customer.VO;


import com.kodluyoruz.customer.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {

    private Customer customer;
    private Account account;
}
