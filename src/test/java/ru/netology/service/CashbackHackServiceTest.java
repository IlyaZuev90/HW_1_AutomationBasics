package ru.netology.service;



public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldTestRemainWithEqualAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldTestRemainWithLesserAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldTestRemainWithHigherAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        org.testng.Assert.assertEquals(actual, expected);

    }
}