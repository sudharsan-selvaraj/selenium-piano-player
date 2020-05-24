package com.sudharsan.selenium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stanza {

    private List<SongNote> notes = new ArrayList<>();
    private int loopCount = 1;

    public Stanza note(String keyName) {
        return note(keyName, 0);
    }

    public Stanza note(String keyName, Integer sleepTime) {
        this.notes.add(new SongNote(keyName, sleepTime, 1));
        return this;
    }

    public Stanza note(String keyName, Integer sleepTime, Integer loopCount) {
        this.notes.add(new SongNote(keyName, sleepTime, loopCount));
        return this;
    }


    public Stanza notes(List<SongNote> notes) {
        return notes(notes, 1);
    }

    public Stanza notes(List<SongNote> notes, Integer loopCount) {
        for(int c=0; c< loopCount;c++) {
            Collections.addAll(this.notes, notes.toArray(new SongNote[]{}));
        }
        return this;
    }

    public Stanza loop(Integer loopCount) {
        this.loopCount = loopCount;
        return this;
    }

    public Integer getLoopCount() {
        return this.loopCount;
    }

    public List<SongNote> getSongNotes() {
        return notes;
    }
}



