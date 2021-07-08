package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    //database initen
    Database database;

    //textviews initen
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
    ArrayList<String> arrayList1;

    //editview ininten
    EditText editText1;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // texvieuws conecten
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
        arrayList = database.Table_2_col_1_tot_2();
        arrayList1 = database.Table_2_col_3_tot_7();

        //eduttexten conecten
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);


        //functies
        click_back_1();
        click_5();
        click_6();
        click_7();
        click_8();
        click_9();
        sout_fun();
        sout_fun2();

        //default color changes voor d textviews
        color_changer_fun(textView5,0);
        color_changer_fun(textView6,1);
        color_changer_fun(textView7,2);
        color_changer_fun(textView8,3);
        color_changer_fun(textView9,4);

        //naam verandere functie
        change_naam_1();
        change_naam_2();
    }

    public void click_5(){
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList1.get(0).equals("false")){
                    arrayList1.set(0,"true");
                    color_changer_fun(textView5,0);
                }   else    {
                    arrayList1.set(0,"false");
                    color_changer_fun(textView5,0);
                }
                database.setTable_2_col_1_tot_8(arrayList, arrayList1);
            }
        });
    }

    public void click_6(){
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList1.get(1).equals("false")){
                    arrayList1.set(1,"true");
                    color_changer_fun(textView6,1);
                }   else    {
                    arrayList1.set(1,"false");
                    color_changer_fun(textView6,1);
                }
                database.setTable_2_col_1_tot_8(arrayList, arrayList1);
            }
        });
    }

    public void click_7(){
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList1.get(2).equals("false")){
                    arrayList1.set(2,"true");
                    color_changer_fun(textView7,2);
                }   else    {
                    arrayList1.set(2,"false");
                    color_changer_fun(textView7,2);
                }
                database.setTable_2_col_1_tot_8(arrayList, arrayList1);
            }
        });
    }

    public void click_8(){
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList1.get(3).equals("false")){
                    arrayList1.set(3,"true");
                    color_changer_fun(textView8,3);
                }   else    {
                    arrayList1.set(3,"false");
                    color_changer_fun(textView8,3);
                }
                database.setTable_2_col_1_tot_8(arrayList, arrayList1);
            }
        });
    }

    public void click_9(){
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayList1.get(4).equals("false")){
                    arrayList1.set(4,"true");
                    color_changer_fun(textView9,4);
                }   else    {
                    arrayList1.set(4,"false");
                    color_changer_fun(textView9,4);
                }
                database.setTable_2_col_1_tot_8(arrayList, arrayList1);
            }
        });
    }
    public void change_naam_1(){
        if(!arrayList.get(0).isEmpty() && arrayList.get(0) != null && !arrayList.get(0).equals("null")){
            editText1.setText(arrayList.get(0));
            textView3.setBackgroundResource(R.drawable.border_2);
        }
    }
    public void change_naam_2(){
        if(!arrayList.get(1).isEmpty() && arrayList.get(1) != null && !arrayList.get(1).equals("null")){
            editText2.setText(arrayList.get(1));
            textView4.setBackgroundResource(R.drawable.border_2);
        }
    }

    //sout functies voor beide arrays
    public void sout_fun(){
        for (int i = 0 ; i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i));
        }
    }

    public void sout_fun2(){
        for (int i = 0 ; i < arrayList1.size() ; i++){
            System.out.println(arrayList1.get(i));
        }
    }


    //get edit texts functies
    public String getEditText1(){
        String uit  = "";
        if (editText1.getText().toString().length() != 0){
            uit = editText1.getText().toString();
        }
        return  uit;
    }
    public String getEditText2(){
        String uit  = "";
        if (editText2.getText().toString().length() != 0){
            uit = editText2 .getText().toString();
        }
        return  uit;
    }

    //click listner wanneer er op de back word geduwd
    public void click_back_1(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                if (getEditText1().trim().length() != 0 && !getEditText1().trim().isEmpty()) {
                    database.setTable_2_col_1(getEditText1());
                }
                if (getEditText2().trim().length() != 0 && !getEditText2().trim().isEmpty()) {
                    database.setTable_2_col_2(getEditText2());
                }
                startActivity(intent);
            }
        });
    }


    //de color changes
    public void color_changer_fun(TextView textView , int id){
        if (arrayList1.get(id).equals("true")){
            textView.setBackgroundResource(R.drawable.border_2);
        } else {
            textView.setBackgroundColor(Color.parseColor("#C4C4C4"));
        }
    }

}