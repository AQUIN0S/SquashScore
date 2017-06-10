package com.example.android.squashscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pointsPlayer1 = 0;
    private int gamesPlayer1 = 0;
    private int pointsPlayer2 = 0;
    private int gamesPlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Methods to change and view Player 1's points.
     */

    public void addPointPlayer1(View view) {

        this.pointsPlayer1 += 1;
        displayPlayer1Points();

    }

    public void takePointPlayer1(View view) {

        if (this.pointsPlayer1 <= 0) {
            this.pointsPlayer1 = 0;
        } else {
            this.pointsPlayer1 -= 1;
        }

        displayPlayer1Points();

    }

    private void displayPlayer1Points() {

        TextView player1PointsView = (TextView) findViewById(R.id.score_player_1);
        String player1Points = Integer.toString(this.pointsPlayer1);
        player1PointsView.setText(player1Points);

    }


    /**
     * Methods to change and view Player 1's games
     */

    public void addGamePlayer1(View view) {

        this.gamesPlayer1 += 1;
        displayPlayer1Games();

    }

    public void takeGamePlayer1(View view) {

        if (this.gamesPlayer1 <= 0) {
            this.gamesPlayer1 = 0;
        } else {
            this.gamesPlayer1 -= 1;
        }

        displayPlayer1Games();

    }

    private void displayPlayer1Games() {

        TextView player1GamesView = (TextView) findViewById(R.id.games_player_1);
        String player1Games = "Games: " + Integer.toString(this.gamesPlayer1);
        player1GamesView.setText(player1Games);

    }


    /**
     * Methods to change and view Player 2's points.
     */

    public void addPointPlayer2(View view) {

        this.pointsPlayer2 += 1;
        displayPlayer2Points();

    }

    public void takePointPlayer2(View view) {

        if (this.pointsPlayer2 <= 0) {
            this.pointsPlayer2 = 0;
        } else {
            this.pointsPlayer2 -= 1;
        }

        displayPlayer2Points();

    }

    private void displayPlayer2Points() {

        TextView player2PointsView = (TextView) findViewById(R.id.score_player_2);
        String player2Points = Integer.toString(this.pointsPlayer2);
        player2PointsView.setText(player2Points);

    }


    /**
     * Methods to change and view Player 2's games
     */

    public void addGamePlayer2(View view) {

        this.gamesPlayer2 += 1;
        displayPlayer2Games();

    }

    public void takeGamePlayer2(View view) {

        if (this.gamesPlayer2 <= 0) {
            this.gamesPlayer2 = 0;
        } else {
            this.gamesPlayer2 -= 1;
        }

        displayPlayer2Games();

    }

    private void displayPlayer2Games() {

        TextView player2GamesView = (TextView) findViewById(R.id.games_player_2);
        String player2Games = "Games: " + Integer.toString(this.gamesPlayer2);
        player2GamesView.setText(player2Games);

    }


    /**
     * Method to reset all values
     */

    public void resetMatch(View view) {

        this.pointsPlayer1 = 0;
        this.gamesPlayer1 = 0;
        this.pointsPlayer2 = 0;
        this.gamesPlayer2 = 0;

        displayPlayer1Points();
        displayPlayer1Games();
        displayPlayer2Points();
        displayPlayer2Games();

    }

}
