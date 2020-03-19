package com.lirdaw;

class Money implements Expression {
    final String currency;
    final int amount;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }

    public Money reduce(String to) {
        return this;
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.currency.equals(money.currency);
    }

    @Override
    public String toString() {
        return "Money{" + "amount=" + amount + ", currency='" + currency + '\'' + '}';
    }
}
