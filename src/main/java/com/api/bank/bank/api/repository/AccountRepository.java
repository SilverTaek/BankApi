package com.api.bank.bank.api.repository;

import com.api.bank.bank.api.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
