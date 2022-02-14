package com.api.bank.bank.api.repository;

import com.api.bank.bank.api.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, String> {
}
