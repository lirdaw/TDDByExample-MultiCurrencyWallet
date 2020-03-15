package com.lirdaw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);

        Dollar product = five.times(2);
        Assertions.assertEquals(10, product.amount);

        product = five.times(3);
        Assertions.assertEquals(15, product.amount);
    }

    @Test
    void testEquality() {
        Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5), new Dollar(6));
    }
}
