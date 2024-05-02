package org.example.style_iron_crome.base;

public enum CyberwareConstants {
    HL_V_LOW(2),
    HL_LOW (3),
    HL_MID (7),
    HL_HIGH (10),
    HL_V_HIGH (14),
    HL_GENETIC (22),

    MALL ( "Mall"),
    CLINIC("Clinic"),
    HOSPITAL ("Hospital"),
    HOSPITAL_SPE ("Specialized Hospital"),

    MALL_VALUE (100),
    CLINIC_VALUE (500),
    HOSPITAL_VALUE (1000),
    HOSPITAL_SPE_VALUE (5000);

    private Number valueN = null;
    private String valueS = null;

    CyberwareConstants(Number valueN) {
        this.valueN = valueN;
    }

    CyberwareConstants(String valueS) {
        this.valueS = valueS;
    }

    public Number getValueN() {
        return valueN;
    }

    public String getValueS() {
        return valueS;
    }


}
