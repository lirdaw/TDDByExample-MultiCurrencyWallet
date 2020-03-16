package com.lirdaw;

public class Money {
    int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.getClass().equals(money.getClass());
    }
}
