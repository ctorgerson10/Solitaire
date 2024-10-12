package com.cjtorgerson;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Deck deck = new Deck();
        deck.shuffle();
        System.out.println(deck.cards.size());
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.draw().toString());
        }
        System.out.println(deck.cards.size());

    }
}