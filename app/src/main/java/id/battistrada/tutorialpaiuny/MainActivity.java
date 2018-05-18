package id.battistrada.tutorialpaiuny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.battistrada.tutorialpaiuny.Habit.Habits;
import id.battistrada.tutorialpaiuny.Quiz.Quiz;

public class MainActivity extends AppCompatActivity {

    Button button, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnQuiz);
        button1 = findViewById(R.id.btnhabits);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Habits.class);
                startActivity(intent);
            }
        });
    }
}
