package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    //textviews initen
    TextView textView1,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;

    //database initen
    Database database;

    //editview ininten
    EditText editText1;

    //arraylist
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //textviews connecteren
        textView1 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text3);
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

        // araylist conecten
        arrayList = database.Table_1_col_2_tot_8();

        //functies
        click_back_1();
        click_4();
        click_5();
        click_6();
        click_7();
        click_8();
        click_9();
        click_10();

        //default color changes voor d textviews
        color_changer_fun(textView4,0);
        color_changer_fun(textView5,1);
        color_changer_fun(textView6,2);
        color_changer_fun(textView7,3);
        color_changer_fun(textView8,4);
        color_changer_fun(textView9,5);
        color_changer_fun(textView10,6);

        //naam verandere functie
        change_naam();
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
                if (arrayList.get(0).equals("false")){
                    arrayList.set(0,"true");
                    color_changer_fun(textView4,0);
                }   else    {
                    arrayList.set(0,"false");
                    color_changer_fun(textView4,0);
                }
                database.setTable_1_col_2_tot_8(arrayList);
                System.out.println(arrayList.get(0));
            }
        });
    }
    public void click_5(){
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(1).equals("false")){
                    arrayList.set(1,"true");
                    color_changer_fun(textView5,1);
                }   else    {
                    arrayList.set(1,"false");
                    color_changer_fun(textView5,1);
                }
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_6(){
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(2).equals("false")){
                    arrayList.set(2,"true");
                    color_changer_fun(textView6,2);
                }   else    {
                    arrayList.set(2,"false");
                    color_changer_fun(textView6,2);
                }
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_7(){
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(3).equals("false")){
                    arrayList.set(3,"true");
                    color_changer_fun(textView7,3);
                }   else    {
                    arrayList.set(3,"false");
                    color_changer_fun(textView7,3);
                }
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_8(){
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(4).equals("false")){
                    arrayList.set(4,"true");
                    color_changer_fun(textView8,4);
                }   else    {
                    arrayList.set(4,"false");
                    color_changer_fun(textView8,4);
                }
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_9(){
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(5).equals("false")){
                    arrayList.set(5,"true");
                    color_changer_fun(textView9,5);
                }   else    {
                    arrayList.set(5,"false");
                    color_changer_fun(textView9,5);
                }
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }
    public void click_10(){
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(6).equals("false")){
                    arrayList.set(6,"true");
                    color_changer_fun(textView10,6);
                }   else    {
                    arrayList.set(6,"false");
                    color_changer_fun(textView10,6);
                }
                database.setTable_1_col_2_tot_8(arrayList);
            }
        });
    }

    public void sout_fun(){
        for (int i = 0 ; i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i));
        }
    }

    public void color_changer_fun(TextView textView , int id){
        if (arrayList.get(id).equals("true")){
            textView.setBackgroundResource(R.drawable.border_1);
        } else {
            textView.setBackgroundColor(Color.parseColor("#C4C4C4"));
        }
    }

    public void change_naam(){
        if(!database.getTable_1_col_1().isEmpty() && database.getTable_1_col_1() != null && !database.getTable_1_col_1().equals("null")){
            editText1.setText(database.getTable_1_col_1());
            textView3.setBackgroundResource(R.drawable.border_1);
        }
    }
}