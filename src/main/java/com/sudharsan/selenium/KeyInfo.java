package com.sudharsan.selenium;

public class KeyInfo {

    public int position;
    public String keyName;

    public KeyInfo(int position, String keyName) {
        this.position = position;
        this.keyName = keyName;
    }

    public int getPosition() {
        return position;
    }

    public String getKeyName() {
        return keyName;
    }

}
