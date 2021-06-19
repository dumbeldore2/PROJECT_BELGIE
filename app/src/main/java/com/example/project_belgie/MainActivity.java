package com.example.project_belgie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Textviews initen
    TextView textView1,textView2,textView3,textView4,textView5
            ,textView6,textView7,textView8,textView9,textView10
            ,textView11,textView12,textView13,textView14,textView15
            ,textView16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textviews connecteren
        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
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
        textView14 = findViewById(R.id.text14);
        textView15 = findViewById(R.id.text15);
        textView16 = findViewById(R.id.text16);

        //functies
        click_1();
        click_2();
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
        click_14();
        click_15();
        click_16();
    }

    public void click_1(){
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    public void click_2(){
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    public void click_3(){
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);
            }
        });
    }

    public void click_4(){
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(intent);
            }
        });
    }

    public void click_5(){
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity6.class);
                startActivity(intent);
            }
        });
    }

    public void click_6(){
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity7.class);
                startActivity(intent);
            }
        });
    }

    public void click_7(){
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity8.class);
                startActivity(intent);
            }
        });
    }

    public void click_8(){
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity9.class);
                startActivity(intent);
            }
        });
    }

    public void click_9(){
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity10.class);
                startActivity(intent);
            }
        });
    }

    public void click_10(){
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity11.class);
                startActivity(intent);
            }
        });
    }

    public void click_11(){
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity12.class);
                startActivity(intent);
            }
        });
    }

    public void click_12(){
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity13.class);
                startActivity(intent);
            }
        });
    }

    public void click_13(){
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity14.class);
                startActivity(intent);
            }
        });
    }

    public void click_14(){
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity15.class);
                startActivity(intent);
            }
        });
    }

    public void click_15(){
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity16.class);
                startActivity(intent);
            }
        });
    }

    public void click_16(){
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity17.class);
                startActivity(intent);
            }
        });
    }
}