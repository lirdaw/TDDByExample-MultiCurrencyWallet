package com.lirdaw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);

        Assertions.assertEquals(new Dollar(10), five.times(2));
        Assertions.assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testEquality() {
        Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5), new Dollar(6));
        Assertions.assertEquals(new Franc(5), new Franc(5));
        Assertions.assertNotEquals(new Franc(5), new Franc(6));
    }

    @Test
    void testFrancMultiplication() {
        Franc five = new Franc(5);

        Assertions.assertEquals(new Franc(10), five.times(2));
        Assertions.assertEquals(new Franc(15), five.times(3));
    }
}
