package com.example.scorekeeperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText FirstTeamName ;
    private EditText SecondTeamName ;
    private Button StartMatch ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstTeamName = findViewById(R.id.team1_name);
        SecondTeamName = findViewById(R.id.team2_name);
        StartMatch = findViewById(R.id.startButton);
        FirstTeamName.addTextChangedListener(CheckTeamNameInput);
        SecondTeamName.addTextChangedListener(CheckTeamNameInput);
    }
    private TextWatcher CheckTeamNameInput = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String FirstNameInput = FirstTeamName.getText().toString().trim();
            String SecondNameInput = SecondTeamName.getText().toString().trim();
            StartMatch.setEnabled(!FirstNameInput.isEmpty() && !SecondNameInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {
        }

    };

    public void GoToMatch(View view) {
        Toast.makeText(MainActivity.this, "Start Match", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,MatchScore.class);
        intent.putExtra("Team1Name",FirstTeamName.getText().toString());
        intent.putExtra("Team2Name",SecondTeamName.getText().toString());
        startActivity(intent);

    }
}
