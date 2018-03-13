package com.example.poojan.score;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int Ascore=0;
    int Bscore=0;
    //Button mybutton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void Apoint3(View view) {
        Ascore= Ascore + 3;
        displayForTeamA(Ascore);
    }
    public void Apoint2(View view) {
        Ascore = Ascore + 2;
        displayForTeamA(Ascore);
    }
    public void Afreepoint(View view) {
        Ascore = Ascore + 1;
        displayForTeamA(Ascore);
    }
    public void Bpoint3(View view) {
        Bscore= Bscore + 3;
        displayForTeamB(Bscore);
    }
    public void Bpoint2(View view) {
        Bscore= Bscore + 2;
        displayForTeamB(Bscore);
    }
    public void Bfreepoint(View view) {
        Bscore= Bscore + 1;
        displayForTeamB(Bscore);
    }
    public void reset(View view) {
        Ascore=0;
        Bscore=0;
        displayForTeamA(Ascore);
        displayForTeamB(Bscore);
    }
    public void popup(View view)
    {
        if(Ascore>Bscore)
        {
            Toast toast= Toast.makeText(MainActivity.this,
                    "Team A wins", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();

        }
        else if(Ascore==Bscore)
        {Toast toast= Toast.makeText(MainActivity.this,
                "Match Tie", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();
        }
        else
        {Toast toast= Toast.makeText(MainActivity.this,
                "Team B wins", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();
        }
    }


}
