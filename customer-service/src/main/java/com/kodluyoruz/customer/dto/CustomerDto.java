package com.kodluyoruz.customer.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
    private long customerId;
    private String name;
    private String password;
    private Long accountId;
}
