package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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


        //functies
        click_1();
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

    public void sout_fun(){
        for (int i = 0 ; i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i));
        }
    }

}