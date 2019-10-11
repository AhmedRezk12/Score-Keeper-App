package com.example.scorekeeperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Statistics extends AppCompatActivity {

    public TextView GoalsView1;
    public TextView GoalsView2;
    public TextView ShotsView1;
    public TextView ShotsView2;
    public TextView OnTargetView1;
    public TextView OnTargetView2;
    public TextView FoulsView1;
    public TextView FoulsView2;
    public TextView YCardsView1;
    public TextView YCardsView2;
    public TextView RCardsView1;
    public TextView RCardsView2;
    public TextView OffsidesView1;
    public TextView OffsidesView2;
    public TextView TeamNameView1;
    public TextView TeamNameView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        GoalsView1 = findViewById(R.id.goals1);
        GoalsView2 = findViewById(R.id.goals2);
        ShotsView1 = findViewById(R.id.totalshots1);
        ShotsView2 = findViewById(R.id.totalshots2);
        OnTargetView1 = findViewById(R.id.ontarget1);
        OnTargetView2 = findViewById(R.id.ontarget2);
        FoulsView1 = findViewById(R.id.fouls1);
        FoulsView2 = findViewById(R.id.fouls2);
        YCardsView1 = findViewById(R.id.yellowcards1);
        YCardsView2 = findViewById(R.id.yellowcards2);
        RCardsView1 = findViewById(R.id.redcards1);
        RCardsView2 = findViewById(R.id.redcards2);
        OffsidesView1 = findViewById(R.id.offsides1);
        OffsidesView2 = findViewById(R.id.offsides2);
        TeamNameView1 = findViewById(R.id.team1ViewName);
        TeamNameView2 = findViewById(R.id.team2ViewName);
        Bundle extras = getIntent().getExtras();
        GoalsView1.setText(extras.getString("Goals1"));
        GoalsView2.setText(extras.getString("Goals2"));
        TeamNameView1.setText(extras.getString("NameTeam1"));
        TeamNameView2.setText(extras.getString("NameTeam2"));
        ShotsView1.setText(extras.getString("Shots1"));
        ShotsView2.setText(extras.getString("Shots2"));
        OnTargetView1.setText(extras.getString("OnTarget1"));
        OnTargetView2.setText(extras.getString("OnTarget2"));
        FoulsView1.setText(extras.getString("Fouls1"));
        FoulsView2.setText(extras.getString("Fouls2"));
        YCardsView1.setText(extras.getString("YellowCards1"));
        YCardsView2.setText(extras.getString("YellowCards2"));
        RCardsView1.setText(extras.getString("RedCards1"));
        RCardsView2.setText(extras.getString("RedCards2"));
        OffsidesView1.setText(extras.getString("Offsides1"));
        OffsidesView2.setText(extras.getString("Offsides2"));
    }

    public void ResetAndBack2Home(View view) {
        Intent intent = new Intent(Statistics.this,MainActivity.class);
        startActivity(intent);
    }
}
