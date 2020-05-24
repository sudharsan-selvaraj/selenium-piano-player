package com.sudharsan.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class PianoPlayer {

    private WebDriver driver;
    private WebElement canvas;
    private static Map<String, KeyInfo> keyboardKeyInfo;
    private static int canvasStartPoint = -678, keyWidth = 22;

    static {
        keyboardKeyInfo = new HashMap<String, KeyInfo>() {{
            put("a0", new KeyInfo(23, "c"));
            put("a0#", new KeyInfo(34, "f"));
            put("b0", new KeyInfo(25, "v"));

            put("c", new KeyInfo(26, "i"));
            put("c#", new KeyInfo(27, "9"));
            put("d", new KeyInfo(28, "o"));
            put("d#", new KeyInfo(29, "0"));
            put("e", new KeyInfo(30, "p"));
            put("f", new KeyInfo(31, "z"));
            put("f#", new KeyInfo(32, "s"));
            put("g", new KeyInfo(33, "x"));
            put("g#", new KeyInfo(34, "d"));
            put("a", new KeyInfo(35, "y"));
            put("a#", new KeyInfo(36, "7"));
            put("b", new KeyInfo(37, "u"));

            put("c1", new KeyInfo(38, "b"));
            put("c1#", new KeyInfo(39, "h"));
            put("d1", new KeyInfo(40, "n"));
            put("d1#", new KeyInfo(41, "j"));
            put("e1", new KeyInfo(42, "m"));
            put("f1", new KeyInfo(43, ","));
            put("f1#", new KeyInfo(44, "l"));
            put("g1", new KeyInfo(45, "."));
            put("g1#", new KeyInfo(46, ";"));
            put("a1", new KeyInfo(47, "c"));
            put("a1#", new KeyInfo(48, "f"));
            put("b1", new KeyInfo(49, "v"));
        }};
    }


    public PianoPlayer initialize() {
        driver = new ChromeDriver();
        driver.get("https://www.onlinepianist.com/virtual-piano");
        driver.manage().window().setSize(new Dimension(1350, 900));

        sleep(10000);
        canvas = driver.findElement(By.tagName("canvas"));

        java.util.logging.Logger.getLogger("org.openqa").setLevel(Level.OFF);
        return this;
    }


    public void playSong(List<Stanza> songStanzaList) {
        for (Stanza stanza : songStanzaList) {
            for (int i = 0; i < stanza.getLoopCount(); i++) {
                for (SongNote note : stanza.getSongNotes()) {
                    for (int j = 0; j < note.getLoopCount(); j++) {
                        System.out.println("Current note is " + note.getKeyName());
                        keyPress(keyboardKeyInfo.get(note.getKeyName()), note.getReleaseTime());
                    }
                }
            }
        }
    }

    private void keyPress(KeyInfo keyInfo, Integer keyReleaseDelay) {
        int y = 20;
        int x = (canvasStartPoint + (keyInfo.getPosition() * keyWidth));

        new Actions(driver).moveToElement(canvas, x, y).clickAndHold().perform();

        if (keyReleaseDelay > 0) {
            sleep(keyReleaseDelay);
        }
        new Actions(this.driver).moveToElement(canvas, x, y).release().perform();
    }


    void sleep(Integer time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
