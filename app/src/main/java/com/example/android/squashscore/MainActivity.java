package com.example.android.squashscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private int pointsPlayer1 = 0;
    private int gamesPlayer1 = 0;
    private int pointsPlayer2 = 0;
    private int gamesPlayer2 = 0;

    @BindView(R.id.score_player_1) TextView player1PointsView;
    @BindView(R.id.games_player_1) TextView player1GamesView;
    @BindView(R.id.score_player_2) TextView player2PointsView;
    @BindView(R.id.games_player_2) TextView player2GamesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    /**
     * Methods to change and view Player 1's points.
     */

    @OnClick(R.id.add_point_button_p1)
    public void addPointPlayer1() {

        this.pointsPlayer1 += 1;
        displayPlayer1Points();

    }

    @OnClick(R.id.take_point_button_p1)
    public void takePointPlayer1() {

        if (this.pointsPlayer1 <= 0) {
            this.pointsPlayer1 = 0;
        } else {
            this.pointsPlayer1 -= 1;
        }

        displayPlayer1Points();

    }

    private void displayPlayer1Points() {

        String player1Points = Integer.toString(this.pointsPlayer1);
        this.player1PointsView.setText(player1Points);

    }


    /**
     * Methods to change and view Player 1's games
     */

    @OnClick(R.id.add_game_button_p1)
    public void addGamePlayer1() {

        this.gamesPlayer1 += 1;
        displayPlayer1Games();

    }

    @OnClick(R.id.take_game_button_p1)
    public void takeGamePlayer1() {

        if (this.gamesPlayer1 <= 0) {
            this.gamesPlayer1 = 0;
        } else {
            this.gamesPlayer1 -= 1;
        }

        displayPlayer1Games();

    }

    private void displayPlayer1Games() {

        String player1Games = "Games: " + Integer.toString(this.gamesPlayer1);
        this.player1GamesView.setText(player1Games);

    }


    /**
     * Methods to change and view Player 2's points.
     */

    @OnClick(R.id.add_point_button_p2)
    public void addPointPlayer2() {

        this.pointsPlayer2 += 1;
        displayPlayer2Points();

    }

    @OnClick(R.id.take_point_button_p2)
    public void takePointPlayer2() {

        if (this.pointsPlayer2 <= 0) {
            this.pointsPlayer2 = 0;
        } else {
            this.pointsPlayer2 -= 1;
        }

        displayPlayer2Points();

    }

    private void displayPlayer2Points() {

        String player2Points = Integer.toString(this.pointsPlayer2);
        this.player2PointsView.setText(player2Points);

    }


    /**
     * Methods to change and view Player 2's games
     */

    @OnClick(R.id.add_game_button_p2)
    public void addGamePlayer2() {

        this.gamesPlayer2 += 1;
        displayPlayer2Games();

    }

    @OnClick(R.id.take_game_button_p2)
    public void takeGamePlayer2() {

        if (this.gamesPlayer2 <= 0) {
            this.gamesPlayer2 = 0;
        } else {
            this.gamesPlayer2 -= 1;
        }

        displayPlayer2Games();

    }

    private void displayPlayer2Games() {

        String player2Games = "Games: " + Integer.toString(this.gamesPlayer2);
        this.player2GamesView.setText(player2Games);

    }


    /**
     * Method to reset all values
     */

    @OnClick(R.id.reset_button)
    public void resetMatch() {

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
