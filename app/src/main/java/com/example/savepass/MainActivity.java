package com.example.savepass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText etAnswer;
    TextView tvQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.submitBtn);
        etAnswer = findViewById(R.id.Answer);
        tvQuestion = findViewById(R.id.Question);

        // TODO: Change tvQuestion to be a list of questions
        tvQuestion.setText("What is your name?");

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isRightAnswer(etAnswer)) {
                    Intent i = new Intent(MainActivity.this, Passwords.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "Wrong answer!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    // TODO: rewrite for this to match the answer to list of questions
    public boolean isRightAnswer(EditText ans) {
        String answer = ans.getText().toString();
        return answer.equals("Shoto");
    }

}
