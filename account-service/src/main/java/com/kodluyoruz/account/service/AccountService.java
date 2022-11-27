package com.kodluyoruz.account.service;

import com.kodluyoruz.account.model.Account;
import com.kodluyoruz.account.repository.AccountRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account saveAccount(Account account) {

        return accountRepository.save(account);
    }


    public Account findAccountById(Long id) {
        return accountRepository.findAccountById(id);
    }
}
