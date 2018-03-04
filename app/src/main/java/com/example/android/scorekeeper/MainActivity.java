package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int foulTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamB = 0;
    /*The variables which keep track of the scores and fouls are declared in the class so that when
    they are changed by a functiontheir value can be saved and used by other functions after that.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        //displays the given value 'score' at the counter for Team A
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addSixForTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void foulTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA(foulTeamA);
    }

    public void displayFoulTeamA(int score) {
        //displays the given value 'score' at the foul counter for Team A
        TextView scoreView = findViewById(R.id.foulA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        //displays the given value 'score' at the counter for Team B
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addSixForTeamB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void foulTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulTeamB(foulTeamB);
    }

    public void displayFoulTeamB(int score) {
        //displays the given value 'score' at the foul counter for Team B
        TextView scoreView = findViewById(R.id.foulB);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        //resets the score and fouls of both teams
        scoreTeamA = 0;
        foulTeamA = 0;
        scoreTeamB = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayFoulTeamA(foulTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulTeamB(foulTeamB);
    }

}
