package com.sudharsan.selenium.songs;

import com.sudharsan.selenium.Stanza;

import java.util.ArrayList;
import java.util.List;

public class HappyBirthday {
    public static List<Stanza> songNotes = new ArrayList<>();

    static  {

        songNotes.add(
                new Stanza()
                        .note("c", 100, 2)
                        .note("d", 500)
                        .note("c", 900)
                        .note("f", 500)
                        .note("e", 900)
        );

        songNotes.add(
                new Stanza()
                        .note("c", 100, 2)
                        .note("d", 500)
                        .note("c", 900)
                        .note("g", 500)
                        .note("f", 900)
        );

        songNotes.add(
                new Stanza()
                        .note("c", 100, 2)
                        .note("c1", 500)
                        .note("a", 500)
                        .note("g", 500)
                        .note("e", 500)
                        .note("d", 900)
        );


        songNotes.add(
                new Stanza()
                        .note("a#", 100, 2)
                        .note("a", 500)
                        .note("f", 900)
                        .note("g", 900)
                        .note("f", 1200)
        );

    }
}
