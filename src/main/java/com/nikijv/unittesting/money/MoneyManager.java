package com.nikijv.unittesting.money;

public class MoneyManager {
    public long getKopecksFromDollarCents(long cents) {
        long dollars = cents / 100;
        long hryvnias = (long)(dollars / 41.9294);
        return hryvnias * 100;
    }

    public long getKopecksFromEuroCents(long cents) {
        long euros = cents / 100;
        long hryvnias = (long)(euros / 43.6192);
        return hryvnias * 100;
    }

    public long getKopecksFromPenny(long penny) {
        long poundsSterling = penny / 100;
        long hryvnias = (long)(poundsSterling / 52.0931);
        return hryvnias * 100;
    }

    public long getKopecksFromYen(long yen) {
        long hryvnias = (long)(yen / 0.2688);
        return hryvnias * 100;
    }
}
