package com.example.project_belgie;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Database extends SQLiteOpenHelper {

    //db naam
    public static String DATABASE_NAME = "database_project_belgie.db";

    //tabel 1
    public static final String DATABASE_table_1 = "persoon";
    public static final String Table_1_col_1 = "persoon_naam";
    public static final String Table_1_col_2 = "persoon_baby";
    public static final String Table_1_col_3 = "persoon_kind";
    public static final String Table_1_col_4 = "persoon_man";
    public static final String Table_1_col_5 = "persoon_vrouw";
    public static final String Table_1_col_6 = "persoon_20_40_jaar";
    public static final String Table_1_col_7 = "persoon_40_60_jaar";
    public static final String Table_1_col_8 = "persoon_60_80_jaar";
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

    //tabel 10
    public static final String DATABASE_table_10 = "symptoon";
    public static final String Table_10_col_1 = "symptoon_bewegingsdrang";
    public static final String Table_10_col_2 = "symptoon_snelle_evolutie";
    public static final String Table_10_col_3 = "symptoon_braken";
    public static final String Table_10_col_4 = "symptoon_depressief";
    public static final String Table_10_col_5 = "symptoon_deshydratatie";
    public static final String Table_10_col_6 = "symptoon_diarree";
    public static final String Table_10_col_7 = "symptoon_fotofobie";
    public static final String Table_10_col_8 = "symptoon_hartkloppingen";
    public static final String Table_10_col_9 = "symptoon_hypertherm";
    public static final String Table_10_col_10 = "symptoon_koorts";
    public static final String Table_10_col_11 = "symptoon_misselijk";
    public static final String Table_10_col_12 = "symptoon_nekstijf";
    public static final String Table_10_col_13 = "symptoon_onderkoeling";
    public static final String Table_10_col_14 = "symptoon_onwel";
    public static final String Table_10_col_15 = "symptoon_plankharde_buik";
    public static final String Table_10_col_16 = "symptoon_stuipen";
    public static final String Table_10_col_17 = "symptoon_suicidaal";
    public static final String Table_10_col_18 = "symptoon_id";

    //tabel 11
    public static final String DATABASE_table_11 = "lichaam";
    public static final String Table_11_col_1 = "lichaam_hoofd";
    public static final String Table_11_col_2 = "lichaam_aangezicht";
    public static final String Table_11_col_3 = "lichaam_hals_en_nek";
    public static final String Table_11_col_4 = "lichaam_schouders";
    public static final String Table_11_col_5 = "lichaam_arm_hand";
    public static final String Table_11_col_6 = "lichaam_thorax";
    public static final String Table_11_col_7 = "lichaam_buik";
    public static final String Table_11_col_8 = "lichaam_rug";
    public static final String Table_11_col_9 = "lichaam_onderrug";
    public static final String Table_11_col_10 = "lichaam_stuit";
    public static final String Table_11_col_11 = "lichaam_bekken";
    public static final String Table_11_col_12 = "lichaam_voeten";
    public static final String Table_11_col_13 = "lichaam_id";

    //tabel 12
    public static final String DATABASE_table_12 = "epileptie";
    public static final String Table_12_col_1 = "epileptie_eerste_aanval";
    public static final String Table_12_col_2 = "epileptie_status";
    public static final String Table_12_col_3 = "epileptie_meerdere_aanvallen";
    public static final String Table_12_col_4 = "epileptie_id";

    //tabel 13
    public static final String DATABASE_table_13 = "glyceamie";
    public static final String Table_13_col_1 = "glyceamie_hypo";
    public static final String Table_13_col_2 = "glyceamie_hyper";
    public static final String Table_13_col_3 = "glyceamie_id";

    //tabel 14
    public static final String DATABASE_table_14 = "trauma";
    public static final String Table_14_col_1 = "trauma_wonde";
    public static final String Table_14_col_2 = "trauma_brandwonde";
    public static final String Table_14_col_3 = "trauma_breuk_open";
    public static final String Table_14_col_4 = "trauma_breuk_gesloten";
    public static final String Table_14_col_5 = "trauma_eject_H_E_T";
    public static final String Table_14_col_6 = "trauma_gekneld";
    public static final String Table_14_col_7 = "trauma_buik";
    public static final String Table_14_col_8 = "trauma_id";

    //tabel 15
    public static final String DATABASE_table_15 = "electro";
    public static final String Table_15_col_1 = "electro_laagspanning";
    public static final String Table_15_col_2 = "electro_220v";
    public static final String Table_15_col_3 = "electro_hoogspanning";
    public static final String Table_15_col_4 = "electro_id";

    //tabel 16
    public static final String DATABASE_table_16 = "zwanger";
    public static final String Table_16_col_1 = "zwanger_trim_1";
    public static final String Table_16_col_2 = "zwanger_trim_2";
    public static final String Table_16_col_3 = "zwanger_trim_3";
    public static final String Table_16_col_4 = "zwanger_water_gebroken";
    public static final String Table_16_col_5 = "zwanger_persdrang";
    public static final String Table_16_col_6 = "zwanger_id";

    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //tabel 1
        db.execSQL("create table " + DATABASE_table_1 + "(" + Table_1_col_1 + " TEXT ,"
                + Table_1_col_2 + " TEXT DEFAULT 'false'," + Table_1_col_3 + " TEXT DEFAULT 'false',"
                + Table_1_col_4 + " TEXT DEFAULT 'false'," + Table_1_col_5 + " TEXT DEFAULT 'false',"
                + Table_1_col_6 + " TEXT DEFAULT 'false'," + Table_1_col_7 + " TEXT DEFAULT 'false',"
                + Table_1_col_8 + " TEXT DEFAULT 'false'," + Table_1_col_9 + " INTEGER DEFAULT 0 primary key)");

        //tabel 2
        db.execSQL("create table " + DATABASE_table_2 + "(" + Table_2_col_1 + " TEXT ,"
                + Table_2_col_2 + " TEXT ," + Table_2_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_2_col_4 + " TEXT DEFAULT 'false' ," + Table_2_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_2_col_6 + " TEXT DEFAULT 'false' ," + Table_2_col_7 + " TEXT DEFAULT 'false' ,"
                + Table_2_col_8 + " INTEGER DEFAULT 0 primary key)");

        //tabel 3
        db.execSQL("create table " + DATABASE_table_3 + "(" + Table_3_col_1 + " TEXT DEFAULT 'false',"
                + Table_3_col_2 + " TEXT DEFAULT 'false'," + Table_3_col_3 + " TEXT DEFAULT 'false',"
                + Table_3_col_4 + " TEXT DEFAULT 'false'," + Table_3_col_5 + " TEXT DEFAULT 'false',"
                + Table_3_col_6 + " INTEGER DEFAULT 0 primary key)");

        //tabel 4
        db.execSQL("create table " + DATABASE_table_4 + "(" + Table_4_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_4_col_2 + " TEXT DEFAULT 'false' ," + Table_4_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_4_col_4 + " TEXT DEFAULT 'false' ," + Table_4_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_4_col_6 + " TEXT DEFAULT 'false' ," + Table_4_col_7 + " INTEGER DEFAULT 0 primary key)");

        //tabel 5
        db.execSQL("create table " + DATABASE_table_5 + "(" + Table_5_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_5_col_2 + " TEXT DEFAULT 'false' ," + Table_5_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_5_col_4 + " TEXT DEFAULT 'false' ," + Table_5_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_5_col_6 + " TEXT DEFAULT 'false' ," + Table_5_col_7 + " INTEGER DEFAULT 0 primary key)");

        //tabel 6
        db.execSQL("create table " + DATABASE_table_6 + "(" + Table_6_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_6_col_2 + " TEXT DEFAULT 'false' ," + Table_6_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_6_col_4 + " TEXT DEFAULT 'false' ," + Table_6_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_6_col_6 + " TEXT DEFAULT 'false' ," + Table_6_col_7 + " TEXT DEFAULT 'false' ,"
                + Table_6_col_8 + " TEXT DEFAULT 'false' ," + Table_6_col_9 + " TEXT DEFAULT 'false' ,"
                + Table_6_col_10 + " TEXT DEFAULT 'false' ," + Table_6_col_11 + " TEXT DEFAULT 'false' ,"
                + Table_6_col_12 + " TEXT DEFAULT 'false' ," + Table_6_col_13 + " TEXT DEFAULT 'false' ,"
                + Table_6_col_14 + " TEXT DEFAULT 'false' ," + Table_6_col_15 + " TEXT DEFAULT 'false' ,"
                + Table_6_col_16 + " TEXT DEFAULT 'false' ," + Table_6_col_17 + " TEXT DEFAULT 'false' ,"
                + Table_6_col_18 + " TEXT DEFAULT 'false' ," + Table_6_col_19 + " INTEGER DEFAULT 0 primary key)");

        //tabel 7
        db.execSQL("create table " + DATABASE_table_7 + "(" + Table_7_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_7_col_2 + " TEXT DEFAULT 'false' ," + Table_7_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_7_col_4 + " TEXT DEFAULT 'false' ," + Table_7_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_7_col_6 + " TEXT DEFAULT 'false' ," + Table_7_col_7 + " TEXT DEFAULT 'false' ,"
                + Table_7_col_8 + " TEXT DEFAULT 'false' ," + Table_7_col_9 + " TEXT DEFAULT 'false' ,"
                + Table_7_col_10 + " TEXT DEFAULT 'false' ," + Table_7_col_11 + " TEXT DEFAULT 'false' ,"
                + Table_7_col_12 + " INTEGER DEFAULT 0 primary key)");

        //tabel 8
        db.execSQL("create table " + DATABASE_table_8 + "(" + Table_8_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_8_col_2 + " TEXT DEFAULT 'false' ," + Table_8_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_8_col_4 + " TEXT DEFAULT 'false' ," + Table_8_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_8_col_6 + " TEXT DEFAULT 'false' ," + Table_8_col_7 + " TEXT DEFAULT 'false' ,"
                + Table_8_col_8 + " TEXT DEFAULT 'false' ," + Table_8_col_9 + " TEXT DEFAULT 'false' ,"
                + Table_8_col_10 + " INTEGER DEFAULT 0 primary key)");

        //tabel 9
        db.execSQL("create table " + DATABASE_table_9 + "(" + Table_9_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_9_col_2 + " TEXT DEFAULT 'false' ," + Table_9_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_9_col_4 + " TEXT DEFAULT 'false' ," + Table_9_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_9_col_6 + " TEXT DEFAULT 'false' ," + Table_9_col_7 + " TEXT DEFAULT 'false' ,"
                + Table_9_col_8 + " TEXT DEFAULT 'false' ," + Table_9_col_9 + " TEXT DEFAULT 'false' ,"
                + Table_9_col_10 + " TEXT DEFAULT 'false' ," + Table_9_col_11 + " TEXT DEFAULT 'false' ,"
                + Table_9_col_12 + " TEXT DEFAULT 'false' ," + Table_9_col_13 + " TEXT DEFAULT 'false' ,"
                + Table_9_col_14 + " TEXT DEFAULT 'false' ," + Table_9_col_15 + " TEXT DEFAULT 'false' ,"
                + Table_9_col_16 + " TEXT DEFAULT 'false' ," + Table_9_col_17 + " INTEGER DEFAULT 0 primary key)");

        //tabel 10
        db.execSQL("create table " + DATABASE_table_10 + "(" + Table_10_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_10_col_2 + " TEXT DEFAULT 'false' ," + Table_10_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_10_col_4 + " TEXT DEFAULT 'false' ," + Table_10_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_10_col_6 + " TEXT DEFAULT 'false' ," + Table_10_col_7 + " TEXT DEFAULT 'false' ,"
                + Table_10_col_8 + " TEXT DEFAULT 'false' ," + Table_10_col_9 + " TEXT DEFAULT 'false' ,"
                + Table_10_col_10 + " TEXT DEFAULT 'false' ," + Table_10_col_11 + " TEXT DEFAULT 'false' ,"
                + Table_10_col_12 + " TEXT DEFAULT 'false' ," + Table_10_col_13 + " TEXT DEFAULT 'false' ,"
                + Table_10_col_14 + " TEXT DEFAULT 'false' ," + Table_10_col_15 + " TEXT DEFAULT 'false' ,"
                + Table_10_col_16 + " TEXT DEFAULT 'false' ," + Table_10_col_17 + " TEXT DEFAULT 'false' ,"
                + Table_10_col_18 + " INTEGER DEFAULT 0 primary key)");

        //tabel 11
        db.execSQL("create table " + DATABASE_table_11 + "(" + Table_11_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_11_col_2 + " TEXT DEFAULT 'false' ," + Table_11_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_11_col_4 + " TEXT DEFAULT 'false' ," + Table_11_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_11_col_6 + " TEXT DEFAULT 'false' ," + Table_11_col_7 + " TEXT DEFAULT 'false' ,"
                + Table_11_col_8 + " TEXT DEFAULT 'false' ," + Table_11_col_9 + " TEXT DEFAULT 'false' ,"
                + Table_11_col_10 + " TEXT DEFAULT 'false' ," + Table_11_col_11 + " TEXT DEFAULT 'false' ,"
                + Table_11_col_12 + " TEXT DEFAULT 'false' ," + Table_11_col_13 + " INTEGER DEFAULT 0 primary key)");

        //tabel 12
        db.execSQL("create table " + DATABASE_table_12 + "(" + Table_12_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_12_col_2 + " TEXT DEFAULT 'false' ," + Table_12_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_12_col_4 + " INTEGER DEFAULT 0 primary key)");

        //tabel 13
        db.execSQL("create table " + DATABASE_table_13 + "(" + Table_13_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_13_col_2 + " TEXT DEFAULT 'false' ," + Table_13_col_3 + " INTEGER DEFAULT 0 primary key)");

        //tabel 14
        db.execSQL("create table " + DATABASE_table_14 + "(" + Table_14_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_14_col_2 + " TEXT DEFAULT 'false' ," + Table_14_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_14_col_4 + " TEXT DEFAULT 'false' ," + Table_14_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_14_col_6 + " TEXT DEFAULT 'false' ," + Table_14_col_7 + " TEXT DEFAULT 'false' ,"
                + Table_14_col_8 + " INTEGER DEFAULT 0 primary key)");

        //tabel 15
        db.execSQL("create table " + DATABASE_table_15 + "(" + Table_15_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_15_col_2 + " TEXT DEFAULT 'false' ," + Table_15_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_15_col_4 + " INTEGER DEFAULT 0 primary key)");

        //tabel 16
        db.execSQL("create table " + DATABASE_table_16 + "(" + Table_16_col_1 + " TEXT DEFAULT 'false' ,"
                + Table_16_col_2 + " TEXT DEFAULT 'false' ," + Table_16_col_3 + " TEXT DEFAULT 'false' ,"
                + Table_16_col_4 + " TEXT DEFAULT 'false' ," + Table_16_col_5 + " TEXT DEFAULT 'false' ,"
                + Table_16_col_6 + " INTEGER DEFAULT 0 primary key)");

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
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_10);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_11);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_12);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_13);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_14);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_15);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_table_16);
    }


    public int IDMAKERTABLE1() {

        int uit = -1;

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select * from " + DATABASE_table_1, null
        );
        if (cursor.getCount() == 0) {
            uit = 0;
        } else {
            Cursor cursor1 = sqLiteDatabase.rawQuery("select max(" + Table_1_col_9 + " ) from " + DATABASE_table_1 + "", null);
            StringBuffer stringBuffer = new StringBuffer();
            if (cursor1.moveToFirst()) {
                stringBuffer.append(cursor1.getString(0));
                uit = Integer.parseInt(stringBuffer.toString()) + 1;
            }
        }
        return uit;
    }

    public int IDMAKERTABLEINFINITY() {

        int uit = -1;

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select * from " + DATABASE_table_1, null
        );
        if (cursor.getCount() == 0) {
            uit = 0;
        } else {
            Cursor cursor1 = sqLiteDatabase.rawQuery("select max(" + Table_1_col_9 + " ) from " + DATABASE_table_1 + "", null);
            StringBuffer stringBuffer = new StringBuffer();
            if (cursor1.moveToFirst()) {
                stringBuffer.append(cursor1.getString(0));
                uit = Integer.parseInt(stringBuffer.toString());
            }
        }
        return uit;
    }


    public void addToTabel1() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_1_col_9, IDMAKERTABLE1());

        sqLiteDatabase.insert(DATABASE_table_1, null, contentValues);
    }

    public void addToTabel2() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_2_col_8, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_2, null, contentValues);
    }

    public void addToTabel3() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_3_col_6, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_3, null, contentValues);
    }

    public void addToTabel4() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_4_col_7, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_4, null, contentValues);
    }

    public void addToTabel5() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_5_col_7, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_5, null, contentValues);
    }

    public void addToTabel6() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_6_col_19, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_6, null, contentValues);
    }

    public void addToTabel7() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_7_col_12, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_7, null, contentValues);
    }

    public void addToTabel8() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_8_col_10, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_8, null, contentValues);
    }

    public void addToTabel9() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_9_col_17, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_9, null, contentValues);
    }

    public void addToTabel10() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_10_col_18, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_10, null, contentValues);
    }

    public void addToTabel11() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_11_col_13, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_11, null, contentValues);
    }

    public void addToTabel12() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_12_col_4, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_12, null, contentValues);
    }

    public void addToTabel13() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_13_col_3, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_13, null, contentValues);
    }

    public void addToTabel14() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_14_col_8, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_14, null, contentValues);
    }

    public void addToTabel15() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_15_col_4, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_15, null, contentValues);
    }

    public void addToTabel16() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_16_col_6, IDMAKERTABLEINFINITY());

        sqLiteDatabase.insert(DATABASE_table_16, null, contentValues);
    }

    //alles te maken met tabel 1

    public String getTable_1_col_1() {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        String uit = "";
        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_1_col_1 + " from " + DATABASE_table_1 + " where " + Table_1_col_9 + " == " + IDMAKERTABLEINFINITY() + "", null);
        StringBuffer stringBuffer = new StringBuffer();
        if (cursor1.moveToFirst()) {
            stringBuffer.append(cursor1.getString(0));

            if (stringBuffer.toString().length() != 0) {
                uit = stringBuffer.toString();
            }
        }
        return uit;
    }

    public void setTable_1_col_1(String naam) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_1_col_1, naam);
        contentValues.put(Table_1_col_9, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_1, contentValues, Table_1_col_9 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }

    public ArrayList<String> Table_1_col_2_tot_8() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        //tabel 1 col 2
        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_1_col_2 + " from "
                + DATABASE_table_1 + " where " + Table_1_col_9 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //tabel 1 col 3
        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_1_col_3 + " from "
                + DATABASE_table_1 + " where " + Table_1_col_9 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //tabel 1 col 4
        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_1_col_4 + " from "
                + DATABASE_table_1 + " where " + Table_1_col_9 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //tabel 1 col 5
        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_1_col_5 + " from "
                + DATABASE_table_1 + " where " + Table_1_col_9 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //tabel 1 col 6
        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_1_col_6 + " from "
                + DATABASE_table_1 + " where " + Table_1_col_9 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //tabel 1 col 7
        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_1_col_7 + " from "
                + DATABASE_table_1 + " where " + Table_1_col_9 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //tabel 1 col 8
        Cursor cursor7 = sqLiteDatabase.rawQuery("select " + Table_1_col_8 + " from "
                + DATABASE_table_1 + " where " + Table_1_col_9 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor7.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor7.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;
    }

    public void setTable_1_col_2_tot_8(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_1_col_2, arrayList.get(0));
        contentValues.put(Table_1_col_3, arrayList.get(1));
        contentValues.put(Table_1_col_4, arrayList.get(2));
        contentValues.put(Table_1_col_5, arrayList.get(3));
        contentValues.put(Table_1_col_6, arrayList.get(4));
        contentValues.put(Table_1_col_7, arrayList.get(5));
        contentValues.put(Table_1_col_8, arrayList.get(6));
        contentValues.put(Table_1_col_9, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_1, contentValues, Table_1_col_9 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }

    //alles te maken met tabel 2

    public ArrayList<String> Table_2_col_1_tot_2() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 2 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_2_col_1 + " from "
                + DATABASE_table_2 + " where " + Table_2_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 2 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_2_col_2 + " from "
                + DATABASE_table_2 + " where " + Table_2_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        return arrayList_uit;
    }


    public ArrayList<String> Table_2_col_3_tot_7() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 2 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_2_col_3 + " from "
                + DATABASE_table_2 + " where " + Table_2_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        //table 2 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_2_col_4 + " from "
                + DATABASE_table_2 + " where " + Table_2_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        //table 2 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_2_col_5 + " from "
                + DATABASE_table_2 + " where " + Table_2_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        //table 2 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_2_col_6 + " from "
                + DATABASE_table_2 + " where " + Table_2_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        //table 2 col 7

        Cursor cursor7 = sqLiteDatabase.rawQuery("select " + Table_2_col_7 + " from "
                + DATABASE_table_2 + " where " + Table_2_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor7.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor7.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        return arrayList_uit;
    }


    public void setTable_2_col_1(String adres) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_2_col_1, adres);
        contentValues.put(Table_2_col_8, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_2, contentValues, Table_2_col_8 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }

    public void setTable_2_col_2(String gemmeente) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_2_col_2, gemmeente);
        contentValues.put(Table_2_col_8, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_2, contentValues, Table_2_col_8 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }


    public void setTable_2_col_1_tot_8(ArrayList<String> arrayList, ArrayList<String> arrayList1) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_2_col_1, arrayList.get(0));
        contentValues.put(Table_2_col_2, arrayList.get(1));
        contentValues.put(Table_2_col_3, arrayList1.get(0));
        contentValues.put(Table_2_col_4, arrayList1.get(1));
        contentValues.put(Table_2_col_5, arrayList1.get(2));
        contentValues.put(Table_2_col_6, arrayList1.get(3));
        contentValues.put(Table_2_col_7, arrayList1.get(4));
        contentValues.put(Table_2_col_8, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_2, contentValues, Table_2_col_8 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }


    //alles te maken met tabel 3

    public ArrayList<String> Table_3_col_1_tot_5() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 3 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_3_col_1 + " from "
                + DATABASE_table_3 + " where " + Table_3_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }


        //table 3 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_3_col_2 + " from "
                + DATABASE_table_3 + " where " + Table_3_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 3 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_3_col_3 + " from "
                + DATABASE_table_3 + " where " + Table_3_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 3 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_3_col_4 + " from "
                + DATABASE_table_3 + " where " + Table_3_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 3 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_3_col_5 + " from "
                + DATABASE_table_3 + " where " + Table_3_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;

    }


    public void setTable_3_col_1_tot_5(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_3_col_1, arrayList.get(0));
        contentValues.put(Table_3_col_2, arrayList.get(1));
        contentValues.put(Table_3_col_3, arrayList.get(2));
        contentValues.put(Table_3_col_4, arrayList.get(3));
        contentValues.put(Table_3_col_5, arrayList.get(4));
        contentValues.put(Table_3_col_6, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_3, contentValues, Table_3_col_6 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }


    //alles te maken met tabel 4

    public ArrayList<String> Table_4_col_1_tot_6() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();


        //table 4 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_4_col_1 + " from "
                + DATABASE_table_4 + " where " + Table_4_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 4 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_4_col_2 + " from "
                + DATABASE_table_4 + " where " + Table_4_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 4 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_4_col_3 + " from "
                + DATABASE_table_4 + " where " + Table_4_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 4 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_4_col_4 + " from "
                + DATABASE_table_4 + " where " + Table_4_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 4 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_4_col_5 + " from "
                + DATABASE_table_4 + " where " + Table_4_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 4 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_4_col_6 + " from "
                + DATABASE_table_4 + " where " + Table_4_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;
    }


    public void setTable_4_col_1_tot_6(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_5_col_1, arrayList.get(0));
        contentValues.put(Table_5_col_2, arrayList.get(1));
        contentValues.put(Table_5_col_3, arrayList.get(2));
        contentValues.put(Table_5_col_4, arrayList.get(3));
        contentValues.put(Table_5_col_5, arrayList.get(4));
        contentValues.put(Table_5_col_6, arrayList.get(5));
        contentValues.put(Table_5_col_7, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_5, contentValues, Table_5_col_7 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }


    //alles te maken met tabel 5

    public ArrayList<String> Table_5_col_1_tot_6() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 5 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_5_col_1 + " from "
                + DATABASE_table_5 + " where " + Table_5_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 5 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_5_col_2 + " from "
                + DATABASE_table_5 + " where " + Table_5_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 5 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_5_col_3 + " from "
                + DATABASE_table_5 + " where " + Table_5_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 5 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_5_col_4 + " from "
                + DATABASE_table_5 + " where " + Table_5_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 5 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_5_col_5 + " from "
                + DATABASE_table_5 + " where " + Table_5_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 5 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_5_col_6 + " from "
                + DATABASE_table_5 + " where " + Table_5_col_7 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;
    }


    public void setTable_5_col_1_tot_6(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_5_col_1, arrayList.get(0));
        contentValues.put(Table_5_col_2, arrayList.get(1));
        contentValues.put(Table_5_col_3, arrayList.get(2));
        contentValues.put(Table_5_col_4, arrayList.get(3));
        contentValues.put(Table_5_col_5, arrayList.get(4));
        contentValues.put(Table_5_col_6, arrayList.get(5));
        contentValues.put(Table_5_col_7, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_5, contentValues, Table_5_col_7 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }


    //alles te maken met tabel 6

    public ArrayList<String> Table_6_col_1_tot_18() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 6 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_6_col_1 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_6_col_2 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_6_col_3 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_6_col_4 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_6_col_5 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_6_col_6 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 7

        Cursor cursor7 = sqLiteDatabase.rawQuery("select " + Table_6_col_7 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor7.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor7.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 8

        Cursor cursor8 = sqLiteDatabase.rawQuery("select " + Table_6_col_8 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor8.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor8.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 9

        Cursor cursor9 = sqLiteDatabase.rawQuery("select " + Table_6_col_9 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor9.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor9.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 10

        Cursor cursor10 = sqLiteDatabase.rawQuery("select " + Table_6_col_10 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor10.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor10.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 11

        Cursor cursor11 = sqLiteDatabase.rawQuery("select " + Table_6_col_11 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor11.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor11.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 12

        Cursor cursor12 = sqLiteDatabase.rawQuery("select " + Table_6_col_12 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor12.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor12.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 13

        Cursor cursor13 = sqLiteDatabase.rawQuery("select " + Table_6_col_13 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor13.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor13.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 14

        Cursor cursor14 = sqLiteDatabase.rawQuery("select " + Table_6_col_14 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor14.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor14.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 15

        Cursor cursor15 = sqLiteDatabase.rawQuery("select " + Table_6_col_15 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor15.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor15.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 16

        Cursor cursor16 = sqLiteDatabase.rawQuery("select " + Table_6_col_16 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor16.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor16.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 17

        Cursor cursor17 = sqLiteDatabase.rawQuery("select " + Table_6_col_17 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor17.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor17.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 6 col 18

        Cursor cursor18 = sqLiteDatabase.rawQuery("select " + Table_6_col_18 + " from "
                + DATABASE_table_6 + " where " + Table_6_col_19 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor18.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor18.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;
    }


    public void setTable_6_col_1_tot_18(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_6_col_1, arrayList.get(0));
        contentValues.put(Table_6_col_2, arrayList.get(1));
        contentValues.put(Table_6_col_3, arrayList.get(2));
        contentValues.put(Table_6_col_4, arrayList.get(3));
        contentValues.put(Table_6_col_5, arrayList.get(4));
        contentValues.put(Table_6_col_6, arrayList.get(5));
        contentValues.put(Table_6_col_7, arrayList.get(6));
        contentValues.put(Table_6_col_8, arrayList.get(7));
        contentValues.put(Table_6_col_9, arrayList.get(8));
        contentValues.put(Table_6_col_10, arrayList.get(9));
        contentValues.put(Table_6_col_11, arrayList.get(10));
        contentValues.put(Table_6_col_12, arrayList.get(11));
        contentValues.put(Table_6_col_13, arrayList.get(12));
        contentValues.put(Table_6_col_14, arrayList.get(13));
        contentValues.put(Table_6_col_15, arrayList.get(14));
        contentValues.put(Table_6_col_16, arrayList.get(15));
        contentValues.put(Table_6_col_17, arrayList.get(16));
        contentValues.put(Table_6_col_18, arrayList.get(17));
        contentValues.put(Table_6_col_19, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_6, contentValues, Table_6_col_19 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }


    //alles te maken met tabel 7

    public ArrayList<String> Table_7_col_1_tot_11() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 7 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_7_col_1 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_7_col_2 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_7_col_3 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_7_col_4 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_7_col_5 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_7_col_6 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 7

        Cursor cursor7 = sqLiteDatabase.rawQuery("select " + Table_7_col_7 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor7.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor7.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 8

        Cursor cursor8 = sqLiteDatabase.rawQuery("select " + Table_7_col_8 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor8.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor8.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 9

        Cursor cursor9 = sqLiteDatabase.rawQuery("select " + Table_7_col_9 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor9.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor9.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 10

        Cursor cursor10 = sqLiteDatabase.rawQuery("select " + Table_7_col_10 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor10.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor10.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 11

        Cursor cursor11 = sqLiteDatabase.rawQuery("select " + Table_7_col_11 + " from "
                + DATABASE_table_7 + " where " + Table_7_col_12 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor11.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor11.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        return arrayList_uit;
    }


    public void setTable_7_col_1_tot_11(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_7_col_1, arrayList.get(0));
        contentValues.put(Table_7_col_2, arrayList.get(1));
        contentValues.put(Table_7_col_3, arrayList.get(2));
        contentValues.put(Table_7_col_4, arrayList.get(3));
        contentValues.put(Table_7_col_5, arrayList.get(4));
        contentValues.put(Table_7_col_6, arrayList.get(5));
        contentValues.put(Table_7_col_7, arrayList.get(6));
        contentValues.put(Table_7_col_8, arrayList.get(7));
        contentValues.put(Table_7_col_9, arrayList.get(8));
        contentValues.put(Table_7_col_10, arrayList.get(9));
        contentValues.put(Table_7_col_11, arrayList.get(10));
        contentValues.put(Table_7_col_12, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_7, contentValues, Table_7_col_12 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }

    //alles te maken met tabel 8

    public ArrayList<String> Table_8_col_1_tot_9() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 8 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_8_col_1 + " from "
                + DATABASE_table_8 + " where " + Table_8_col_10 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 8 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_8_col_2 + " from "
                + DATABASE_table_8 + " where " + Table_8_col_10 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 8 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_8_col_3 + " from "
                + DATABASE_table_8 + " where " + Table_8_col_10 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 8 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_8_col_4 + " from "
                + DATABASE_table_8 + " where " + Table_8_col_10 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 8 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_8_col_5 + " from "
                + DATABASE_table_8 + " where " + Table_8_col_10 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_8_col_6 + " from "
                + DATABASE_table_8 + " where " + Table_8_col_10 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 7 col 7

        Cursor cursor7 = sqLiteDatabase.rawQuery("select " + Table_8_col_7 + " from "
                + DATABASE_table_8 + " where " + Table_8_col_10 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor7.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor7.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 8 col 8

        Cursor cursor8 = sqLiteDatabase.rawQuery("select " + Table_8_col_8 + " from "
                + DATABASE_table_8 + " where " + Table_8_col_10 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor8.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor8.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 8 col 9

        Cursor cursor9 = sqLiteDatabase.rawQuery("select " + Table_8_col_9 + " from "
                + DATABASE_table_8 + " where " + Table_8_col_10 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor9.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor9.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        return arrayList_uit;
    }

    public void setTable_8_col_1_tot_9(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_8_col_1, arrayList.get(0));
        contentValues.put(Table_8_col_2, arrayList.get(1));
        contentValues.put(Table_8_col_3, arrayList.get(2));
        contentValues.put(Table_8_col_4, arrayList.get(3));
        contentValues.put(Table_8_col_5, arrayList.get(4));
        contentValues.put(Table_8_col_6, arrayList.get(5));
        contentValues.put(Table_8_col_7, arrayList.get(6));
        contentValues.put(Table_8_col_8, arrayList.get(7));
        contentValues.put(Table_8_col_9, arrayList.get(8));
        contentValues.put(Table_8_col_10, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_8, contentValues, Table_8_col_10 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }

    //alles te maken met tabel 9

    public ArrayList<String> Table_9_col_1_tot_16() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 9 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_9_col_1 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_9_col_2 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_9_col_3 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_9_col_4 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_9_col_5 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_9_col_6 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 7

        Cursor cursor7 = sqLiteDatabase.rawQuery("select " + Table_9_col_7 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor7.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor7.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 8

        Cursor cursor8 = sqLiteDatabase.rawQuery("select " + Table_9_col_8 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor8.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor8.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 9

        Cursor cursor9 = sqLiteDatabase.rawQuery("select " + Table_9_col_9 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor9.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor9.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 10

        Cursor cursor10 = sqLiteDatabase.rawQuery("select " + Table_9_col_10 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor10.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor10.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 11

        Cursor cursor11 = sqLiteDatabase.rawQuery("select " + Table_9_col_11 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor11.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor11.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 12

        Cursor cursor12 = sqLiteDatabase.rawQuery("select " + Table_9_col_12 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor12.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor12.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 13

        Cursor cursor13 = sqLiteDatabase.rawQuery("select " + Table_9_col_13 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor13.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor13.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 14

        Cursor cursor14 = sqLiteDatabase.rawQuery("select " + Table_9_col_14 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor14.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor14.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 15

        Cursor cursor15 = sqLiteDatabase.rawQuery("select " + Table_9_col_15 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor15.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor15.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 9 col 16

        Cursor cursor16 = sqLiteDatabase.rawQuery("select " + Table_9_col_16 + " from "
                + DATABASE_table_9 + " where " + Table_9_col_17 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor16.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor16.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;
    }


    public void setTable_9_col_1_tot_16(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_9_col_1, arrayList.get(0));
        contentValues.put(Table_9_col_2, arrayList.get(1));
        contentValues.put(Table_9_col_3, arrayList.get(2));
        contentValues.put(Table_9_col_4, arrayList.get(3));
        contentValues.put(Table_9_col_5, arrayList.get(4));
        contentValues.put(Table_9_col_6, arrayList.get(5));
        contentValues.put(Table_9_col_7, arrayList.get(6));
        contentValues.put(Table_9_col_8, arrayList.get(7));
        contentValues.put(Table_9_col_9, arrayList.get(8));
        contentValues.put(Table_9_col_10, arrayList.get(9));
        contentValues.put(Table_9_col_11, arrayList.get(10));
        contentValues.put(Table_9_col_12, arrayList.get(11));
        contentValues.put(Table_9_col_13, arrayList.get(12));
        contentValues.put(Table_9_col_14, arrayList.get(13));
        contentValues.put(Table_9_col_15, arrayList.get(14));
        contentValues.put(Table_9_col_16, arrayList.get(15));
        contentValues.put(Table_9_col_17, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_9, contentValues, Table_9_col_17 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }


    //alles te maken met tabel 10

    public ArrayList<String> Table_10_col_1_tot_17() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 10 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_10_col_1 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_10_col_2 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_10_col_3 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_10_col_4 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_10_col_5 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_10_col_6 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 7

        Cursor cursor7 = sqLiteDatabase.rawQuery("select " + Table_10_col_7 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor7.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor7.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 8

        Cursor cursor8 = sqLiteDatabase.rawQuery("select " + Table_10_col_8 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor8.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor8.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 9

        Cursor cursor9 = sqLiteDatabase.rawQuery("select " + Table_10_col_9 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor9.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor9.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 10

        Cursor cursor10 = sqLiteDatabase.rawQuery("select " + Table_10_col_10 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor10.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor10.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 11

        Cursor cursor11 = sqLiteDatabase.rawQuery("select " + Table_10_col_11 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor11.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor11.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 12

        Cursor cursor12 = sqLiteDatabase.rawQuery("select " + Table_10_col_12 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor12.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor12.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 13

        Cursor cursor13 = sqLiteDatabase.rawQuery("select " + Table_10_col_13 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor13.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor13.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 14

        Cursor cursor14 = sqLiteDatabase.rawQuery("select " + Table_10_col_14 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor14.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor14.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 15

        Cursor cursor15 = sqLiteDatabase.rawQuery("select " + Table_10_col_15 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor15.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor15.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 16

        Cursor cursor16 = sqLiteDatabase.rawQuery("select " + Table_10_col_16 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor16.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor16.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 10 col 17

        Cursor cursor17 = sqLiteDatabase.rawQuery("select " + Table_10_col_17 + " from "
                + DATABASE_table_10 + " where " + Table_10_col_18 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor17.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor17.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;
    }

    public void setTable_10_col_1_tot_17(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_10_col_1, arrayList.get(0));
        contentValues.put(Table_10_col_2, arrayList.get(1));
        contentValues.put(Table_10_col_3, arrayList.get(2));
        contentValues.put(Table_10_col_4, arrayList.get(3));
        contentValues.put(Table_10_col_5, arrayList.get(4));
        contentValues.put(Table_10_col_6, arrayList.get(5));
        contentValues.put(Table_10_col_7, arrayList.get(6));
        contentValues.put(Table_10_col_8, arrayList.get(7));
        contentValues.put(Table_10_col_9, arrayList.get(8));
        contentValues.put(Table_10_col_10, arrayList.get(9));
        contentValues.put(Table_10_col_11, arrayList.get(10));
        contentValues.put(Table_10_col_12, arrayList.get(11));
        contentValues.put(Table_10_col_13, arrayList.get(12));
        contentValues.put(Table_10_col_14, arrayList.get(13));
        contentValues.put(Table_10_col_15, arrayList.get(14));
        contentValues.put(Table_10_col_16, arrayList.get(15));
        contentValues.put(Table_10_col_17, arrayList.get(16));
        contentValues.put(Table_10_col_18, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_10, contentValues, Table_10_col_18 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }


    //alles te maken met tabel 11

    public ArrayList<String> Table_11_col_1_tot_12() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 11 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_11_col_1 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_11_col_2 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_11_col_3 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_11_col_4 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_11_col_5 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_11_col_6 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 7

        Cursor cursor7 = sqLiteDatabase.rawQuery("select " + Table_11_col_7 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor7.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor7.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 8

        Cursor cursor8 = sqLiteDatabase.rawQuery("select " + Table_11_col_8 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor8.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor8.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 9

        Cursor cursor9 = sqLiteDatabase.rawQuery("select " + Table_11_col_9 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor9.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor9.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 10

        Cursor cursor10 = sqLiteDatabase.rawQuery("select " + Table_11_col_10 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor10.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor10.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 11

        Cursor cursor11 = sqLiteDatabase.rawQuery("select " + Table_11_col_11 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor11.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor11.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 11 col 12

        Cursor cursor12 = sqLiteDatabase.rawQuery("select " + Table_11_col_12 + " from "
                + DATABASE_table_11 + " where " + Table_11_col_13 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor12.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor12.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;
    }


    public void setTable_11_col_1_tot_12(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_11_col_1, arrayList.get(0));
        contentValues.put(Table_11_col_2, arrayList.get(1));
        contentValues.put(Table_11_col_3, arrayList.get(2));
        contentValues.put(Table_11_col_4, arrayList.get(3));
        contentValues.put(Table_11_col_5, arrayList.get(4));
        contentValues.put(Table_11_col_6, arrayList.get(5));
        contentValues.put(Table_11_col_7, arrayList.get(6));
        contentValues.put(Table_11_col_8, arrayList.get(7));
        contentValues.put(Table_11_col_9, arrayList.get(8));
        contentValues.put(Table_11_col_10, arrayList.get(9));
        contentValues.put(Table_11_col_11, arrayList.get(10));
        contentValues.put(Table_11_col_12, arrayList.get(11));
        contentValues.put(Table_11_col_13, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_11, contentValues, Table_11_col_13 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }


    //alles te maken met tabel 12

    public ArrayList<String> Table_12_col_1_tot_3() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 12 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_12_col_1 + " from "
                + DATABASE_table_12 + " where " + Table_12_col_4 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }


        //table 12 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_12_col_2 + " from "
                + DATABASE_table_12 + " where " + Table_12_col_4 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 12 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_12_col_3 + " from "
                + DATABASE_table_12 + " where " + Table_12_col_4 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        return arrayList_uit;
    }

    public void setTable_12_1_tot_3(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_12_col_1, arrayList.get(0));
        contentValues.put(Table_12_col_2, arrayList.get(1));
        contentValues.put(Table_12_col_3, arrayList.get(2));
        contentValues.put(Table_12_col_4, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_12, contentValues, Table_12_col_4 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }

    //alles te maken met tabel 13

    public ArrayList<String> Table_13_col_1_tot_2() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 13 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_13_col_1 + " from "
                + DATABASE_table_13 + " where " + Table_13_col_3 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }


        //table 13 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_13_col_2 + " from "
                + DATABASE_table_13 + " where " + Table_13_col_3 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;
    }

    public void setTable_13_1_tot_2(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_13_col_1, arrayList.get(0));
        contentValues.put(Table_13_col_2, arrayList.get(1));
        contentValues.put(Table_13_col_3,IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_13, contentValues, Table_13_col_3 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }

    //alles te maken met tabel 14

    public ArrayList<String> Table_14_col_1_tot_7() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();


        //table 14 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_14_col_1 + " from "
                + DATABASE_table_14 + " where " + Table_14_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 14 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_14_col_2 + " from "
                + DATABASE_table_14 + " where " + Table_14_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 14 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_14_col_3 + " from "
                + DATABASE_table_14 + " where " + Table_14_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 14 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_14_col_4 + " from "
                + DATABASE_table_14 + " where " + Table_14_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 14 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_14_col_5 + " from "
                + DATABASE_table_14 + " where " + Table_14_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 14 col 6

        Cursor cursor6 = sqLiteDatabase.rawQuery("select " + Table_14_col_6 + " from "
                + DATABASE_table_14 + " where " + Table_14_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor6.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor6.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        //table 14 col 7

        Cursor cursor7 = sqLiteDatabase.rawQuery("select " + Table_14_col_7 + " from "
                + DATABASE_table_14 + " where " + Table_14_col_8 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor7.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor7.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        return arrayList_uit;
    }
    public void setTable_14_col_1_tot_7(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_14_col_1, arrayList.get(0));
        contentValues.put(Table_14_col_2, arrayList.get(1));
        contentValues.put(Table_14_col_3, arrayList.get(2));
        contentValues.put(Table_14_col_4, arrayList.get(3));
        contentValues.put(Table_14_col_5, arrayList.get(4));
        contentValues.put(Table_14_col_6, arrayList.get(5));
        contentValues.put(Table_14_col_7, arrayList.get(6));
        contentValues.put(Table_14_col_8, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_14, contentValues, Table_14_col_8 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }

    //alles te maken met tabel 15

    public ArrayList<String> Table_15_col_1_tot_3() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //table 15 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_15_col_1 + " from "
                + DATABASE_table_15 + " where " + Table_15_col_4 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }


        //table 15 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_15_col_2 + " from "
                + DATABASE_table_15 + " where " + Table_15_col_4 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 15 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_15_col_3 + " from "
                + DATABASE_table_15 + " where " + Table_15_col_4 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        return arrayList_uit;
    }

    public void setTable_15_1_tot_3(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_15_col_1, arrayList.get(0));
        contentValues.put(Table_15_col_2, arrayList.get(1));
        contentValues.put(Table_15_col_3, arrayList.get(2));
        contentValues.put(Table_15_col_4,IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_15, contentValues, Table_15_col_4 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }

    //alles te maken met tabel 16

    public ArrayList<String> Table_16_col_1_tot_5() {
        ArrayList<String> arrayList_uit = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();


        //table 16 col 1

        Cursor cursor1 = sqLiteDatabase.rawQuery("select " + Table_16_col_1 + " from "
                + DATABASE_table_16 + " where " + Table_16_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor1.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor1.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 16 col 2

        Cursor cursor2 = sqLiteDatabase.rawQuery("select " + Table_16_col_2 + " from "
                + DATABASE_table_16 + " where " + Table_16_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor2.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor2.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 16 col 3

        Cursor cursor3 = sqLiteDatabase.rawQuery("select " + Table_16_col_3 + " from "
                + DATABASE_table_16 + " where " + Table_16_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor3.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor3.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 16 col 4

        Cursor cursor4 = sqLiteDatabase.rawQuery("select " + Table_16_col_4 + " from "
                + DATABASE_table_16 + " where " + Table_16_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor4.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor4.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }

        //table 16 col 5

        Cursor cursor5 = sqLiteDatabase.rawQuery("select " + Table_16_col_5 + " from "
                + DATABASE_table_16 + " where " + Table_16_col_6 + " == " + IDMAKERTABLEINFINITY() + "", null);

        if (cursor5.moveToFirst()) {
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(cursor5.getString(0));
            arrayList_uit.add(stringBuffer1.toString());
        }
        return arrayList_uit;
    }

    public void setTable_16_col_1_tot_5(ArrayList<String> arrayList) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_16_col_1, arrayList.get(0));
        contentValues.put(Table_16_col_2, arrayList.get(1));
        contentValues.put(Table_16_col_3, arrayList.get(2));
        contentValues.put(Table_16_col_4, arrayList.get(3));
        contentValues.put(Table_16_col_5, arrayList.get(4));
        contentValues.put(Table_16_col_6, IDMAKERTABLEINFINITY());
        sqLiteDatabase.update(DATABASE_table_16, contentValues, Table_16_col_6 + " == ?", new String[]{IDMAKERTABLEINFINITY() + ""});
    }
}
