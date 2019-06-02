package com.dzifa.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.deliveryapp.scorecounter.R;

public class DisplayScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView chelseaGoal = (TextView) findViewById(R.id.chelseaGoal);int score = 0;
        score = score + 1;
        String strResult = String.valueOf(score);
        chelseaGoal.setText(score);
        setContentView(R.layout.activity_display_score);
    }
}
