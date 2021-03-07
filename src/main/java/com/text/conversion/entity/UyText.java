package com.text.conversion.entity;

public class UyText {
    private String ULY;
    private String UEY;

    public UyText() {

    }

    public UyText(String ULY, String UEY) {
        this.ULY = ULY;
        this.UEY = UEY;
    }

    public String getUEY() {
        return UEY;
    }

    public void setUEY(String UEY) {
        this.UEY = UEY;
    }

    public String getULY() {
        return ULY;
    }

    public void setULY(String ULY) {
        this.ULY = ULY;
    }

    public String getUEYtoULY() {
        return ULY;
    }

    public String getULYtoUEY() {
        return UEY;
    }
}
