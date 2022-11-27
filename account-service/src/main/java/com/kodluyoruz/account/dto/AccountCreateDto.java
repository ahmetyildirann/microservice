package com.kodluyoruz.account.dto;

import com.kodluyoruz.account.model.Account;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountCreateDto {

    private String ibanNo;

    private double accountBalance;

    private String accountType;

    public Account toAccount(){


        return Account.builder()
                .ibanNo(this.ibanNo)
                .accountBalance(this.accountBalance)
                .accountType(this.accountType)
                .build();
    }
}
