package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //textviews initen
    TextView textView1;

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

        //database
        database = new Database(this);

        //eduttexten conecten
        editText1 = findViewById(R.id.editText1);

        //functies
        click_back_1();

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
}