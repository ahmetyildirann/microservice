package com.kodluyoruz.customer.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {


    private long id;
    private String ibanNo;
    private double accountBalance;
    private String accountType;
}
