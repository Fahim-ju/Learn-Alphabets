package com.example.learnalphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LetterDetails extends AppCompatActivity {

    TextView textView ;
    ImageView imageView;
    private int[] wordImage = {R.drawable.a_word,R.drawable.b_word,
     R.drawable.c_word,R.drawable.d_word,R.drawable.e_word,
     R.drawable.f_word,R.drawable.g_word,R.drawable.h_word,
     R.drawable.i_word,R.drawable.j_word,R.drawable.k_word,R.drawable.l_word,
     R.drawable.m_word,R.drawable.n_word,R.drawable.o_word,R.drawable.p_word,
     R.drawable.q_word,R.drawable.r_word,R.drawable.s_word,R.drawable.t_word,
     R.drawable.u_word,R.drawable.v_word,R.drawable.w_word,R.drawable.x_word,
     R.drawable.y_word,R.drawable.z_word };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.letter_details);

        Intent intent = getIntent();
        String  letter = intent.getStringExtra(MainActivity.letter_key);
        textView = findViewById(R.id.letterdetails);
        imageView = findViewById(R.id.wordwithletter);
        Integer letterIndex = Integer.parseInt(letter);
        //textView.setText(a.toString());
        imageView.setImageResource(wordImage[letterIndex]);
        //set some word to letterDetails
    }
}