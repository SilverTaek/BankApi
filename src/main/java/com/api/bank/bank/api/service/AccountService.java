package com.api.bank.bank.api.service;

import com.api.bank.bank.api.common.AccountException;
import com.api.bank.bank.api.common.ErrorCode;
import com.api.bank.bank.api.entity.Account;
import com.api.bank.bank.api.entity.Bank;
import com.api.bank.bank.api.repository.AccountRepository;
import com.api.bank.bank.api.repository.BankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final BankRepository bankRepository;

    public int accountRegister(Account account) {

        boolean flag = false;
        List<Bank> list = bankRepository.findAll();
        for (Bank bank: list) {

            if(account.getBank_code().equals(bank.getBank_code())) {
                flag = true;
            }
        }

        if(account.getBank_account_number() > 9999999999L || 1000000000L > account.getBank_account_number()) {

            throw new AccountException("잘못된 계좌 정보", ErrorCode.BANKING_ERROR_100 );
        }else if(!flag)  {

            throw new AccountException("등록할 수 없는 계좌", ErrorCode.BANKING_ERROR_101);
        }

        account.setBank_account_id(12345678);
        accountRepository.save(account);

        return account.getBank_account_id();
    }
}
