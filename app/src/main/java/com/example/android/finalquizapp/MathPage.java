package com.example.android.finalquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



public class MathPage extends AppCompatActivity {

    float noOfQuestions = 5;
    float noOfQuestionsCorrect = 0;
    int ansId;
    float score;
    int answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_page);
    }

    public void correctAnswers(View view){
        RadioGroup radioGroup1 = (RadioGroup) (findViewById(R.id.quesOne));
        answer = radioGroup1.getCheckedRadioButtonId();
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.mathAns1A);
        ansId = radioButton1.getId();
        if(answer==ansId){

            noOfQuestionsCorrect = noOfQuestionsCorrect + 1;

        }

        RadioGroup radioGroup2 = (RadioGroup) (findViewById(R.id.quesTwo));
        answer = radioGroup2.getCheckedRadioButtonId();
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.mathAns2B);
        ansId = radioButton2.getId();
        if(answer==ansId){

            noOfQuestionsCorrect = noOfQuestionsCorrect + 1;

        }

        RadioGroup radioGroup3 = (RadioGroup) (findViewById(R.id.quesThree));
        answer = radioGroup3.getCheckedRadioButtonId();
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.mathAns3B);
        ansId = radioButton3.getId();
        if(answer==ansId){

            noOfQuestionsCorrect = noOfQuestionsCorrect + 1;

        }

        RadioGroup radioGroup4 = (RadioGroup) (findViewById(R.id.quesFour));
        answer = radioGroup4.getCheckedRadioButtonId();
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.mathAns4B);
        ansId = radioButton4.getId();
        if(answer==ansId){

            noOfQuestionsCorrect = noOfQuestionsCorrect + 1;

        }

        RadioGroup radioGroup5 = (RadioGroup) (findViewById(R.id.quesFive));
        answer = radioGroup5.getCheckedRadioButtonId();
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.mathAns5A);
        ansId = radioButton5.getId();
        if(answer==ansId){

            noOfQuestionsCorrect = noOfQuestionsCorrect + 1;

        }

        score = (noOfQuestionsCorrect/noOfQuestions)*100;


        String message = "You scored : " + score + "%";
        Toast toast = Toast.makeText(MathPage.this,message,Toast.LENGTH_LONG);
        toast.show();

        noOfQuestionsCorrect = 0;
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
                Intent previouspage = new Intent(MathPage.this, MainActivity.class);
                startActivity(previouspage);
            }
        });
    }
   }
