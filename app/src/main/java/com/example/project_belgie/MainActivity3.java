package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        //database conecten
        database = new Database(this);

        //araylisten conecten
        arrayList = database.Table_2_col_1_tot_2();
        arrayList1 = database.Table_2_col_3_tot_7();

        //eduttexten conecten
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);


        //functies
        click_1();
        click_back_1();
        sout_fun();
        sout_fun2();
    }

    public void click_1(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    /*public void change_naam(){
        if(!database.getTable_1_col_1().isEmpty() && database.getTable_1_col_1() != null && !database.getTable_1_col_1().equals("null")){
            editText1.setText(database.getTable_1_col_1());
            textView3.setBackgroundResource(R.drawable.border_1);
        }
    }*/

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

}