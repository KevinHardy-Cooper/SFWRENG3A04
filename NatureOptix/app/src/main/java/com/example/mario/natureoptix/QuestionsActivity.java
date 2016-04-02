package com.example.mario.natureoptix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void getResults(View v){
        Intent resultsIntent =new Intent(this,ResultsActivity.class);
        startActivity(resultsIntent);
    }
}
