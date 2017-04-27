package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int breakTeamA = 0;
    int breakTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * add 3 score for Team A
     */
    public void add3ForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * add 2 score for Team A
     */
    public void add2ForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * add 1 score for Team A
     */
    public void add1ForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the break rule times for Team A.
     */
    public void displayBreakTeamA(int times) {
        TextView scoreView = (TextView) findViewById(R.id.break_times_a);
        scoreView.setText(String.valueOf(times));
    }
    /**
     * Minus 1 score for Team A.
     */
    public void breakRuleTeamA (View view){
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
        breakTeamA = breakTeamA + 1;
        displayBreakTeamA(breakTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * add 3 score for Team B
     */
    public void add3ForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * add 2 score for Team B
     */
    public void add2ForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * add 1 score for Team B
     */
    public void add1ForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the break rule times for Team B.
     */
    public void displayBreakTeamB(int times) {
        TextView scoreView = (TextView) findViewById(R.id.break_times_b);
        scoreView.setText(String.valueOf(times));
    }
    /**
     * Minus 1 score for Team B.
     */
    public void breakRuleTeamB (View view){
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
        breakTeamB = breakTeamB + 1;
        displayBreakTeamB(breakTeamB);
    }

    /**
     *Rest all scores and break rule times
     */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        breakTeamA = 0;
        breakTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayBreakTeamA(breakTeamA);
        displayBreakTeamB(breakTeamB);
    }
}
