package com.cjtorgerson.models;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class SolitaireGame extends JFrame {

    private JPanel cardPanel;
    private ArrayList<Card> cards;

    public SolitaireGame() throws IOException {
        setTitle("Solitaire");
        setSize(720, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



}
