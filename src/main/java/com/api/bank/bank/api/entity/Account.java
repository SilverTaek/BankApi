package com.api.bank.bank.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {

    @Id
    private int bank_account_id;

    private String bank_code;

    private Long bank_account_number;

}
