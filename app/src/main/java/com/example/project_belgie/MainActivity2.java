package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    //textviews initen
    TextView textView1,textView4,textView5,textView6,textView7,textView8,textView9,textView10;

    //database initen
    Database database;

    //editview ininten
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //textviews connecteren
        textView1 = findViewById(R.id.text1);
        textView4 = findViewById(R.id.text4);
        textView5 = findViewById(R.id.text5);
        textView6 = findViewById(R.id.text6);
        textView7 = findViewById(R.id.text7);
        textView8 = findViewById(R.id.text8);
        textView9 = findViewById(R.id.text9);
        textView10 = findViewById(R.id.text10);

        //database
        database = new Database(this);

        //eduttexten conecten
        editText1 = findViewById(R.id.editText1);

        //functies
        click_back_1();
        click_4();
        click_5();
        click_6();
        click_7();
        click_8();
        click_9();
        click_10();
        sout_fun();

    }

    public void click_back_1(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                if (getEditText1().trim().length() != 0 && !getEditText1().trim().isEmpty()) {
                    database.setTable_1_col_1(getEditText1());
                }
                startActivity(intent);
            }
        });
    }

    public String getEditText1(){
        String uit  = "";
        if (editText1.getText().toString().length() != 0){
            uit = editText1.getText().toString();
        }
        return  uit;
    }

    public void click_4(){
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> arrayList;
                arrayList = new ArrayList<>();
                arrayList.add(1);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_5(){
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> arrayList;
                arrayList = new ArrayList<>();
                arrayList.add(0);
                arrayList.add(1);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_6(){
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> arrayList;
                arrayList = new ArrayList<>();
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(1);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_7(){
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> arrayList;
                arrayList = new ArrayList<>();
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(1);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_8(){
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> arrayList;
                arrayList = new ArrayList<>();
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(1);
                arrayList.add(0);
                arrayList.add(0);
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_9(){
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> arrayList;
                arrayList = new ArrayList<>();
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(1);
                arrayList.add(0);
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_10(){
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> arrayList;
                arrayList = new ArrayList<>();
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(0);
                arrayList.add(1);
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }

    public void sout_fun(){
        for (int i = 0 ; i < database.Table_1_col_2_tot_8().size() ; i++){
            System.out.println(database.Table_1_col_2_tot_8().get(i));
        }
    }
}