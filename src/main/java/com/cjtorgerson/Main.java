package com.cjtorgerson;

import com.cjtorgerson.models.Deck;
import com.cjtorgerson.models.Card;
import com.cjtorgerson.models.GameBoard;
import com.cjtorgerson.models.SolitaireGame;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Deck deck = new Deck();
        deck.shuffle();
        new SolitaireGame();

    }
}