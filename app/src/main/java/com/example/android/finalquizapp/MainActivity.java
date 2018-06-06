package com.example.android.finalquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    int groupId;
    int subId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
       boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.math_radio_button:
                if (checked)
                    break;
            case R.id.science_radio_button:
                if (checked)
                    break;

        }
    }


    public void startTest(View view) {
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.subject_radio);
        groupId = radioGroup1.getCheckedRadioButtonId();
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.math_radio_button);
        subId = radioButton1.getId();
        if (groupId==subId){

            final Button button = (Button) findViewById(R.id.start_test);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent firstpage = new Intent(MainActivity.this, MathPage.class);
                    startActivity(firstpage);
                }
            });
        }

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.subject_radio);
        groupId = radioGroup2.getCheckedRadioButtonId();
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.science_radio_button);
        subId = radioButton2.getId();
        if (groupId==subId)
        {
            final Button button = (Button) findViewById(R.id.start_test);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent firstpage = new Intent(MainActivity.this, SciencePage.class);
                    startActivity(firstpage);

                }
            });
        }
    }
}