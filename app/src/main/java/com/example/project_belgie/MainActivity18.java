package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity18 extends AppCompatActivity {

    //textviews initen
    TextView textView1,textView2,textView3;

    //databanken inniten
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        //textviews conecten
        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
        textView3 = findViewById(R.id.text3);

        //databanken conecten
        database = new Database(this);

        //functies
        click_1();
        click_2();
        click_3();
    }

    public void click_1(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                db_fun1();
                startActivity(intent);
            }
        });
    }

    public void click_2(){
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void click_3(){
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void db_fun1(){
        database.addToTabel1();
        database.addToTabel2();
        database.addToTabel3();
        database.addToTabel4();
        database.addToTabel5();
        database.addToTabel6();
        database.addToTabel7();
        database.addToTabel8();
        database.addToTabel9();
        database.addToTabel10();
        database.addToTabel11();
        database.addToTabel12();
        database.addToTabel13();
        database.addToTabel14();
        database.addToTabel15();
        database.addToTabel16();
    }
}