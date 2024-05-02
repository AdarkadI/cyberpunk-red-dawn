package org.example.night_market.base;
public enum NightMarketConstants {

    CHEAP ("10eb"),
    EVERYDAY ("20eb"),
    COSTLY ("50eb"),
    PREMIUM ("100eb"),
    EXPENSIVE ("500eb"),
    V_EXPENSIVE ("1.000eb"),
    LUXURY ("5.000eb"),
    V_LUXURY ("10.000eb"),

    CHEAP_VALUE (10),
    EVERYDAY_VALUE (20),
    COSTLY_VALUE (50),
    PREMIUM_VALUE (100),
    EXPENSIVE_VALUE(500),
    V_EXPENSIVE_VALUE (1000),
    LUXURY_VALUE (5000),
    V_LUXURY_VALUE (10000);

    private Number valueN = null;
    private String valueS = null;

    NightMarketConstants(Number valueN) {
        this.valueN = valueN;
    }

    NightMarketConstants(String valueS) {
        this.valueS = valueS;
    }

    public Number getValueN() {
        return valueN;
    }

    public String getValueS() {
        return valueS;
    }
}
