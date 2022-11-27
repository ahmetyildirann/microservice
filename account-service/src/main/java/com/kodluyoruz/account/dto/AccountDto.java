package com.kodluyoruz.account.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDto {
    private long id;
    private String ibanNo;
    private double accountBalance;
    private String accountType;



}
