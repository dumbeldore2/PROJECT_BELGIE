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
                + Table_9_col_8 + " INTEGER DEFAULT 0 ," + Table_9_col_9 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_10 + " INTEGER DEFAULT 0 ," + Table_9_col_11 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_12 + " INTEGER DEFAULT 0 ," + Table_9_col_13 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_14 + " INTEGER DEFAULT 0 ," + Table_9_col_15 + " INTEGER DEFAULT 0 ,"
                + Table_9_col_16 + " INTEGER DEFAULT 0 ," + Table_9_col_17 + " INTEGER DEFAULT 0 primary key)");

        //tabel 10
        db.execSQL("create table " + DATABASE_table_10 + "(" + Table_10_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_10_col_2 + " INTEGER DEFAULT 0 ," + Table_10_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_10_col_4 + " INTEGER DEFAULT 0 ," + Table_10_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_10_col_6 + " INTEGER DEFAULT 0 ," + Table_10_col_7 + " INTEGER DEFAULT 0 ,"
                + Table_10_col_8 + " INTEGER DEFAULT 0 ," + Table_10_col_9 + " INTEGER DEFAULT 0 ,"
                + Table_10_col_10 + " INTEGER DEFAULT 0 ," + Table_10_col_11 + " INTEGER DEFAULT 0 ,"
                + Table_10_col_12 + " INTEGER DEFAULT 0 ," + Table_10_col_13 + " INTEGER DEFAULT 0 ,"
                + Table_10_col_14 + " INTEGER DEFAULT 0 ," + Table_10_col_15 + " INTEGER DEFAULT 0 ,"
                + Table_10_col_16 + " INTEGER DEFAULT 0 ," + Table_10_col_17 + " INTEGER DEFAULT 0 ,"
                + Table_10_col_18 + " INTEGER DEFAULT 0 primary key)");

        //tabel 11
        db.execSQL("create table " + DATABASE_table_11 + "(" + Table_11_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_11_col_2 + " INTEGER DEFAULT 0 ," + Table_11_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_11_col_4 + " INTEGER DEFAULT 0 ," + Table_11_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_11_col_6 + " INTEGER DEFAULT 0 ," + Table_11_col_7 + " INTEGER DEFAULT 0 ,"
                + Table_11_col_8 + " INTEGER DEFAULT 0 ," + Table_11_col_9 + " INTEGER DEFAULT 0 ,"
                + Table_11_col_10 + " INTEGER DEFAULT 0 ," + Table_11_col_11 + " INTEGER DEFAULT 0 ,"
                + Table_11_col_12 + " INTEGER DEFAULT 0 ," + Table_11_col_13 + " INTEGER DEFAULT 0 primary key)");

        //tabel 12
        db.execSQL("create table " + DATABASE_table_12 + "(" + Table_12_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_12_col_2 + " INTEGER DEFAULT 0 ," + Table_12_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_12_col_4 + " INTEGER DEFAULT 0 primary key)");

        //tabel 13
        db.execSQL("create table " + DATABASE_table_13 + "(" + Table_13_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_13_col_2 + " INTEGER DEFAULT 0 ," + Table_13_col_3 + " INTEGER DEFAULT 0 primary key)");

        //tabel 14
        db.execSQL("create table " + DATABASE_table_14 + "(" + Table_14_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_14_col_2 + " INTEGER DEFAULT 0 ," + Table_14_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_14_col_4 + " INTEGER DEFAULT 0 ," + Table_14_col_5 + " INTEGER DEFAULT 0 ,"
                + Table_14_col_6 + " INTEGER DEFAULT 0 ," + Table_14_col_7 + " INTEGER DEFAULT 0 primary key)");

        //tabel 15
        db.execSQL("create table " + DATABASE_table_15 + "(" + Table_15_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_15_col_2 + " INTEGER DEFAULT 0 ," + Table_15_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_15_col_4 + " INTEGER DEFAULT 0 primary key)");

        //tabel 16
        db.execSQL("create table " + DATABASE_table_16 + "(" + Table_16_col_1 + " INTEGER DEFAULT 0 ,"
                + Table_16_col_2 + " INTEGER DEFAULT 0 ," + Table_16_col_3 + " INTEGER DEFAULT 0 ,"
                + Table_16_col_4 + " INTEGER DEFAULT 0 ," + Table_16_col_5 + " INTEGER DEFAULT 0 ,"
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
}
