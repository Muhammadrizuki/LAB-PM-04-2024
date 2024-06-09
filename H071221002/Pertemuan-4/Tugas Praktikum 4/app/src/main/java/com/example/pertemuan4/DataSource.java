package com.example.pertemuan4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("fattsyach","Fattah Syach"
                ,"Haii Maniezz"
                ,R.drawable.fattahsyach,R.drawable.fattahsyach));

        instagrams1.add(new Instagram("fadialaydrus", "Fadi Alaydrus"
                ,"Serius amat bangg"
                ,R.drawable.fadialaydrus,R.drawable.fadialaydrus));

        instagrams1.add(new Instagram("naura.ayu", "Naura Ayu"
                ,"Mataharinya Cantik"
                ,R.drawable.nauraayu, R.drawable.nauraayu));

        instagrams1.add(new Instagram("syifahadju","Syifa Hadju"
                ,"Hello Everyone"
                ,R.drawable.syifahadju,R.drawable.syifahadju));

        instagrams1.add(new Instagram("rizkynazar20", "Rizky Nazar"
                ,"Memandangmu"
                ,R.drawable.rizkynazar,R.drawable.rizkynazar));

        instagrams1.add(new Instagram("juniorrobertss","Junior Roberts"
                ,"Langitnya cantik ya, kek kamu awokawok"
                ,R.drawable.juniorroberts, R.drawable.juniorroberts));

        instagrams1.add(new Instagram("sandrinna_11","Sandrina Michelle"
                , "New Hairr"
                ,R.drawable.sandrinamichelle,R.drawable.sandrinamichelle));

        instagrams1.add(new Instagram("muhamadvaleron__","Muhamad Valeron"
                ,"Futsal dulu baru kamu hehe"
                ,R.drawable.muhammadvaleron, R.drawable.muhammadvaleron));

        instagrams1.add(new Instagram("harry.vghn", "Harry Vaughan"
                ,"Holiday"
                ,R.drawable.harryvaughan, R.drawable.harryvaughan));

        instagrams1.add(new Instagram("aryamohan7", "Arya Mohan"
                ,"Tatap mata saya"
                ,R.drawable.aryamohan, R.drawable.aryamohan));
        return instagrams1;
    }
}
