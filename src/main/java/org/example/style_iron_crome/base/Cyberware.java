package org.example.style_iron_crome.base;

public abstract class Cyberware {
    private String cyberwareName;
    private String cyberwareInstall;
    private boolean isFundational;
    private int cyberwareOptionSlots;
    private String cyberwareDescription;
    private Number cyberwarePrice;
    private Number cyberwareHumanityLost;

    public String getCyberwareName() {
        return cyberwareName;
    }

    public void setCyberwareName(String cyberwareName) {
        this.cyberwareName = cyberwareName;
    }

    public boolean getIsFundational() {
        return isFundational;
    }

    public void setIsFundational(boolean fundational) {
        isFundational = fundational;
    }

    public String getCyberwareInstall() {
        return cyberwareInstall;
    }

    public void setCyberwareInstall(String cyberwareInstall) {
        this.cyberwareInstall = cyberwareInstall;
    }

    public int getCyberwareOptionSlots() {
        return cyberwareOptionSlots;
    }

    public void setCyberwareOptionSlots(int cyberwareOptionSlots) {
        this.cyberwareOptionSlots = cyberwareOptionSlots;
    }

    public String getCyberwareDescription() {
        return cyberwareDescription;
    }

    public void setCyberwareDescription(String cyberwareDescription) {
        this.cyberwareDescription = cyberwareDescription;
    }

    public Number getCyberwarePrice() {
        return cyberwarePrice;
    }

    public void setCyberwarePrice(Number cyberwarePrice) {
        this.cyberwarePrice = cyberwarePrice;
    }

    public Number getCyberwareHumanityLost() {
        return cyberwareHumanityLost;
    }

    public void setCyberwareHumanityLost(Number cyberwareHumanityLost) {
        this.cyberwareHumanityLost = cyberwareHumanityLost;
    }
}
