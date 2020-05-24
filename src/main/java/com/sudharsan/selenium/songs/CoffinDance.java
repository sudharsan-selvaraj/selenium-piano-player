package com.sudharsan.selenium.songs;

import com.sudharsan.selenium.Stanza;

import java.util.ArrayList;
import java.util.List;

public class CoffinDance {

    public static List<Stanza> songNotes = new ArrayList<>();

    static  {

        songNotes.add(
                new Stanza()
                .note("g",300)
                .note("g")
                .note("d1")
                .note("c1",300)
                .note("a#",300)
                .note("a",300)
                .note("a", 0, 2)
                .note("c1", 300)
                .note("a#",0)
                .note("a",0)
        );


        songNotes.add(
                new Stanza()
                        .note("g", 200)
                        .note("g")
                        .note("a1#")
                        .note("a1")
                        .note("a1#")
                        .note("a1")
                        .note("a1#")
                .loop(2)
        );

        songNotes.add(
                new Stanza()
                        .note("g",300)
                        .note("g")
                        .note("d1")
                        .note("c1",300)
                        .note("a#",300)
                        .note("a",300)
                        .note("a", 0, 2)
                        .note("c1", 300)
                        .note("a#",0)
                        .note("a",0)
        );


        songNotes.add(
                new Stanza()
                        .note("g", 200)
                        .note("g")
                        .note("a1#")
                        .note("a1")
                        .note("a1#")
                        .note("a1")
                        .note("a1#",100)
                        .loop(2)
        );

        songNotes.add(
                new Stanza()
                        .note("a1#", 50, 2)
                        .note("a1", 50, 2)
                        .note("d1", 50,4)
                        .note("c1", 50,4)
                        .note("f1", 50, 4)
                        .note("g1", 50, 9)
                        .note("d1", 50)
                        .note("c1", 50)
                        .note("a#", 50)
                        .note("a", 50)
                        .note("f", 100)
        );

        songNotes.add(
                new Stanza()
                        .note("g",300)
                        .note("g")
                        .note("d1")
                        .note("c1",300)
                        .note("a#",300)
                        .note("a",300)
                        .note("a", 0, 2)
                        .note("c1", 300)
                        .note("a#",0)
                        .note("a",0)
        );


        songNotes.add(
                new Stanza()
                        .note("g", 200)
                        .note("g")
                        .note("a1#")
                        .note("a1")
                        .note("a1#")
                        .note("a1")
                        .note("a1#")
                        .loop(2)
        );
    }

}
