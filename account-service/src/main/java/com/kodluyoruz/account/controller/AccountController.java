package com.kodluyoruz.account.controller;

import com.kodluyoruz.account.dto.AccountCreateDto;
import com.kodluyoruz.account.dto.AccountDto;
import com.kodluyoruz.account.model.Account;
import com.kodluyoruz.account.service.AccountService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @PostMapping("/")
    public AccountDto create(@RequestBody AccountCreateDto dto ){

        Account account = accountService.saveAccount(dto.toAccount());

        return AccountDto.builder()
                .id(account.getId())
                .ibanNo(account.getIbanNo())
                .accountBalance(account.getAccountBalance())
                .accountType(account.getAccountType())
                .build();

    }


    @GetMapping("/{id}")
    public Account findAccountId(@PathVariable("id") Long id){
        return accountService.findAccountById(id);
    }
}
