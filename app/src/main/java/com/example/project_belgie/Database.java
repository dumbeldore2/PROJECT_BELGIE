package com.example.project_belgie;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    //db naam
    public static String DATABASE_NAME = "database_project_pp_mobile_app.db";

    //tabel 1
    public static final String DATABASE_table_1 = "persoon";
    public static final String Table_1_col_1 = "persoon_naam";
    public static final String Table_1_col_2 = "persoon_baby";
    public static final String Table_1_col_3 = "persoon_kind";
    public static final String Table_1_col_4 = "persoon_man";
    public static final String Table_1_col_5 = "persoon_vrouw";
    public static final String Table_1_col_6 = "persoon_20-40_jaar";
    public static final String Table_1_col_7 = "persoon_40-60_jaar";
    public static final String Table_1_col_8 = "persoon_60-80_jaar";
    public static final String Table_1_col_9 = "persoon_id";

    //tabel 2
    public static final String DATABASE_table_2 = "plaats";
    public static final String Table_2_col_1 = "plaats_adres";
    public static final String Table_2_col_2 = "plaats_gemeente";
    public static final String Table_2_col_3 = "plaats_inmobiel";
    public static final String Table_2_col_4 = "plaats_mobiel";
    public static final String Table_2_col_5 = "plaats_openbare_plaats";
    public static final String Table_2_col_6 = "plaats_prive";
    public static final String Table_2_col_7 = "plaats_verzekerder_omg";
    public static final String Table_2_col_8 = "plaats_id";

    //tabel 3
    public static final String DATABASE_table_3 = "pijn";
    public static final String Table_3_col_1 = "pijn_emo_1";
    public static final String Table_3_col_2 = "pijn_emo_2";
    public static final String Table_3_col_3 = "pijn_pijn_1";
    public static final String Table_3_col_4 = "pijn_pijn_2";
    public static final String Table_3_col_5 = "pijn_pijn_3";
    public static final String Table_3_col_6 = "pijn_id";

    //tabel 4
    public static final String DATABASE_table_4 = "tijd_symp";
    public static final String Table_4_col_1 = "tijd_symp_na_1_uur";
    public static final String Table_4_col_2 = "tijd_symp_1_tot_4_uur";
    public static final String Table_4_col_3 = "tijd_symp_na_4_uur";
    public static final String Table_4_col_4 = "tijd_symp_na_12_uur";
    public static final String Table_4_col_5 = "tijd_symp_meer_dan_2_dagen";
    public static final String Table_4_col_6 = "tijd_symp_snelle_opname";
    public static final String Table_4_col_7 = "tijd_symp_id";

    //tabel 5
    public static final String DATABASE_table_5 = "voorgeschied";
    public static final String Table_5_col_1 = "voorgeschied_cardio";
    public static final String Table_5_col_2 = "voorgeschied_neuro";
    public static final String Table_5_col_3 = "voorgeschied_diabetes";
    public static final String Table_5_col_4 = "voorgeschied_bloed_verdunners";
    public static final String Table_5_col_5 = "voorgeschied_copd";
    public static final String Table_5_col_6 = "voorgeschied_aneurisma";
    public static final String Table_5_col_7 = "voorgeschied_id";

    //todo: init tabel 6
    //todo: init tabel 7
    //todo: init tabel 8
    //todo: init tabel 9
    //todo: init tabel 10
    //todo: init tabel 11
    //todo: init tabel 12
    //todo: init tabel 13
    //todo: init tabel 14
    //todo: init tabel 15
    //todo: init tabel 16



    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //tabel 1
        db.execSQL("create table " + DATABASE_table_1 + "(" + Table_1_col_1 + " TEXT ,"
                + Table_1_col_2 + " INTEGER DEFAULT 0 ," + Table_1_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_1_col_4 + " INTEGER DEFAULT 0 ," + Table_1_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_1_col_6 + " INTEGER DEFAULT 0 ," + Table_1_col_7 + " INTEGER DEFAULT 0 ,"
                + Table_1_col_8 + " INTEGER DEFAULT 0 ," + Table_1_col_9 + " INTEGER DEFAULT 0 primary key)");

        //tabel 2
        db.execSQL("create table " + DATABASE_table_2 + "(" + Table_2_col_1 + " TEXT ,"
                + Table_2_col_2 + " TEXT ," + Table_2_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_2_col_4 + " INTEGER DEFAULT 0 ," + Table_2_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_2_col_6 + " INTEGER DEFAULT 0 ," + Table_2_col_7 + " INTEGER DEFAULT 0 ,"
                + Table_2_col_8 + " INTEGER DEFAULT 0 primary key)");

        //tabel 3
        db.execSQL("create table " + DATABASE_table_3 + "(" + Table_3_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_3_col_2 + " INTEGER DEFAULT 0 ," + Table_3_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_3_col_4 + " INTEGER DEFAULT 0 ," + Table_3_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_3_col_6 + " INTEGER DEFAULT 0 primary key)");

        //tabel 4
        db.execSQL("create table " + DATABASE_table_4 + "(" + Table_4_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_4_col_2 + " INTEGER DEFAULT 0 ," + Table_4_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_4_col_4 + " INTEGER DEFAULT 0 ," + Table_4_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_4_col_6 + " INTEGER DEFAULT 0 ," + Table_4_col_7 + " INTEGER DEFAULT 0 primary key)");

        //tabel 5
        db.execSQL("create table " + DATABASE_table_5 + "(" + Table_5_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_5_col_2 + " INTEGER DEFAULT 0 ," + Table_5_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_5_col_4 + " INTEGER DEFAULT 0 ," + Table_5_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_5_col_6 + " INTEGER DEFAULT 0 ," + Table_5_col_7 + " INTEGER DEFAULT 0 primary key)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_1);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_2);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_3);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_4);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_5);
    }
}
