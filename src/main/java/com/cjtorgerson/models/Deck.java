package com.cjtorgerson.models;

import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {

    public LinkedList<Card> cards;

    public Deck() throws IOException {
        cards = new LinkedList<>();

        int[] cardNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] suits = {"Clover", "Diamond", "Heart", "Spade"};

        for (int cardNum : cardNums) {
            for (String suit : suits) {
                cards.add(new Card(cardNum, suit));
            }
        }
    }

    public void shuffle() {
        randomizeInPlace(cards);
    }

    public static void randomizeInPlace(LinkedList<Card> cards) {
        for (int i = 0; i < cards.size(); i++) {
            int random = ThreadLocalRandom.current().nextInt(i, cards.size());
            Card tmp = cards.get(i);
            cards.set(i, cards.get(random));
            cards.set(random, tmp);
        }
    }

    public Card draw() {
        return cards.poll();
    }
}
