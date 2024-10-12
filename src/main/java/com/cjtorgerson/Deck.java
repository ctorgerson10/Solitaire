package com.cjtorgerson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {

    Card[] cards = new Card[52];

    public Deck() throws IOException {
        ArrayList<Card> temp = new ArrayList<>();

        int[] cardNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] suits = {"Clover", "Diamond", "Heart", "Spade"};

        for (int cardNum : cardNums) {
            for (String suit : suits) {
                temp.add(new Card(cardNum, suit));
            }
        }
        cards = temp.toArray(new Card[52]);
    }

    public void shuffle() {
        randomizeInPlace(cards);
    }

    public static void randomizeInPlace(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            int rndm = ThreadLocalRandom.current().nextInt(i, cards.length);
            Card tmp = cards[i];
            cards[i] = cards[rndm];
            cards[rndm] = tmp;
        }
    }

    public static void main(String[] args) throws IOException {
        Deck deck = new Deck();
    }
}
