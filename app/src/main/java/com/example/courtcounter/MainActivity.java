package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore;
    int teamBScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Adding 3 points to Team A score
    public void add3ForTeamA(View view){
        teamAScore+=3;
        displayForTeamA(teamAScore);
    }
    // Adding 2 points to Team A score
    public void add2ForTeamA(View view){
        teamAScore+=2;
        displayForTeamA(teamAScore);
    }
    // Adding 1 point to Team A score
    public void addFreeThrowForTeamA(View view){
        teamAScore+=1;
        displayForTeamA(teamAScore);
    }
    // Adding 3 points for Team B
    public void add3ForTeamB(View view){
        teamBScore+=3;
        displayForTeamB(teamBScore);
    }
    //Adding 2 points for Team B
    public void add2ForTeamB(View view){
        teamBScore+=2;
        displayForTeamB(teamBScore);
    }
    // Adding 1 point for Team B
    public void addFreeThrowForTeamB(View view){
        teamBScore+=1;
        displayForTeamB(teamBScore);
    }

    /**
     * This method is called when RESULT button is clicked
     */
    public void showResult(View view){
        int res;
        if (teamAScore > teamBScore) {
            res = teamAScore - teamBScore;
            String str = "Team A wins by "+res+" points";
            displayResult(str);
        }
        else if (teamAScore < teamBScore) {
            res = teamBScore - teamAScore;
            String str = "Team B wins by "+res+" points";
            displayResult(str);
        }
        else {
            String str = "Match is Tie";
            displayResult(str);
        }
    }

    /**
     * This method is called when RESET button is clicked
     */
    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        String str = "";
        displayResult(str);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
    /**
     * Displays the given score of Team A
     */
    public void displayForTeamA(int scoreA){
        TextView scoreView = (TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * Displays the given score of Team B
     */
    public void displayForTeamB(int scoreB){
        TextView scoreView = (TextView) findViewById(R.id.teamB);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * Displays the result of the match
     */
    public void displayResult(String string){
        TextView scoreView = (TextView) findViewById(R.id.result_text_view);
        scoreView.setText(String.valueOf(string));
    }

}