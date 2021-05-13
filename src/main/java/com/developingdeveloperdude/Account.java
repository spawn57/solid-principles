package com.developingdeveloperdude;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import lombok.Getter;

@Getter
public class Account {
 
    private Money balance;
    
    public Account() {
        this.balance = Money.of(CurrencyUnit.USD, 0);
    }
    
    public Money getBalance() {
        return this.balance;
    }
}
