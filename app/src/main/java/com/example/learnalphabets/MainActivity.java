package com.example.learnalphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] lettersName;
    private int[] lettersImage = {R.drawable.thisis,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
            R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,
            R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,
            R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.alphabetListView);
        lettersName = getResources().getStringArray(R.array.alphabets);
        CustomAdapter customAdapter;
        customAdapter = new CustomAdapter(MainActivity.this,lettersName,lettersImage);
        System.out.println("Yahooooo");
        listView.setAdapter(customAdapter);
    }
}