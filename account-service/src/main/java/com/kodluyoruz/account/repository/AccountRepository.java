package com.kodluyoruz.account.repository;


import com.kodluyoruz.account.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {

    Account findAccountById(Long id);
}
