package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldTestRemainWithEqualAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldTestRemainWithLesserAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldTestRemainWithHigherAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldTestRemainWithZeroAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.junit.Assert.assertEquals(expected, actual);
    }
}