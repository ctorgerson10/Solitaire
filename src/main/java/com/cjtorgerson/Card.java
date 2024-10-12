package com.cjtorgerson;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Card {

    int number;
    String stringNumber;
    String suit;
    boolean faceUp;
    int height, width;
    BufferedImage front;
    BufferedImage back;
    BufferedImage currentFace;

    public Card(int num, String cardSuit) throws IOException {
        height = 62;
        width = 84;
        number = num;
        stringNumber = num > 10 ? getRoyal(num) : Integer.toString(num);
        suit = cardSuit;
        faceUp = false;
        try (InputStream frontStream = getClass().getClassLoader().getResourceAsStream("CardSprites/" + suit + "/" + number + ".png")) {
            if (frontStream != null) {
                front = ImageIO.read(frontStream);
            }
        }
        try (InputStream backStream = getClass().getClassLoader().getResourceAsStream("CardSprites/back.png")) {
            if (backStream != null) {
                back = ImageIO.read(backStream);
            }
        }
        currentFace = back;
    }

    @Override
    public String toString() {
        return stringNumber + " of " + suit;
    }

    public String getRoyal(int num) {
        if (num == 11) {
            return "J";
        } else if (num == 12) {
            return "Q";
        } else if (num == 13) {
            return "K";
        }
        return "";
    }

    public void flipCard() {
        faceUp = !faceUp;
        currentFace = faceUp ? front : back;
    }
}
