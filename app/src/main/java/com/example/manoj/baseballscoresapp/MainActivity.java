package com.example.manoj.baseballscoresapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.String;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    int ballsTeamA=0;
    int ballsTeamB=0;
    int strikeTeamA=0;
    int strikeTeamB=0;
    int outPersonTeamA=0;
    int outPersonTeamB=0;
    int runsTeamA=0;
    int runsTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addRunForTeamA(View view){
        runsTeamA=runsTeamA+1;
        displayRunForTeamA(runsTeamA);
    }

    public void displayRunForTeamA(int runs){
        TextView numberOfRuns=(TextView)findViewById(R.id.team_a_run);
        numberOfRuns.setText(String.valueOf(runs));
    }



    public void addOneBallTeamA(View view){
        ballsTeamA=ballsTeamA+1;
        displayBallsTeamA(ballsTeamA);
        if(ballsTeamA>=3){
            strikeTeamA=0;
            ballsTeamA=0;
            displayStrikesTeamA(strikeTeamA);
            displayBallsTeamA(ballsTeamA);
            displayMessage("Sorry.. Your Team is Out..Now turn Opposite team ");
             //if balls more than 3 and strike would be 0 and team change for housing
        }
    }

    public void displayBallsTeamA(int balls){
        TextView numberOfBalls=(TextView)findViewById(R.id.team_a_ball);
        numberOfBalls.setText(String.valueOf(balls));
    }


    public void addStrikeTeamA(View view){
       strikeTeamA=strikeTeamA+1;
        displayStrikesTeamA(strikeTeamA);

        if(strikeTeamA>2){
            outPersonTeamA=outPersonTeamA+1;

            displayOutPlayerTeamA(outPersonTeamA);
            strikeTeamA=0;
            ballsTeamA=0;
            displayStrikesTeamA(strikeTeamA);
            displayBallsTeamA(ballsTeamA);

            //if strike more than 2 than it would be out person and strike and balls be set 0
        }
    }

    public void displayStrikesTeamA(int strikes){
        TextView numberOfStrikes=(TextView)findViewById(R.id.team_a_strike);
        numberOfStrikes.setText(String.valueOf(strikes));
    }

    public void outPlayersTeamA(View view){
         outPersonTeamA=outPersonTeamA+1;
         displayOutPlayerTeamA(outPersonTeamA);

        if(outPersonTeamA>=3){

            displayMessage("Sorry.. Your Team is Out..Now turn Opposite team ");
            //out more than 3 in one team than this team would be defence and opposite turn for offence
        }


    }
    public void displayOutPlayerTeamA(int outPlayer){
        TextView numberOfOutPlayers=(TextView)findViewById(R.id.team_a_out);
        numberOfOutPlayers.setText(String.valueOf(outPlayer));
    }

    public void displayMessage(String info){
        TextView msg=(TextView)findViewById(R.id.msg_tv);
        msg.setText(info);
    }


    //Code for TeamB

    public void addRunForTeamB(View view){
        runsTeamB=runsTeamB+1;
        displayRunForTeamB(runsTeamB);
    }

    public void displayRunForTeamB(int runs){
        TextView numberOfRuns=(TextView)findViewById(R.id.team_b_run);
        numberOfRuns.setText(String.valueOf(runs));
    }


    public void addOneBallTeamB(View view){
        ballsTeamB=ballsTeamB+1;
        displayBallsTeamB(ballsTeamB);
        if(ballsTeamB>=3){
            strikeTeamB=0;
            ballsTeamB=0;
            displayStrikesTeamB(strikeTeamB);
            displayBallsTeamB(ballsTeamB);
            displayMessage("Sorry.. Your Team is Out..Now turn Opposite team ");
            //if balls more than 3 and strike would be 0 and team change for housing
        }
    }

    public void displayBallsTeamB(int balls){
        TextView numberOfBalls=(TextView)findViewById(R.id.team_b_ball);
        numberOfBalls.setText(String.valueOf(balls));
    }


    public void addStrikeTeamB(View view){
        strikeTeamB=strikeTeamB+1;
        displayStrikesTeamB(strikeTeamB);

        if(strikeTeamB>2){
            outPersonTeamB=outPersonTeamB+1;

            displayOutPlayerTeamB(outPersonTeamB);
            strikeTeamB=0;
            ballsTeamB=0;
            displayStrikesTeamB(strikeTeamB);
            displayBallsTeamB(ballsTeamB);

            //if strike more than 2 than it would be out person and strike and balls be set 0
        }
    }

    public void displayStrikesTeamB(int strikes){
        TextView numberOfStrikes=(TextView)findViewById(R.id.team_b_strike);
        numberOfStrikes.setText(String.valueOf(strikes));
    }

    public void outPlayersTeamB(View view){
        outPersonTeamB=outPersonTeamB+1;
        displayOutPlayerTeamB(outPersonTeamB);

        if(outPersonTeamB>=3){

            displayMessage("Sorry.. Your Team is Out..Now turn Opposite team ");
            //out more than 3 in one team than this team would be defence and opposite turn for offence
        }
    }
    public void displayOutPlayerTeamB(int outPlayer){
        TextView numberOfOutPlayers=(TextView)findViewById(R.id.team_b_out);
        numberOfOutPlayers.setText(String.valueOf(outPlayer));
    }


    public void reset(View view){

        int ballsTeamA=0;
        int ballsTeamB=0;
        int strikeTeamA=0;
        int strikeTeamB=0;
        int outPersonTeamA=0;
        int outPersonTeamB=0;
        int runsTeamA=0;
        int runsTeamB=0;
        displayRunForTeamA(runsTeamA);
        displayRunForTeamB(runsTeamB);
        displayBallsTeamA(ballsTeamA);
        displayBallsTeamB(ballsTeamB);
        displayStrikesTeamA(strikeTeamA);
        displayStrikesTeamB(strikeTeamB);
        displayOutPlayerTeamA(outPersonTeamA);
        displayOutPlayerTeamB(outPersonTeamB);
        displayMessage("Welcome....");
    }


}
