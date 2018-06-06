package com.example.android.finalquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SciencePage extends AppCompatActivity {

    float sciNoOfQuestions = 5;
    float sciNoOfQuestionsCorrect = 0;
    int sciAnsId;
    float sciScore;
    int sciAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_page);
    }

    public void correctAnswers1(View view) {
        RadioGroup radioGroup1 = (RadioGroup) (findViewById(R.id.sciQues_1));
        sciAnswer = radioGroup1.getCheckedRadioButtonId();
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.sciAns1A);
       sciAnsId = radioButton1.getId();
        if (sciAnswer == sciAnsId) {

            sciNoOfQuestionsCorrect = sciNoOfQuestionsCorrect + 1;

        }

        RadioGroup radioGroup2 = (RadioGroup) (findViewById(R.id.sciQues_2));
        sciAnswer = radioGroup2.getCheckedRadioButtonId();
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.sciAns2B);
        sciAnsId = radioButton2.getId();
        if (sciAnswer == sciAnsId) {

            sciNoOfQuestionsCorrect = sciNoOfQuestionsCorrect + 1;

        }

        RadioGroup radioGroup3 = (RadioGroup) (findViewById(R.id.sciQues_3));
        sciAnswer = radioGroup3.getCheckedRadioButtonId();
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.sciAns3B);
        sciAnsId = radioButton3.getId();
        if (sciAnswer == sciAnsId) {

            sciNoOfQuestionsCorrect = sciNoOfQuestionsCorrect + 1;

        }

        RadioGroup radioGroup4 = (RadioGroup) (findViewById(R.id.sciQues_4));
        sciAnswer = radioGroup4.getCheckedRadioButtonId();
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.sciAns4A);
        sciAnsId = radioButton4.getId();
        if (sciAnswer == sciAnsId) {

            sciNoOfQuestionsCorrect = sciNoOfQuestionsCorrect + 1;

        }

        RadioGroup radioGroup5 = (RadioGroup) (findViewById(R.id.sciQues_5));
        sciAnswer = radioGroup5.getCheckedRadioButtonId();
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.sciAns5B);
        sciAnsId = radioButton5.getId();
        if (sciAnswer == sciAnsId) {

            sciNoOfQuestionsCorrect = sciNoOfQuestionsCorrect + 1;

        }

        sciScore = (sciNoOfQuestionsCorrect/sciNoOfQuestions)*100;

//        String message = "You scored : " + sciScore + "%";
        Toast toast = Toast.makeText(SciencePage.this, "You scored : " + sciScore + "%", Toast.LENGTH_SHORT);
        toast.show();

        sciNoOfQuestionsCorrect = 0;
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
    }

    public void previousPage(View view){
        final Button button = (Button) findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previouspage = new Intent(SciencePage.this, MainActivity.class);
                startActivity(previouspage);
            }
        });
    }
}