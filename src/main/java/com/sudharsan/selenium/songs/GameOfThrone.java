package com.sudharsan.selenium.songs;

import com.sudharsan.selenium.Stanza;

import java.util.ArrayList;
import java.util.List;

public class GameOfThrone {
    public static List<Stanza> songNotes = new ArrayList<>();

    public static Stanza mainStanza, loopTone1, secondStanza, loopTone2;
    static  {

        mainStanza = new Stanza()
                .note("a1", 1000)
                .note("d1", 1000)
                .note("f1")
                .note("g1")
                .note("a1", 1000)
                .note("d1", 1000)
                .note("f1", 50)
                .note("g1", 50)
                .note("e1", 200);

        loopTone1 = new Stanza()
                .note("a", 200)
                .note("c1")
                .note("d1")
                .note("e1", 200);

        loopTone2 = new Stanza()
                .note("a1", 200)
                .note("d1")
                .note("f1")
                .note("g1", 200);

        secondStanza = new Stanza()
                .note("g1", 1000)
                .note("c1", 1000)
                .note("e1")
                .note("f1")
                .note("g1", 1000)
                .note("c1", 500)
                .note("f1", 50)
                .note("e1", 50)
                .note("d1", 200);

        songNotes.add(
                new Stanza()
                        .notes(mainStanza.getSongNotes())
                        .notes(loopTone1.getSongNotes(), 4)
                        .notes(secondStanza.getSongNotes())
                        .notes(loopTone1.getSongNotes(), 4)
                        .notes(loopTone2.getSongNotes(), 4)
                        .notes(loopTone1.getSongNotes(), 4)
                        .notes(loopTone2.getSongNotes(), 4)
                        .notes(loopTone1.getSongNotes(), 4)

        );

    }
}
