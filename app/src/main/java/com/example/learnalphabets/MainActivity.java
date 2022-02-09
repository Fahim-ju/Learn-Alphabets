package com.example.learnalphabets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {
    public static final String letter_key = "letter";
    private ListView listView;
    private String[] lettersName;
    private int[] lettersImage = {R.drawable.thisis, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e,
            R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l,
            R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r, R.drawable.s,
            R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.x, R.drawable.y, R.drawable.z};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.alphabetListView);
        lettersName = getResources().getStringArray(R.array.alphabets);
        CustomAdapter customAdapter;
        customAdapter = new CustomAdapter(MainActivity.this, lettersName, lettersImage);
        System.out.println("Yahooooo");
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, LetterDetails.class);

                intent.putExtra(letter_key, String.valueOf(i));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.shareId)
        {
            Toast.makeText(MainActivity.this,R.string.shareMessage,Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.authorId)
        {
            Toast.makeText(MainActivity.this,R.string.authorMessage,Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.contactId)
        {
            Toast.makeText(MainActivity.this,R.string.contactMessage,Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
        public void onBackPressed () {
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(MainActivity.this);
            dialogBuilder.setIcon(R.drawable.ic_baseline_exit_to_app_24);
            dialogBuilder.setTitle("Alert");
            dialogBuilder.setMessage("Do you sure Want to exit?");
            dialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            dialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            dialogBuilder.setCancelable(false);
            AlertDialog alertDialog = dialogBuilder.create();
            alertDialog.show();
            //super.onBackPressed();
        }
    }
