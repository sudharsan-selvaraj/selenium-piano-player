package com.sudharsan.selenium;

public class SongNote {
    private String keyName;
    private Integer releaseTime = 0;
    private Integer loopCount = 0;

    public SongNote(String keyName, Integer releaseTime, Integer loopCount) {
        this.keyName = keyName;
        this.releaseTime = releaseTime;
        this.loopCount = loopCount;
    }

    public String getKeyName() {
        return keyName;
    }

    public Integer getReleaseTime() {
        return releaseTime;
    }

    public Integer getLoopCount() {
        return loopCount;
    }
}
