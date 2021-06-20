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



    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //tabel 1
        db.execSQL("create table " + DATABASE_table_1 + "(" + Table_1_col_1 + " INTEGER DEFAULT 0,"
                + Table_1_col_2 + " INTEGER DEFAULT 0 ," + Table_1_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_1_col_4 + " INTEGER DEFAULT 0 ," + Table_1_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_1_col_6 + " INTEGER DEFAULT 0 ," + Table_1_col_7 + " INTEGER DEFAULT 0 ,"
                + Table_1_col_8 + " INTEGER DEFAULT 0 ," + Table_1_col_9 + " INTEGER DEFAULT 0 "+")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_1);
    }
}
