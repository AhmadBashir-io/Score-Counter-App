package com.example.deliveryapp.scorecounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView chelseaGoal;
    private TextView arsenalGoal;
    private TextView chelseaFoul;
    private TextView arsenalFoul;

    private int chelseaPoint;
    private int arsenalPoint;
    private int chelseaFoulPoint;
    private int arsenalFoulPoint;

    private Button chelseaGoalButton;
    private Button arsenalGoalButton;
    private Button chelseaFoulButton;
    private Button arsenalFoulButton;
    private Button resetButton;


    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick (View view){
            switch (view.getId()){
                case R.id.chelseaGoalButton:
                    addChelseaScore();
                    break;
                case R.id.arsenalGoalButton:
                    addArsenalScore();
                    break;
                case R.id. chelseaFoulButton:
                    addChelseaFoul();
                    break;
                case R.id.arsenalFoulButton:
                    addArsenalFoul();
                    break;
                case R.id.resetButton:
                    resetValues();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arsenalGoalButton = (Button) findViewById(R.id.arsenalGoalButton);
        arsenalGoalButton.setOnClickListener(clickListener);

        chelseaGoalButton = (Button) findViewById(R.id.chelseaGoalButton);
        chelseaGoalButton.setOnClickListener(clickListener);

        chelseaFoulButton = (Button) findViewById(R.id.chelseaFoulButton);
        chelseaFoulButton.setOnClickListener(clickListener);

        arsenalFoulButton = (Button) findViewById(R.id.arsenalFoulButton);
        arsenalFoulButton.setOnClickListener(clickListener);

        resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(clickListener);

        chelseaGoal = (TextView) findViewById(R.id.chelseaGoal);
        arsenalGoal = (TextView) findViewById(R.id.arsenalGoal);
        chelseaFoul = (TextView) findViewById(R.id.chelseaFoul);
        arsenalFoul = (TextView) findViewById(R.id.arsenalFoul);

        resetValues();
    }

    private void resetValues (){

         chelseaPoint = 0;
         arsenalPoint = 0;
         chelseaFoulPoint= 0;
         arsenalFoulPoint = 0;
         chelseaGoal.setText(chelseaPoint + "");
         arsenalGoal.setText(arsenalPoint + "");
         arsenalFoul.setText(arsenalFoulPoint + "");
         chelseaFoul.setText(chelseaFoulPoint + "");

    }

    private void addChelseaScore (){
        chelseaPoint++;
        chelseaGoal.setText(chelseaPoint + "");
    }

    private void addArsenalScore (){
        arsenalPoint++;
        arsenalGoal.setText(arsenalPoint + "");
    }

    private void addChelseaFoul (){
        chelseaFoulPoint++;
        chelseaFoul.setText(chelseaFoulPoint + "");
    }

    private void addArsenalFoul (){
        arsenalFoulPoint++;
        arsenalFoul.setText(arsenalFoulPoint + "");
    }
}
