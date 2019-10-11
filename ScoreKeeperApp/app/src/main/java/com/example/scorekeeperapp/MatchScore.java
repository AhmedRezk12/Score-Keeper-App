package com.example.scorekeeperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MatchScore extends AppCompatActivity {
    public TextView TeamOneName;
    public TextView TeamTwoName;
    public TextView TeamOneScore;
    public TextView TeamTwoScore;
    public int GoalsForTeam1 = 0 ;
    public int GoalsForTeam2 = 0 ;
    public int ShotsForTeam1 = 0 ;
    public int ShotsForTeam2 = 0 ;
    public int ShotOnTargets1 = 0 ;
    public int ShotOnTargets2 = 0 ;
    public int FoulsForTeam1 = 0 ;
    public int FoulsForTeam2 = 0 ;
    public int YellowCardsTeam1 = 0 ;
    public int YellowCardsTeam2 = 0 ;
    public int RedCardsTeam1 = 0 ;
    public int RedCardsTeam2 = 0 ;
    public int OffsidesTeam1 = 0 ;
    public int OffsidesTeam2 = 0 ;
    public String teamname1 ;
    public String teamname2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_score);
        TeamOneName = findViewById(R.id.name1_team);
        TeamTwoName = findViewById(R.id.name2_team);
        Bundle extras = getIntent().getExtras();
        teamname1 = extras.getString("Team1Name");
        teamname2 = extras.getString("Team2Name");
        TeamOneName.setText(teamname1);
        TeamTwoName.setText(teamname2);
        DisplayScore1(GoalsForTeam1);
        DisplayScore2(GoalsForTeam2);

    }

    public void AddGoal1(View view) {
        GoalsForTeam1 = GoalsForTeam1 + 1 ;
        DisplayScore1(GoalsForTeam1);
    }

    public void AddShot1(View view) {
        ShotsForTeam1 = ShotsForTeam1 + 1;
    }

    public void AddShotOnTarger1(View view) {
        ShotOnTargets1 = ShotOnTargets1 + 1 ;
    }

    public void AddFoul1(View view) {
        FoulsForTeam1 = FoulsForTeam1 + 1 ;
    }

    public void AddYellowCard1(View view) {
        YellowCardsTeam1 = YellowCardsTeam1 + 1 ;
    }

    public void AddRedCard1(View view) {
        RedCardsTeam1 = RedCardsTeam1 + 1 ;
    }

    public void AddOffside1(View view) {
        OffsidesTeam1 = OffsidesTeam1 + 1 ;
    }

    public void AddGoal2(View view) {
        GoalsForTeam2 = GoalsForTeam2 + 1 ;
        DisplayScore2(GoalsForTeam2);
    }

    public void AddShot2(View view) {
        ShotsForTeam2 = ShotsForTeam2 + 1 ;
    }

    public void AddShotOnTarger2(View view) {
        ShotOnTargets2 = ShotOnTargets2 + 1 ;
    }

    public void AddFoul2(View view) {
        FoulsForTeam2 = FoulsForTeam2 + 1 ;
    }

    public void AddYellowCard2(View view) {
        YellowCardsTeam2 = YellowCardsTeam2 + 1 ;
    }

    public void AddRedCard2(View view) {
        RedCardsTeam2 = RedCardsTeam2 + 1 ;
    }

    public void AddOffside2(View view) {
        OffsidesTeam2 = OffsidesTeam2 + 1 ;

    }

    public void GetSTATS(View view) {
        Intent intent = new Intent(MatchScore.this,Statistics.class);
        intent.putExtra("Goals1",Integer.toString(GoalsForTeam1));
        intent.putExtra("Goals2",Integer.toString(GoalsForTeam2));
        intent.putExtra("Shots1",Integer.toString(ShotsForTeam1));
        intent.putExtra("Shots2",Integer.toString(ShotsForTeam2));
        intent.putExtra("OnTarget1",Integer.toString(ShotOnTargets1));
        intent.putExtra("OnTarget2",Integer.toString(ShotOnTargets2));
        intent.putExtra("Fouls1",Integer.toString(FoulsForTeam1));
        intent.putExtra("Fouls2",Integer.toString(FoulsForTeam2));
        intent.putExtra("YellowCards1",Integer.toString(YellowCardsTeam1));
        intent.putExtra("YellowCards2",Integer.toString(YellowCardsTeam2));
        intent.putExtra("RedCards1",Integer.toString(RedCardsTeam1));
        intent.putExtra("RedCards2",Integer.toString(RedCardsTeam2));
        intent.putExtra("Offsides1",Integer.toString(OffsidesTeam1));
        intent.putExtra("Offsides2",Integer.toString(OffsidesTeam2));
        intent.putExtra("NameTeam1",teamname1);
        intent.putExtra("NameTeam2",teamname2);
        startActivity(intent);
    }
    private void DisplayScore1(int score){
        TeamOneScore = findViewById(R.id.score1_team);
        TeamOneScore.setText(Integer.toString(score));

    }
    private void DisplayScore2(int score){
        TeamTwoScore = findViewById(R.id.score2_team);
        TeamTwoScore.setText(Integer.toString(score));
    }
}
