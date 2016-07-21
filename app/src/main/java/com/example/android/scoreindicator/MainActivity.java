package com.example.android.scoreindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int sc1=0;
    int sc2=0;
    int sc1wd=0;
    int sc2wd=0;
    int numberofpt3team1=0;
    int numberofpt2team1=0;
    int numberofpt1team1=0;
    int numberofpt3team2=0;
    int numberofpt2team2=0;
    int numberofpt1team2=0;


    public void pt3for1(View view) {
        sc1wd=sc1;
        sc1= sc1 + 3;
        display1(sc1);
        numberofpt3team1= numberofpt3team1 + 1;

    }
    public void pt3for2(View view) {
        sc2wd=sc2;
        sc2= sc2 + 3;
        display2(sc2);
        numberofpt3team2= numberofpt3team2 + 1;

    }
    public void pt2for1(View view) {
        sc1wd=sc1;
        sc1= sc1 + 2;
        display1(sc1);
        numberofpt2team1= numberofpt2team1 + 1;

    }
    public void pt2for2(View view) {
        sc2wd=sc2;
        sc2= sc2 + 2;
        display2(sc2);
        numberofpt2team2= numberofpt2team2 + 1;

    }
    public void pt1for1(View view) {
        sc1wd=sc1;
        sc1= sc1 + 1;
        display1(sc1);
        numberofpt1team1= numberofpt1team1 + 1;

    }
    public void pt1for2(View view) {
        sc2wd=sc2;
        sc2= sc2 + 1;
        display2(sc2);
        numberofpt1team2= numberofpt1team2 + 1;

    }
    public void wd1(View view){
        if (sc1-sc1wd == 3) {
            numberofpt3team1= numberofpt3team1 - 1;
            displaypt3forteam1(numberofpt3team1);
        } else if (sc1 - sc1wd == 2) {
            numberofpt2team1= numberofpt2team1 - 1;
            displaypt2forteam1(numberofpt2team1);
        } else if (sc1 - sc1wd == 1) {
           numberofpt1team1= numberofpt1team1 - 1;
            displaypt1forteam1(numberofpt1team1);
        } else {}
        display1(sc1wd);
        sc1=sc1wd;
    }
    public void wd2(View view){
        if (sc2-sc2wd == 3) {
            numberofpt3team2= numberofpt3team2 - 1;
            displaypt3forteam2(numberofpt3team2);
        } else if (sc2 - sc2wd == 2) {
            numberofpt2team2= numberofpt2team2 - 1;
            displaypt2forteam2(numberofpt2team2);
        } else if (sc2 - sc2wd == 1)  {
            numberofpt1team2= numberofpt1team2 - 1;
            displaypt1forteam2(numberofpt1team2);
        } else {}
        display2(sc2wd);
        sc2=sc2wd;
    }
    private void display1(int number) {
        TextView score1show = (TextView) findViewById(
                R.id.score1);
        score1show.setText("" + number);
    }
    private void display2(int number) {
        TextView score2show = (TextView) findViewById(
                R.id.score2);
        score2show.setText("" + number);
    }

    private void displaypt3forteam1(int number) {
        TextView nnumberofpt3team1 = (TextView) findViewById(
                R.id.pt3team1);
        nnumberofpt3team1.setText("" + number);
    }

    private void displaypt3forteam2(int number) {
        TextView nnumberofpt3team2 = (TextView) findViewById(
                R.id.pt3team2);
        nnumberofpt3team2.setText("" + number);
    }

    private void displaypt2forteam1(int number) {
        TextView nnumberofpt2team1 = (TextView) findViewById(
                R.id.pt2team1);
        nnumberofpt2team1.setText("" + number);
    }
    private void displaypt2forteam2(int number) {
        TextView nnumberofpt2team2 = (TextView) findViewById(
                R.id.pt2team2);
        nnumberofpt2team2.setText("" + number);
    }
    private void displaypt1forteam1(int number) {
        TextView nnumberofpt1team1 = (TextView) findViewById(
                R.id.pt1team1);
        nnumberofpt1team1.setText("" + number);
    }
    private void displaypt1forteam2(int number) {
        TextView nnumberofpt1team2 = (TextView) findViewById(
                R.id.pt1team2);
        nnumberofpt1team2.setText("" + number);
    }


    public void show(View view){
        if (findViewById(R.id.pt3plus1).getVisibility() == View.VISIBLE){

            displaypt1forteam1(numberofpt1team1);
            displaypt2forteam1(numberofpt2team1);
            displaypt3forteam1(numberofpt3team1);
            displaypt1forteam2(numberofpt1team2);
            displaypt2forteam2(numberofpt2team2);
            displaypt3forteam2(numberofpt3team2);

//            TextView nnumberofpt3team1 = (TextView) findViewById(
//                    R.id.pt3team1);
//            nnumberofpt3team1.setText("" + numberofpt3team1);
//            TextView nnumberofpt3team2 = (TextView) findViewById(
//                    R.id.pt3team2);
//            nnumberofpt3team2.setText("" + numberofpt3team2);
//            TextView nnumberofpt2team1 = (TextView) findViewById(
//                    R.id.pt2team1);
//            nnumberofpt2team1.setText("" + numberofpt2team1);
//            TextView nnumberofpt2team2 = (TextView) findViewById(
//                    R.id.pt2team2);
//            nnumberofpt2team2.setText("" + numberofpt2team2);
//            TextView nnumberofpt1team1 = (TextView) findViewById(
//                    R.id.pt1team1);
//            nnumberofpt1team1.setText("" + numberofpt1team1);
//            TextView nnumberofpt1team2 = (TextView) findViewById(
//                    R.id.pt1team2);
//            nnumberofpt1team2.setText("" + numberofpt1team2);

            findViewById(R.id.pt3plus1).setVisibility(View.INVISIBLE);
            findViewById(R.id.pt3plus2).setVisibility(View.INVISIBLE);
            findViewById(R.id.pt2plus1).setVisibility(View.INVISIBLE);
            findViewById(R.id.pt2plus2).setVisibility(View.INVISIBLE);
            findViewById(R.id.ftplus1).setVisibility(View.INVISIBLE);
            findViewById(R.id.ftplus2).setVisibility(View.INVISIBLE);
            findViewById(R.id.pt3team1).setVisibility(View.VISIBLE);
            findViewById(R.id.pt3team2).setVisibility(View.VISIBLE);
            findViewById(R.id.pt2team1).setVisibility(View.VISIBLE);
            findViewById(R.id.pt2team2).setVisibility(View.VISIBLE);
            findViewById(R.id.pt1team1).setVisibility(View.VISIBLE);
            findViewById(R.id.pt1team2).setVisibility(View.VISIBLE);
            TextView back = (TextView) findViewById(R.id.analysis);
            back.setText("Back");
        } else {
            findViewById(R.id.pt3plus1).setVisibility(View.VISIBLE);
            findViewById(R.id.pt3plus2).setVisibility(View.VISIBLE);
            findViewById(R.id.pt2plus1).setVisibility(View.VISIBLE);
            findViewById(R.id.pt2plus2).setVisibility(View.VISIBLE);
            findViewById(R.id.ftplus1).setVisibility(View.VISIBLE);
            findViewById(R.id.ftplus2).setVisibility(View.VISIBLE);
            findViewById(R.id.pt3team1).setVisibility(View.INVISIBLE);
            findViewById(R.id.pt3team2).setVisibility(View.INVISIBLE);
            findViewById(R.id.pt2team1).setVisibility(View.INVISIBLE);
            findViewById(R.id.pt2team2).setVisibility(View.INVISIBLE);
            findViewById(R.id.pt1team1).setVisibility(View.INVISIBLE);
            findViewById(R.id.pt1team2).setVisibility(View.INVISIBLE);
            TextView back1 = (TextView) findViewById(R.id.analysis);
            back1.setText("Analysis of Game");
        }

    }


}
