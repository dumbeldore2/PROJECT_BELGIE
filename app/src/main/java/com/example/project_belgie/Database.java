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

    //tabel 6
    public static final String DATABASE_table_6 = "bewustzijn";
    public static final String Table_6_col_1 = "bewustzijn_b1";
    public static final String Table_6_col_2 = "bewustzijn_b2";
    public static final String Table_6_col_3 = "bewustzijn_b3";
    public static final String Table_6_col_4 = "bewustzijn_agressief";
    public static final String Table_6_col_5 = "bewustzijn_angst";
    public static final String Table_6_col_6 = "bewustzijn_apatisch";
    public static final String Table_6_col_7 = "bewustzijn_coma";
    public static final String Table_6_col_8 = "bewustzijn_cva_sympt";
    public static final String Table_6_col_9 = "bewustzijn_dronken";
    public static final String Table_6_col_10 = "bewustzijn_intox";
    public static final String Table_6_col_11 = "bewustzijn_neuro";
    public static final String Table_6_col_12 = "bewustzijn_onrust";
    public static final String Table_6_col_13 = "bewustzijn_psy";
    public static final String Table_6_col_14 = "bewustzijn_suf";
    public static final String Table_6_col_15 = "bewustzijn_suf_kreunend";
    public static final String Table_6_col_16 = "bewustzijn_syncopaal";
    public static final String Table_6_col_17 = "bewustzijn_verlamming";
    public static final String Table_6_col_18 = "bewustzijn_verward";
    public static final String Table_6_col_19 = "bewustzijn_id";

    //tabel 7
    public static final String DATABASE_table_7 = "ademhaling";
    public static final String Table_7_col_1 = "ademhaling_a1";
    public static final String Table_7_col_2 = "ademhaling_a2";
    public static final String Table_7_col_3 = "ademhaling_a3";
    public static final String Table_7_col_4 = "ademhaling_cyanose";
    public static final String Table_7_col_5 = "ademhaling_desat";
    public static final String Table_7_col_6 = "ademhaling_dyspnea";
    public static final String Table_7_col_7 = "ademhaling_hyperventilatie";
    public static final String Table_7_col_8 = "ademhaling_geen_volzinnen";
    public static final String Table_7_col_9 = "ademhaling_luide_ademhaling";
    public static final String Table_7_col_10 = "ademhaling_obstructief";
    public static final String Table_7_col_11 = "ademhaling_sliklast";
    public static final String Table_7_col_12 = "ademhaling_id";

    //tabel 8
    public static final String DATABASE_table_8 = "extra_info";
    public static final String Table_8_col_1 = "extra_info_huisarts_ter_plaatste";
    public static final String Table_8_col_2 = "extra_info_mug_vertrokken";
    public static final String Table_8_col_3 = "extra_info_zw_vertrokken";
    public static final String Table_8_col_4 = "extra_info_rea_gestart";
    public static final String Table_8_col_5 = "extra_info_phone_cpr";
    public static final String Table_8_col_6 = "extra_info_einde_ect";
    public static final String Table_8_col_7 = "extra_info_z_huis_meerwaarde";
    public static final String Table_8_col_8 = "extra_info_pit_meerwaarde";
    public static final String Table_8_col_9 = "extra_info_ha_meerwaarde";
    public static final String Table_8_col_10 = "extra_info_id";

    //tabel 9
    public static final String DATABASE_table_9 = "circulatie";
    public static final String Table_9_col_1 = "circulatie_c1";
    public static final String Table_9_col_2 = "circulatie_c2";
    public static final String Table_9_col_3 = "circulatie_c3";
    public static final String Table_9_col_4 = "circulatie_bleek";
    public static final String Table_9_col_5 = "circulatie_brady";
    public static final String Table_9_col_6 = "circulatie_cardiogeen";
    public static final String Table_9_col_7 = "circulatie_defibrilator";
    public static final String Table_9_col_8 = "circulatie_dood";
    public static final String Table_9_col_9 = "circulatie_hypovolemie";
    public static final String Table_9_col_10 = "circulatie_pacemaker";
    public static final String Table_9_col_11 = "circulatie_tachy";
    public static final String Table_9_col_12 = "circulatie_rea";
    public static final String Table_9_col_13 = "circulatie_zweten";
    public static final String Table_9_col_14 = "circulatie_bloed";
    public static final String Table_9_col_15 = "circulatie_pob";
    public static final String Table_9_col_16 = "circulatie_shock";
    public static final String Table_9_col_17 = "circulatie_id";

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

        //tabel 6
        db.execSQL("create table " + DATABASE_table_6 + "(" + Table_6_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_6_col_2 + " INTEGER DEFAULT 0 ," + Table_6_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_6_col_4 + " INTEGER DEFAULT 0 ," + Table_6_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_6_col_6 + " INTEGER DEFAULT 0 ," + Table_6_col_7 + " INTEGER DEFAULT 0 ,"
                + Table_6_col_8 + " INTEGER DEFAULT 0 ," + Table_6_col_9 + " INTEGER DEFAULT 0 ,"
                + Table_6_col_10 + " INTEGER DEFAULT 0 ," + Table_6_col_11 + " INTEGER DEFAULT 0 ,"
                + Table_6_col_12 + " INTEGER DEFAULT 0 ," + Table_6_col_13 + " INTEGER DEFAULT 0 ,"
                + Table_6_col_14 + " INTEGER DEFAULT 0 ," + Table_6_col_15 + " INTEGER DEFAULT 0 ,"
                + Table_6_col_16 + " INTEGER DEFAULT 0 ," + Table_6_col_17 + " INTEGER DEFAULT 0 ,"
                + Table_6_col_18 + " INTEGER DEFAULT 0 ," + Table_6_col_19 + " INTEGER DEFAULT 0 primary key)");

        //tabel 7
        db.execSQL("create table " + DATABASE_table_7 + "(" + Table_7_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_7_col_2 + " INTEGER DEFAULT 0 ," + Table_7_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_7_col_4 + " INTEGER DEFAULT 0 ," + Table_7_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_7_col_6 + " INTEGER DEFAULT 0 ," + Table_7_col_7 + " INTEGER DEFAULT 0 ,"
                + Table_7_col_8 + " INTEGER DEFAULT 0 ," + Table_7_col_9 + " INTEGER DEFAULT 0 ,"
                + Table_7_col_10 + " INTEGER DEFAULT 0 ," + Table_7_col_11 + " INTEGER DEFAULT 0 ,"
                + Table_7_col_12 + " INTEGER DEFAULT 0 primary key)");

        //tabel 8
        db.execSQL("create table " + DATABASE_table_8 + "(" + Table_8_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_8_col_2 + " INTEGER DEFAULT 0 ," + Table_8_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_8_col_4 + " INTEGER DEFAULT 0 ," + Table_8_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_8_col_6 + " INTEGER DEFAULT 0 ," + Table_8_col_7 + " INTEGER DEFAULT 0 ,"
                + Table_8_col_8 + " INTEGER DEFAULT 0 ," + Table_8_col_9 + " INTEGER DEFAULT 0 ,"
                + Table_8_col_10 + " INTEGER DEFAULT 0 primary key)");

        //tabel 9
        db.execSQL("create table " + DATABASE_table_9 + "(" + Table_9_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_2 + " INTEGER DEFAULT 0 ," + Table_9_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_4 + " INTEGER DEFAULT 0 ," + Table_9_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_6 + " INTEGER DEFAULT 0 ," + Table_9_col_7 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_9 + " INTEGER DEFAULT 0 ," + Table_9_col_9 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_10 + " INTEGER DEFAULT 0 ," + Table_9_col_11 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_12 + " INTEGER DEFAULT 0 ," + Table_9_col_13 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_14 + " INTEGER DEFAULT 0 ," + Table_9_col_15 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_16 + " INTEGER DEFAULT 0 ," + Table_9_col_17 + " INTEGER DEFAULT 0 primary key)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_1);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_2);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_3);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_4);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_5);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_6);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_7);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_8);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_9);
    }
}
