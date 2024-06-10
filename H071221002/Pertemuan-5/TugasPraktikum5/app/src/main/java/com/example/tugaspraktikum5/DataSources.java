package com.example.tugaspraktikum5;

import java.util.ArrayList;

public class DataSources {

    public static ArrayList<Instagram> instagrams =generateDummyInstagram();

    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("fattsyach", "Fattah Syach", "Heii maniezz"
                ,R.drawable.fattah3, R.drawable.fattah3));

        instagrams1.add(new Instagram("muhamadvaleron__", "Muhamad Valeron", "Futsal dulu baru kamu hehehe"
                ,R.drawable.eyooonn, R.drawable.eyooonn));

        instagrams1.add(new Instagram("juniorrobertss", "Junior Roberts", "Langitnya cantik ya, kek kamuu"
                ,R.drawable.juniorroberts, R.drawable.juniorroberts));

        instagrams1.add(new Instagram("fadialaydrus", "Fadi Alaydrus", "Lagi apa maniezz"
                ,R.drawable.fadialaydrus, R.drawable.fadialaydrus));

        return instagrams1;

    }

}