package com.example.android.rugbyscoringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int tryTeamA;
    private int conversionTeamA;
    private int penaltyTeamA;
    private int dropGoalTeamA;
    private int scoreTeamB;
    private int tryTeamB;
    private int conversionTeamB;
    private int penaltyTeamB;
    private int dropGoalTeamB;

    private String mScoreTeamA = "scoreTeamA";
    private String mTryTeamA = "tryTeamA";
    private String mConversionTeamA = "conversionTeamA";
    private String mPenaltyTeamA = "penaltyTeamA";
    private String mDropGoalTeamA = "dropGoalTeamA";
    private String mScoreTeamB = "scoreTeamB";
    private String mTryTeamB = "tryTeamB";
    private String mConversionTeamB = "conversionTeamB";
    private String mPenaltyTeamB = "penaltyTeamB";
    private String mDropGoalTeamB = "dropGoalTeamB";

    private TextView scoreTeamATextView;
    private TextView triesTeamATextView;
    private TextView conversionsTeamATextView;
    private TextView penaltiesTeamATextView;
    private TextView dropGoalsTeamATextView;
    private TextView scoreTeamBTextView;
    private TextView triesTeamBTextView;
    private TextView conversionsTeamBTextView;
    private TextView penaltiesTeamBTextView;
    private TextView dropGoalsTeamBTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamATextView = findViewById(R.id.score_team_a);
        triesTeamATextView = findViewById(R.id.try_team_a);
        conversionsTeamATextView = findViewById(R.id.conversion_team_a);
        penaltiesTeamATextView = findViewById(R.id.penalty_team_a);
        dropGoalsTeamATextView = findViewById(R.id.drop_goal_team_a);
        scoreTeamBTextView = findViewById(R.id.score_team_b);
        triesTeamBTextView = findViewById(R.id.try_team_b);
        conversionsTeamBTextView = findViewById(R.id.conversion_team_b);
        penaltiesTeamBTextView = findViewById(R.id.penalty_team_b);
        dropGoalsTeamBTextView = findViewById(R.id.drop_goal_team_b);
        displayScoreTeamA(0);
        displayScoreTeamB(0);
        displayTryTeamA(0);
        displayTryTeamB(0);
        displayConversionTeamA(0);
        displayConversionTeamB(0);
        displayPenaltyTeamA(0);
        displayPenaltyTeamB(0);
        displayDropGoalTeamA(0);
        displayDropGoalTeamB(0);
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(mScoreTeamA, scoreTeamA);
        savedInstanceState.putInt(mScoreTeamB, scoreTeamB);
        savedInstanceState.putInt(mTryTeamA, tryTeamA);
        savedInstanceState.putInt(mTryTeamB, tryTeamB);
        savedInstanceState.putInt(mConversionTeamA, conversionTeamA);
        savedInstanceState.putInt(mConversionTeamB, conversionTeamB);
        savedInstanceState.putInt(mPenaltyTeamA, penaltyTeamA);
        savedInstanceState.putInt(mPenaltyTeamB, penaltyTeamB);
        savedInstanceState.putInt(mDropGoalTeamA, dropGoalTeamA);
        savedInstanceState.putInt(mDropGoalTeamB, dropGoalTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt(mScoreTeamA);
        scoreTeamB = savedInstanceState.getInt(mScoreTeamB);
        tryTeamA = savedInstanceState.getInt(mTryTeamA);
        tryTeamB = savedInstanceState.getInt(mTryTeamB);
        conversionTeamA = savedInstanceState.getInt(mConversionTeamA);
        conversionTeamB = savedInstanceState.getInt(mConversionTeamB);
        penaltyTeamA = savedInstanceState.getInt(mPenaltyTeamA);
        penaltyTeamB = savedInstanceState.getInt(mPenaltyTeamB);
        dropGoalTeamA = savedInstanceState.getInt(mDropGoalTeamA);
        dropGoalTeamB = savedInstanceState.getInt(mDropGoalTeamB);
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayTryTeamA(tryTeamA);
        displayTryTeamB(tryTeamB);
        displayConversionTeamA(conversionTeamA);
        displayConversionTeamB(conversionTeamB);
        displayPenaltyTeamA(penaltyTeamA);
        displayPenaltyTeamB(penaltyTeamB);
        displayDropGoalTeamA(dropGoalTeamA);
        displayDropGoalTeamB(dropGoalTeamB);
    }

    /**
     * This method describes what happens when you click Try for Team A
     */
    public void tryForTeamA(View view) {
        final int TRYFORTEAMA = 5;
        scoreTeamA = scoreTeamA + TRYFORTEAMA;
        tryTeamA++;
        displayScoreTeamA(scoreTeamA);
        displayTryTeamA(tryTeamA);
    }

    /**
     * This method describes what happens when you click Conversion for Team A
     */
    public void conversionForTeamA(View view) {
        final int CONVERSIONFORTEAMA = 2;
        scoreTeamA = scoreTeamA + CONVERSIONFORTEAMA;
        conversionTeamA = conversionTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        displayConversionTeamA(conversionTeamA);
    }

    /**
     * This method describes what happens when you click Penalty for Team A
     */
    public void penaltyForTeamA(View view) {
        final int PENALTYFORTEAMA = 3;
        scoreTeamA = scoreTeamA + PENALTYFORTEAMA;
        penaltyTeamA = penaltyTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        displayPenaltyTeamA(penaltyTeamA);
    }

    /**
     * This method describes what happens when you click Drop Goal for Team A
     */
    public void dropGoalForTeamA(View view) {
        final int DROPGOALFORTEAMA = 3;
        scoreTeamA = scoreTeamA + DROPGOALFORTEAMA;
        dropGoalTeamA = dropGoalTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        displayDropGoalTeamA(dropGoalTeamA);
    }

    /**
     * This method describes what happens when you click Try for Team B
     */
    public void tryForTeamB(View view) {
        final int TRYFORTEAMB = 5;
        scoreTeamB = scoreTeamB + TRYFORTEAMB;
        tryTeamB = tryTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        displayTryTeamB(tryTeamB);
    }

    /**
     * This method describes what happens when you click Conversion for Team B
     */
    public void conversionForTeamB(View view) {
        final int CONVERSIONFORTEAMB = 2;
        scoreTeamB = scoreTeamB + CONVERSIONFORTEAMB;
        conversionTeamB = conversionTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        displayConversionTeamB(conversionTeamB);
    }

    /**
     * This method describes what happens when you click Penalty for Team B
     */
    public void penaltyForTeamB(View view) {
        final int PENALTYFORTEAMB = 3;
        scoreTeamB = scoreTeamB + PENALTYFORTEAMB;
        penaltyTeamB = penaltyTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        displayPenaltyTeamB(penaltyTeamB);
    }

    /**
     * This method describes what happens when you click Drop Goal for Team B
     */
    public void dropGoalForTeamB(View view) {
        final int DROPGOALFORTEAMB = 3;
        scoreTeamB = scoreTeamB + DROPGOALFORTEAMB;
        dropGoalTeamB = dropGoalTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        displayDropGoalTeamB(dropGoalTeamB);
    }

    /**
     * This method describes what happens when you click the reset button
     */
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        tryTeamA = 0;
        tryTeamB = 0;
        conversionTeamA = 0;
        conversionTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        dropGoalTeamA = 0;
        dropGoalTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayTryTeamA(tryTeamA);
        displayTryTeamB(tryTeamB);
        displayConversionTeamA(conversionTeamA);
        displayConversionTeamB(conversionTeamB);
        displayPenaltyTeamA(penaltyTeamA);
        displayPenaltyTeamB(penaltyTeamB);
        displayDropGoalTeamA(dropGoalTeamA);
        displayDropGoalTeamB(dropGoalTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamA(int score) {
        scoreTeamATextView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreTeamB(int score) {
        scoreTeamBTextView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of tries for Team A.
     */
    public void displayTryTeamA(int tries) {
        triesTeamATextView.setText(String.valueOf(tries));
    }

    /**
     * Displays the number of conversions for Team A.
     */
    public void displayConversionTeamA(int conversions) {
        conversionsTeamATextView.setText(String.valueOf(conversions));
    }

    /**
     * Displays the number of penalties for Team A.
     */
    public void displayPenaltyTeamA(int penalties) {
        penaltiesTeamATextView.setText(String.valueOf(penalties));
    }

    /**
     * Displays the number of drop goals for Team A.
     */
    public void displayDropGoalTeamA(int dropGoals) {
        dropGoalsTeamATextView.setText(String.valueOf(dropGoals));
    }

    /**
     * Displays the number of tries for Team B.
     */
    public void displayTryTeamB(int tries) {
        triesTeamBTextView.setText(String.valueOf(tries));
    }

    /**
     * Displays the number of conversions for Team B.
     */
    public void displayConversionTeamB(int conversions) {
        conversionsTeamBTextView.setText(String.valueOf(conversions));
    }

    /**
     * Displays the number of penalties for Team B.
     */
    public void displayPenaltyTeamB(int penalties) {
        penaltiesTeamBTextView.setText(String.valueOf(penalties));
    }

    /**
     * Displays the number of drop goals for Team B.
     */
    public void displayDropGoalTeamB(int dropGoals) {
        dropGoalsTeamBTextView.setText(String.valueOf(dropGoals));
    }
}