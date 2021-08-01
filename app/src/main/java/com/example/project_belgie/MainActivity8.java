package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity8 extends AppCompatActivity {

    //initen van textviews
    TextView textView1;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView textView11;
    TextView textView12;
    TextView textView13;

    //arraylist
    ArrayList<String> arrayList;

    //database initen
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        //conecteren van textviews
        textView1 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text3);
        textView4 = findViewById(R.id.text4);
        textView5 = findViewById(R.id.text5);
        textView6 = findViewById(R.id.text6);
        textView7 = findViewById(R.id.text7);
        textView8 = findViewById(R.id.text8);
        textView9 = findViewById(R.id.text9);
        textView10 = findViewById(R.id.text10);
        textView11 = findViewById(R.id.text11);
        textView12 = findViewById(R.id.text12);
        textView13 = findViewById(R.id.text13);

        //database conecten
        database = new Database(this);

        //araylisten conecten
        arrayList = database.Table_7_col_1_tot_11();

        //default color changes voor d textviews
        color_changer_fun(textView3,0);
        color_changer_fun(textView4,1);
        color_changer_fun(textView5,2);
        color_changer_fun(textView6,3);
        color_changer_fun(textView7,4);
        color_changer_fun(textView8,5);
        color_changer_fun(textView9,6);
        color_changer_fun(textView10,7);
        color_changer_fun(textView11,8);
        color_changer_fun(textView12,9);
        color_changer_fun(textView13,10);


        //functies
        click_back_1();
        //sout_fun();
        click_3();
        click_4();
        click_5();
        click_6();
        click_7();
        click_8();
        click_9();
        click_10();
        click_11();
        click_12();
        click_13();
    }

    //click listner wanneer er op de back word geduwd
    public void click_back_1(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    //sout functies voor beide arrays
    public void sout_fun(){
        for (int i = 0 ; i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i));
        }
    }

    //alle click functies
    public void click_3(){
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(0).equals("false")){
                    arrayList.set(0,"true");
                    color_changer_fun(textView3,0);
                }   else    {
                    arrayList.set(0,"false");
                    color_changer_fun(textView3,0);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }  public void click_4(){
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(1).equals("false")){
                    arrayList.set(1,"true");
                    color_changer_fun(textView4,1);
                }   else    {
                    arrayList.set(1,"false");
                    color_changer_fun(textView4,1);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }
    public void click_5(){
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(2).equals("false")){
                    arrayList.set(2,"true");
                    color_changer_fun(textView5,2);
                }   else    {
                    arrayList.set(2,"false");
                    color_changer_fun(textView5,2);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }
    public void click_6(){
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(3).equals("false")){
                    arrayList.set(3,"true");
                    color_changer_fun(textView6,3);
                }   else    {
                    arrayList.set(3,"false");
                    color_changer_fun(textView6,3);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }
    public void click_7(){
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(4).equals("false")){
                    arrayList.set(4,"true");
                    color_changer_fun(textView7,4);
                }   else    {
                    arrayList.set(4,"false");
                    color_changer_fun(textView7,4);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }
    public void click_8(){
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(5).equals("false")){
                    arrayList.set(5,"true");
                    color_changer_fun(textView8,5);
                }   else    {
                    arrayList.set(5,"false");
                    color_changer_fun(textView8,5);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }
    public void click_9(){
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(6).equals("false")){
                    arrayList.set(6,"true");
                    color_changer_fun(textView9,6);
                }   else    {
                    arrayList.set(6,"false");
                    color_changer_fun(textView9,6);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }
    public void click_10(){
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(7).equals("false")){
                    arrayList.set(7,"true");
                    color_changer_fun(textView10,7);
                }   else    {
                    arrayList.set(7,"false");
                    color_changer_fun(textView10,7);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }
    public void click_11(){
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(8).equals("false")){
                    arrayList.set(8,"true");
                    color_changer_fun(textView11,8);
                }   else    {
                    arrayList.set(8,"false");
                    color_changer_fun(textView11,8);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }
    public void click_12(){
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(9).equals("false")){
                    arrayList.set(9,"true");
                    color_changer_fun(textView12,9);
                }   else    {
                    arrayList.set(9,"false");
                    color_changer_fun(textView12,9);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }
    public void click_13(){
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList.get(10).equals("false")){
                    arrayList.set(10,"true");
                    color_changer_fun(textView13,10);
                }   else    {
                    arrayList.set(10,"false");
                    color_changer_fun(textView13,10);
                }
                database.setTable_7_col_1_tot_11(arrayList);
            }
        });
    }

    //de color changes
    public void color_changer_fun(TextView textView , int id){
        if (arrayList.get(id).equals("true")){
            textView.setBackgroundResource(R.drawable.border_7);
        } else {
            textView.setBackgroundResource(R.drawable.corner_radius_15);        }
    }
}