package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {
    @Test
    public void shouldRemain100WhenAmount900() {
        CashBackHacker cashBack = new CashBackHacker();

        int amount = 900;

        int expected = 100;
        int actual = cashBack.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain0WhenAmount1000() {
        CashBackHacker cashBack = new CashBackHacker();

        int amount = 1_000;

        int expected = 0;
        int actual = cashBack.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain900WhenAmount1100() {
        CashBackHacker cashBack = new CashBackHacker();

        int amount = 1_100;

        int expected = 900;
        int actual = cashBack.remain(1_100);

        assertEquals(expected, actual);
    }
}
