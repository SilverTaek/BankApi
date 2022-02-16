package com.api.bank.bank.api.controller;

import com.api.bank.bank.api.entity.Account;
import com.api.bank.bank.api.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/register")
    public HashMap<String, Integer> registerAccount(@RequestBody Account account) {


        HashMap<String, Integer> map = new HashMap<>();
        accountService.accountRegister(account);
        map.put("bank_account_id", accountService.accountRegister(account));
        return map;
    }
}
