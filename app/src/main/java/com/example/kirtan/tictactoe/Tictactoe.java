package com.example.kirtan.tictactoe;

import java.util.ArrayList;

/**
 * Created by Kirtan on 4/18/15.
 */
public class Tictactoe {
    String player;
    ArrayList<Integer> p1;
    ArrayList<Integer> p2;
    boolean player1Won;
    boolean player2Won;
    boolean but1;
    boolean but2;
    boolean but3;
    boolean but4;
    boolean but5;
    boolean but6;
    boolean but7;
    boolean but8;
    boolean but9;

    public Tictactoe() {
        player = "Player 1";
        player1Won = false;
        player2Won = false;
        but1 = false;
        but2 = false;
        but3 = false;
        but4 = false;
        but5 = false;
        but6 = false;
        but7 = false;
        but8 = false;
        but9 = false;
        p1 = new ArrayList<Integer>();
        p2 = new ArrayList<Integer>();
    }

    public String won()
    {
        return player + " Won!";
    }

    public void clickButton(String s, int n) {
        if (s.equals("Player 1")) {
            p1.add(n);
        } else {
            p2.add(n);
        }
    }

    public String getPlayer() {
        return player;
    }

    public void alternatePlayer() {
        if (player.equals("Player 1")) {
            player = "Player 2";
        } else {
            player = "Player 1";
        }
    }

    public String getXO()
    {
        if(player.equals("Player 1"))
        {
            return "X";
        }
        else
        {
            return "O";
        }
    }

    public boolean checkForWin(String s) {
        boolean b = false;
        if (s.equals("Player 1")) {
            if ((p1.contains(1) && p1.contains(2) && p1.contains(3)) ||
                    (p1.contains(1) && p1.contains(4) && p1.contains(7)) ||
                    (p1.contains(1) && p1.contains(5) && p1.contains(9)) ||
                    (p1.contains(2) && p1.contains(5) && p1.contains(8)) ||
                    (p1.contains(3) && p1.contains(6) && p1.contains(9)) ||
                    (p1.contains(3) && p1.contains(5) && p1.contains(7)) ||
                    (p1.contains(4) && p1.contains(5) && p1.contains(6)) ||
                    (p1.contains(7) && p1.contains(8) && p1.contains(9))
                    )
            {
                player1Won = true;
                b = true;
            } else
            {
                player1Won = false;
            }
        }
        else if (s.equals("Player 2")) {
            if ((p2.contains(1) && p2.contains(2) && p2.contains(3)) ||
                    (p2.contains(1) && p2.contains(4) && p2.contains(7)) ||
                    (p2.contains(1) && p2.contains(5) && p2.contains(9)) ||
                    (p2.contains(2) && p2.contains(5) && p2.contains(8)) ||
                    (p2.contains(3) && p2.contains(6) && p2.contains(9)) ||
                    (p2.contains(3) && p2.contains(5) && p2.contains(7)) ||
                    (p2.contains(4) && p2.contains(5) && p2.contains(6)) ||
                    (p2.contains(7) && p2.contains(8) && p2.contains(9))
                    )
            {
                player2Won = true;
                b = true;
            } else
            {
                player2Won = false;
            }
        }
        return b;
    }
}
