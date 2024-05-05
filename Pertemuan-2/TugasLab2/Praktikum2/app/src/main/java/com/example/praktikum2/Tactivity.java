package com.example.praktikum2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Tactivity extends AppCompatActivity {
    public static final String EXTRA_IMAGE = "nul";
    public static final String EXTRA_NAMA = "nama";
    public static final String EXTRA_NAMA1 = "n";
    public static final String EXTRA_USER = "usernama";
    public static final String EXTRA_USER1 = "u";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        Tactivity.super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView nama1 = (TextView) findViewById(R.id.nama1);
        TextView usernama1 = (TextView) findViewById(R.id.usernama1);
        TextView namaView = (TextView) findViewById(R.id.nama2);
        TextView usernamaView = (TextView) findViewById(R.id.usernama2);
        ImageView imageView = (ImageView) findViewById(R.id.image3);
        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String username = intent.getStringExtra("usernama");
        String namacoment = intent.getStringExtra(EXTRA_NAMA1);
        String usernamecoment = intent.getStringExtra(EXTRA_USER1);
        String imageUriString = intent.getStringExtra("nul");
        if (imageUriString != null && !imageUriString.isEmpty()) {
            imageView.setImageURI(Uri.parse(imageUriString));
        }
        nama1.setText(nama);
        usernama1.setText(username);
        namaView.setText(namacoment);
        usernamaView.setText(usernamecoment);
    }
}
