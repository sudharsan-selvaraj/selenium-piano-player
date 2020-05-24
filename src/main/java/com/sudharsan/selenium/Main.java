package com.sudharsan.selenium;

import com.sudharsan.selenium.songs.CoffinDance;
import com.sudharsan.selenium.songs.GameOfThrone;
import com.sudharsan.selenium.songs.HappyBirthday;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sudharsan/Documents/Applications/chromedriver");

        PianoPlayer player = new PianoPlayer().initialize();

        System.out.println("Playing HAPPY BIRTHDAY song..\n");
        player.sleep(2000);
        player.playSong(HappyBirthday.songNotes);

        System.out.println("\nPlaying GAME OF THRONES THEME music..\n");
        player.sleep(2000);
        player.playSong(GameOfThrone.songNotes);


        System.out.println("\nPlaying COFFIN DANCE music..\n");
        player.sleep(2000);
        player.playSong(CoffinDance.songNotes);
    }

}
