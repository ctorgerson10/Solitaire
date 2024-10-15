package com.cjtorgerson.models;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GameBoard extends JPanel implements KeyListener {
    /*
    * To set up a game of Klondike solitaire, you need to shuffle a standard 52-card deck and remove the jokers:
    * Deal the cards into seven piles from left to right, with each pile containing one more card than the last.
    * The top card of each pile should be face up, and the rest face down.
    * Place the remaining cards face down in a stock pile in the upper left of the layout.
    * In the upper right, create four foundations, which are light rectangles where you will build up your cards by suit.
    * Create an open discard pile, called the waste, in the upper right.
    * The goal of Klondike is to move all the cards into the four foundations in order, from Ace to King, by suit.
    * You can move cards from the tableau to the foundations, or from the stock to the tableau.
    * You can also move a card from one tableau pile to another if it's the highest card in the pile.
    * The game ends if you can't make any more moves.
    */

    Deck deck;
    ArrayList<Stack<Card>> piles;
    ArrayList<Stack<Card>> foundations;
    Queue<Card> stock;
    Queue<Card> flippedFromStock; // max length 3

    public GameBoard() throws IOException {
        deck = new Deck();
        deck.shuffle();
        piles = new ArrayList<>();
        foundations = new ArrayList<>();
        stock = new LinkedList<>();
        flippedFromStock = new LinkedList<>();

        // Fill the piles
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        ;
    }
}
