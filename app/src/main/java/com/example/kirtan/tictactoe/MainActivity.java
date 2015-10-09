package com.example.kirtan.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Tictactoe game = new Tictactoe();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button restart = (Button) findViewById(R.id.restart);
        final TextView p = (TextView) findViewById(R.id.player);
        p.setText(game.getPlayer());

        View.OnClickListener but1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.getText().equals("") && (p.getText().equals("Player 1") || p.getText().equals("Player 2")))
                {
                    game.clickButton(game.getPlayer(), 1);
                    button1.setText(game.getXO());
                    if(game.checkForWin(game.getPlayer()) == true)
                    {
                        p.setText(game.won());
                    }
                    else {
                        game.alternatePlayer();
                        p.setText(game.getPlayer());
                    }
                }
            }
        };

        View.OnClickListener but2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button2.getText().equals("") && (p.getText().equals("Player 1") || p.getText().equals("Player 2")))
                {
                    game.clickButton(game.getPlayer(), 2);
                    button2.setText(game.getXO());
                    if(game.checkForWin(game.getPlayer()) == true)
                    {
                        p.setText(game.won());
                    }
                    else {
                        game.alternatePlayer();
                        p.setText(game.getPlayer());
                    }
                }
            }
        };

        View.OnClickListener but3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button3.getText().equals("") && (p.getText().equals("Player 1") || p.getText().equals("Player 2")))
                {
                    game.clickButton(game.getPlayer(), 3);
                    button3.setText(game.getXO());
                    if(game.checkForWin(game.getPlayer()) == true)
                    {
                        p.setText(game.won());
                    }
                    else {
                        game.alternatePlayer();
                        p.setText(game.getPlayer());
                    }
                }
            }
        };

        View.OnClickListener but4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button4.getText().equals("") && (p.getText().equals("Player 1") || p.getText().equals("Player 2")))
                {
                    game.clickButton(game.getPlayer(), 4);
                    button4.setText(game.getXO());
                    if(game.checkForWin(game.getPlayer()) == true)
                    {
                        p.setText(game.won());
                    }
                    else {
                        game.alternatePlayer();
                        p.setText(game.getPlayer());
                    }
                }
            }
        };

        View.OnClickListener but5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button5.getText().equals("") && (p.getText().equals("Player 1") || p.getText().equals("Player 2")))
                {
                    game.clickButton(game.getPlayer(), 5);
                    button5.setText(game.getXO());
                    if(game.checkForWin(game.getPlayer()) == true)
                    {
                        p.setText(game.won());
                    }
                    else {
                        game.alternatePlayer();
                        p.setText(game.getPlayer());
                    }
                }
            }
        };

        View.OnClickListener but6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button6.getText().equals("") && (p.getText().equals("Player 1") || p.getText().equals("Player 2")))
                {
                    game.clickButton(game.getPlayer(), 6);
                    button6.setText(game.getXO());
                    if(game.checkForWin(game.getPlayer()) == true)
                    {
                        p.setText(game.won());
                    }
                    else {
                        game.alternatePlayer();
                        p.setText(game.getPlayer());
                    }
                }
            }
        };

        View.OnClickListener but7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button7.getText().equals("") && (p.getText().equals("Player 1") || p.getText().equals("Player 2")))
                {
                    game.clickButton(game.getPlayer(), 7);
                    button7.setText(game.getXO());
                    if(game.checkForWin(game.getPlayer()) == true)
                    {
                        p.setText(game.won());
                    }
                    else {
                        game.alternatePlayer();
                        p.setText(game.getPlayer());
                    }
                }
            }
        };

        View.OnClickListener but8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button8.getText().equals("") && (p.getText().equals("Player 1") || p.getText().equals("Player 2")))
                {
                    game.clickButton(game.getPlayer(), 8);
                    button8.setText(game.getXO());
                    if(game.checkForWin(game.getPlayer()) == true)
                    {
                        p.setText(game.won());
                    }
                    else {
                        game.alternatePlayer();
                        p.setText(game.getPlayer());
                    }
                }
            }
        };

        View.OnClickListener but9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button9.getText().equals("") && (p.getText().equals("Player 1") || p.getText().equals("Player 2")))
                {
                    game.clickButton(game.getPlayer(), 9);
                    button9.setText(game.getXO());
                    if(game.checkForWin(game.getPlayer()) == true)
                    {
                        p.setText(game.won());
                    }
                    else {
                        game.alternatePlayer();
                        p.setText(game.getPlayer());
                    }
                }
            }
        };

        View.OnClickListener redo = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game = new Tictactoe();
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                p.setText(game.getPlayer());
            }
        };

        button1.setOnClickListener(but1);
        button2.setOnClickListener(but2);
        button3.setOnClickListener(but3);
        button4.setOnClickListener(but4);
        button5.setOnClickListener(but5);
        button6.setOnClickListener(but6);
        button7.setOnClickListener(but7);
        button8.setOnClickListener(but8);
        button9.setOnClickListener(but9);
        restart.setOnClickListener(redo);
    }
}
