package com.example.praktikum2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_IMAGE = "nul";
    public static final String EXTRA_NAMA1 = "nama";
    public static final String EXTRA_USER1 = "usernama";
    /* access modifiers changed from: private */
    public EditText etcET;
    /* access modifiers changed from: private */
    public EditText etcET2;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        MainActivity2.super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.etcET = (EditText) findViewById(R.id.etcEditText);
        this.etcET2 = (EditText) findViewById(R.id.etcEdit2);
        Intent intent = getIntent();
        final String n = intent.getStringExtra("nama");
        final String u = intent.getStringExtra("usernama");
        final String imageUriString = intent.getStringExtra("nul");
        ((Button) findViewById(R.id.buttonOK)).setOnClickListener(new View.OnClickListener() {
            /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.example.tugaspraktikum2.MainActivity2] */
            /* JADX WARNING: type inference failed for: r3v1, types: [android.content.Context, com.example.tugaspraktikum2.MainActivity2] */
            public void onClick(View v) {
                String etc = MainActivity2.this.etcET.getText().toString();
                String etc2 = MainActivity2.this.etcET2.getText().toString();
                Intent intent = new Intent(MainActivity2.this, Tactivity.class);
                if (etc == null || etc2 == null) {
                    Toast.makeText(MainActivity2.this, "Data belum lengkap", 0).show();
                    return;
                }
                intent.putExtra(Tactivity.EXTRA_NAMA1, n);
                intent.putExtra(Tactivity.EXTRA_USER1, u);
                intent.putExtra("nama", etc);
                intent.putExtra("usernama", etc2);
                intent.putExtra("nul", imageUriString);
                MainActivity2.this.startActivity(intent);
            }
        });
    }
}
