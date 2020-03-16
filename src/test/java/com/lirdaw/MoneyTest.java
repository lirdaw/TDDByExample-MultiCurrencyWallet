package com.lirdaw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @Test
    void testMultiplication() {
        Money five = Money.dollar(5);

        Assertions.assertEquals(Money.dollar(10), five.times(2));
        Assertions.assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testEquality() {
        Assertions.assertEquals(Money.dollar(5), Money.dollar(5));
        Assertions.assertNotEquals(Money.dollar(5), Money.dollar(6));
        Assertions.assertEquals(Money.franc(5), Money.franc(5));
        Assertions.assertNotEquals(Money.franc(5), Money.franc(6));
        Assertions.assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    void testFrancMultiplication() {
        Money five = Money.franc(5);

        Assertions.assertEquals(Money.franc(10), five.times(2));
        Assertions.assertEquals(Money.franc(15), five.times(3));
    }
}
