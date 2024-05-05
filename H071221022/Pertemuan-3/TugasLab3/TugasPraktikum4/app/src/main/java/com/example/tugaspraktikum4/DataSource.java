package com.example.tugaspraktikum4;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<User> userss = generateDummyusers();

    private static ArrayList<User> generateDummyusers() {
        ArrayList<User> users  = new ArrayList<>();

        ArrayList<Integer> liststory = new ArrayList<Integer>() ;
        liststory.add(R.drawable.kambing);
        ArrayList<Post> listpost = new ArrayList<Post>() ;
        listpost.add(new Post(R.drawable.kambing, "Kambing adalah mamalia berkuku genap yang umumnya " +
                "ditemukan di berbagai belahan dunia. Mereka sering diternakkan untuk daging, susu, dan bulu."));
        users.add(new User("kambing", 2000, 100, R.drawable.kambing, liststory, listpost));


        ArrayList<Integer> liststory1 = new ArrayList<Integer>() ;
        liststory1.add(R.drawable.ular);
        ArrayList<Post> listpost1 = new ArrayList<Post>() ;
        listpost1.add(new Post(R.drawable.ular, "Ular adalah reptil berdarah dingin yang termasuk dalam ordo Squamata. Mereka tidak memiliki " +
                "kaki atau kaki yang sangat kecil, dan kebanyakan memiliki tubuh yang panjang dan ramping."));
        users.add(new User("ular", 2000, 100, R.drawable.ular, liststory1, listpost1));


        ArrayList<Integer> liststory2 = new ArrayList<Integer>() ;
        liststory2.add(R.drawable.sapi);
        ArrayList<Post> listpost2 = new ArrayList<Post>() ;
        listpost2.add(new Post(R.drawable.sapi, "Sapi adalah mamalia berkuku genap yang umumnya dipelihara untuk daging, susu, " +
                "dan tenaga kerja. Mereka termasuk dalam genus Bos, dan memiliki berbagai jenis dan ras."));
        users.add(new User("sapi", 2000, 100, R.drawable.sapi, liststory2, listpost2));



        ArrayList<Integer> liststory3 = new ArrayList<Integer>() ;
        liststory3.add(R.drawable.ikan);
        ArrayList<Post> listpost3 = new ArrayList<Post>() ;
        listpost3.add(new Post(R.drawable.ikan, " Ikan adalah vertebrata air yang bernapas menggunakan insang. Mereka mencakup " +
                "berbagai spesies yang hidup di air tawar dan laut, dan memiliki beragam bentuk dan ukuran tubuh."));
        users.add(new User("ikan", 2000, 100, R.drawable.ikan, liststory3,listpost3));



        ArrayList<Integer> liststory4 = new ArrayList<Integer>() ;
        liststory4.add(R.drawable.ikan);
        ArrayList<Post> listpost4 = new ArrayList<Post>() ;
        listpost4.add(new Post(R.drawable.kerbau, "Kerbau adalah mamalia berkuku genap yang umumnya ditemukan di Asia Selatan dan " +
                "Tenggara. Mereka sering digunakan untuk membajak sawah dan sebagai sumber daging dan susu."));
        users.add(new User("kerbau", 2000, 100, R.drawable.kerbau, liststory4,listpost4));



        ArrayList<Integer> liststory5 = new ArrayList<>() ;
        liststory5.add(R.drawable.beruang);
        ArrayList<Post> listpost5 = new ArrayList<>() ;
        listpost5.add(new Post(R.drawable.beruang, "Beruang adalah mamalia omnivora yang termasuk dalam famili Ursidae. Mereka " +
                "tersebar di berbagai belahan dunia dan memiliki berbagai spesies, termasuk beruang kutub, beruang cokelat, dan beruang hitam."));
        users.add(new User("beruang", 2000, 100,R.drawable.beruang, liststory5, listpost5));


        ArrayList<Integer> liststory6 = new ArrayList<>() ;
        liststory6.add(R.drawable.badak);
        ArrayList<Post> listpost6 = new ArrayList<>() ;
        listpost6.add(new Post(R.drawable.badak, " Badak adalah mamalia besar yang memiliki kulit tebal dan tanduk di hidungnya. " +
                "Mereka termasuk dalam ordo Perissodactyla dan tersebar di Asia dan Afrika."));
        users.add(new User("badak", 2000, 100, R.drawable.badak, liststory6, listpost6));


        ArrayList<Integer> liststory7 = new ArrayList<>() ;
        liststory7.add(R.drawable.panda);
        ArrayList<Post> listpost7 = new ArrayList<>() ;
        listpost7.add(new Post(R.drawable.panda, " Panda adalah mamalia yang umumnya ditemukan di China. Ada dua jenis panda: panda " +
                "raksasa dan panda kecil. Panda raksasa dikenal dengan warna bulunya yang hitam dan putih, sementara panda kecil memiliki warna bulu yang berbeda."));
        users.add(new User("panda", 2000, 100, R.drawable.panda, liststory7, listpost7));



        ArrayList<Integer> liststory8 = new ArrayList<>() ;
        liststory8.add(R.drawable.kuda_nill);
        ArrayList<Post> listpost8 = new ArrayList<>() ;
        listpost8.add(new Post(R.drawable.kuda_nill, " Kuda Nil adalah mamalia besar yang hidup di daerah-daerah berair di Afrika. " +
                "Mereka memiliki tubuh yang besar, mulut lebar, dan hidung panjang yang berguna untuk bernafas di bawah air."));
        users.add(new User("kuda nil", 2000, 100, R.drawable.kuda_nill, liststory8, listpost8));



        ArrayList<Integer> liststory9 = new ArrayList<>() ;
        liststory9.add(R.drawable.harimau);
        ArrayList<Post> listpost9 = new ArrayList<>() ;
        listpost9.add(new Post(R.drawable.harimau, "Harimau adalah karnivora besar dari genus Panthera yang ditemukan di Asia. " +
                "Mereka dikenal dengan corak belang pada bulunya dan merupakan predator puncak di lingkungan mereka."));
        users.add(new User("harimau", 2000, 100, R.drawable.harimau, liststory9, listpost9));

        return users;
    }
// dan seterusnya

}
