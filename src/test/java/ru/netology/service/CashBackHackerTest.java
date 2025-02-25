package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {
    @Test
    public void shouldRemain100WhenAmount900() {
        CashBackHacker cashBack = new CashBackHacker();

        int amount = 900;

        int actual = cashBack.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain0WhenAmount1000() {
        CashBackHacker cashBack = new CashBackHacker();

        int amount = 1_000;

        int actual = cashBack.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain900WhenAmount1100() {
        CashBackHacker cashBack = new CashBackHacker();

        int amount = 1_100;

        int actual = cashBack.remain(1_100);
        int expected = 900;

        assertEquals(expected, actual);
    }
}
