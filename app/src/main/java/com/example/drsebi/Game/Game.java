package com.example.drsebi.Game;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.drsebi.R;

import java.util.ArrayList;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Game extends AppCompatActivity {

    TextView questionLabel, questionCountLabel, scoreLabel;
    EditText answerEdit;
    Button submitButton;
    ProgressBar progressBar;
    ArrayList<QuestionModel> questionModelArrayList;

    int currenPosition = 0;
    int numOfCorrectAnswer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        questionCountLabel = findViewById(R.id.noQuestion);
        questionLabel = findViewById(R.id.question);
        scoreLabel = findViewById(R.id.score);

        answerEdit = findViewById(R.id.answer);
        submitButton = findViewById(R.id.submit);
        progressBar = findViewById(R.id.progress);

        questionModelArrayList = new ArrayList<>();

        questionLabel.setShadowLayer(2.6f,2.5f,2.3f, Color.BLACK);

        setUpQuestion();

        setData();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer();
            }
        });

    }

    public void checkAnswer() {

        String answerString = answerEdit.getText().toString().trim();

        if (answerString.equalsIgnoreCase(questionModelArrayList.get(currenPosition).getAnswer())) {
            numOfCorrectAnswer++;

            new SweetAlertDialog(Game.this, SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Good Job!")
                    .setContentText("Right Answer")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                            currenPosition++;

                            setData();
                            answerEdit.setText("");
                            sweetAlertDialog.dismiss();
                        }
                    })
                    .show();

        } else {
            new SweetAlertDialog(Game.this, SweetAlertDialog.ERROR_TYPE)
                    .setTitleText("Wrong Answer")
                    .setContentText("The right answer is : " + questionModelArrayList.get(currenPosition).getAnswer())
                    .setConfirmText("OK")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {
                            sDialog.dismiss();

                            currenPosition++;

                            setData();
                            answerEdit.setText("");
                        }
                    })
                    .show();
        }
        int a = currenPosition + 1;
        //int x = (a = 100) / questionModelArrayList.size();



        progressBar.setMax(questionModelArrayList.size());

        progressBar.setProgress(a);
    }

    public void setUpQuestion() {


        questionModelArrayList.add(new QuestionModel("Which Fruit Is This?", "Apple"));
        questionModelArrayList.add(new QuestionModel("Which Fruit Is This?", "Banana"));
        questionModelArrayList.add(new QuestionModel("Which Fruits Are These?", "Berries"));
        questionModelArrayList.add(new QuestionModel("Which Fruits Are These?", "Cherries"));
        questionModelArrayList.add(new QuestionModel("Which Fruits Are These?", "Grapes"));
        questionModelArrayList.add(new QuestionModel("Which Fruits Are These?", "Oranges"));


    }

    public void setData() {

        if (questionModelArrayList.size() > currenPosition) {
            if(currenPosition == 0)
            {
                questionLabel.setBackgroundResource(R.drawable.apple);
            }
            else if(currenPosition == 1)
            {
                questionLabel.setBackgroundResource(R.drawable.banana);
            }
            else if(currenPosition == 2)
            {
                questionLabel.setBackgroundResource(R.drawable.berries);
            }
            else if(currenPosition == 3)
            {
                questionLabel.setBackgroundResource(R.drawable.cherries);
            }
            else if(currenPosition == 4)
            {
                questionLabel.setBackgroundResource(R.drawable.grapes);
            }
            else if(currenPosition == 5)
            {
                questionLabel.setBackgroundResource(R.drawable.oranges);
            }

            questionLabel.setText(questionModelArrayList.get(currenPosition).getQuestionString());

            scoreLabel.setText("Score : " + numOfCorrectAnswer + "/" + questionModelArrayList.size());
            questionCountLabel.setText("Question No : " + (currenPosition + 1));

        } else {
            new SweetAlertDialog(Game.this, SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("You have successfully completed the quiz")
                    .setContentText("Your score is : "+ numOfCorrectAnswer + "/" + questionModelArrayList.size())
                    .setConfirmText("Restart")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {

                            sDialog.dismissWithAnimation();
                            currenPosition = 0;
                            numOfCorrectAnswer = 0;
                            progressBar.setProgress(0);
                            setData();
                        }
                    })
                    .setCancelText("Close")
                    .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {

                            sDialog.dismissWithAnimation();
                            finish();
                        }
                    })
                    .show();
        }



    }
}
