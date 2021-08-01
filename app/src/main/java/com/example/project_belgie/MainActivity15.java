package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity15 extends AppCompatActivity {

    //initen van textviews
    TextView textView1;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;

    //arraylist
    ArrayList<String> arrayList;

    //database initen
    Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        //textviews connecten
        textView1 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text3);
        textView4 = findViewById(R.id.text4);
        textView5 = findViewById(R.id.text5);
        textView6 = findViewById(R.id.text6);
        textView7 = findViewById(R.id.text7);
        textView8 = findViewById(R.id.text8);
        textView9 = findViewById(R.id.text9);

        //database conecten
        database = new Database(this);

        //araylisten conecten
        arrayList = database.Table_14_col_1_tot_7();

        //default color changes voor d textviews
        color_changer_fun(textView3,0);
        color_changer_fun(textView4,1);
        color_changer_fun(textView5,2);
        color_changer_fun(textView6,3);
        color_changer_fun(textView7,4);
        color_changer_fun(textView8,5);
        color_changer_fun(textView9,6);

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
                database.setTable_14_col_1_tot_7(arrayList);
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
                database.setTable_14_col_1_tot_7(arrayList);
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
                database.setTable_14_col_1_tot_7(arrayList);
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
                database.setTable_14_col_1_tot_7(arrayList);
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
                database.setTable_14_col_1_tot_7(arrayList);
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
                database.setTable_14_col_1_tot_7(arrayList);
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
                database.setTable_14_col_1_tot_7(arrayList);
            }
        });
    }

    //de color changes
    public void color_changer_fun(TextView textView , int id){
        if (arrayList.get(id).equals("true")){
            textView.setBackgroundResource(R.drawable.border_14);
        } else {
            textView.setBackgroundResource(R.drawable.corner_radius_15);
        }
    }
}