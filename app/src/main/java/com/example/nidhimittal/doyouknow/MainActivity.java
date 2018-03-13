package com.example.nidhimittal.doyouknow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton question1_option3;
    EditText question2_ans;
    CheckBox question3_option1;
    CheckBox question2_option2;
    CheckBox question3_option3;
    EditText question4_ans;
    RadioButton question5_choice2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswers(View view) {
        String resultsDisplay;
        int question1_score;
        int question2_score;
        int question3_score;
        int question4_score;
        int question5_score;
        int total;

        // Calculating Question 1 Score
        // Question 1: Correct Answer option 3 Mercury

        Boolean question1;

        question1_option3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        question1 = question1_option3.isChecked();
        if (question1) {
            question1_score = 1;
        } else {
            question1_score = 0;
        }
        // Calculating Question 2 Score
        // Question 2: Correct Answer "Jupiter"

        String question2;
        question2_ans = (EditText) this.findViewById(R.id.question2_answer);
        question2 = question2_ans.getText().toString();
        if (question2.equals("Jupiter")) {
            question2_score = 1;
        } else {
            question2_score = 0;
        }
        // Calculating Question 3 Score
        // Question 3: Correct Answers option1 Sun and option3 Moon

        Boolean question3_choice1;
        Boolean question3_choice2;
        Boolean question3_choice3;

        question3_option1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question2_option2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_option3 = (CheckBox) this.findViewById(R.id.question3_choice3);

        question3_choice1 = question3_option1.isChecked();
        question3_choice2 = question2_option2.isChecked();
        question3_choice3 = question3_option3.isChecked();

        if (question3_choice1 && !question3_choice2 && question3_choice3) {
            question3_score = 1;
        } else {
            question3_score = 0;
        }

        // Calculating Question 4 score
        // Question 4: Correct Answer "Moon"

        String question4;
        question4_ans = (EditText) this.findViewById(R.id.question4_answer);
        question4 = question4_ans.getText().toString();
        if (question4.equals("Moon")) {
            question4_score = 1;
        } else {
            question4_score = 0;
        }
        // Calculating Question 5 Score
        // Question 5: Correct Answers option2 "Pluto"

        Boolean question5;
        question5_choice2 = (RadioButton) this.findViewById(R.id.question5_choice2);
        question5 = question5_choice2.isChecked();
        if (question5) {
            question5_score = 1;
        } else {
            question5_score = 0;
        }

        //  Calculating Total Score

        total = question1_score + question2_score + question3_score + question4_score + question5_score;

        if (total == 5) {
            resultsDisplay = " Great! Your all answers are correct!";
        } else {
            resultsDisplay = " Your " + total + " answers are correct!";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}



















































































































































































































































































