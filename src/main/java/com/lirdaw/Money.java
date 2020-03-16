package com.lirdaw;

public abstract class Money {
    int amount;

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.getClass().equals(money.getClass());
    }
}
