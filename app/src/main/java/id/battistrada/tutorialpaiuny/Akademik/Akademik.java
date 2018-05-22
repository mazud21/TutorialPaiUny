package id.battistrada.tutorialpaiuny.Akademik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import id.battistrada.tutorialpaiuny.Akademik.Quiz.Quiz;
import id.battistrada.tutorialpaiuny.MainActivity;
import id.battistrada.tutorialpaiuny.News;
import id.battistrada.tutorialpaiuny.R;

public class Akademik extends AppCompatActivity {

    CardView cardView1, cardView2, cardView3, cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik);

        cardView1 = findViewById(R.id.cvTeori);
        cardView2 = findViewById(R.id.cvKehadiran);
        cardView3 = findViewById(R.id.cvQuiz);
        cardView4 = findViewById(R.id.cvNilaiAkhir);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Akademik.this, Teori.class);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Akademik.this, Kehadiran.class);
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Akademik.this, Quiz.class);
                startActivity(intent);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Akademik.this, NilaiAkhir.class);
                startActivity(intent);
            }
        });
    }
}
