package com.example.praktikum2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.praktikum2.R;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    public static Uri imageUri;
    private EditText etcET;
    private EditText etcET2;
    /* access modifiers changed from: private */
    public ActivityResultLauncher<Intent> launcherIntentGallery;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        MainActivity.super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView = (ImageView) findViewById(R.id.image);
        this.launcherIntentGallery = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == -1) {
                    MainActivity.imageUri = result.getData().getData();
                    if (MainActivity.imageUri != null) {
                        imageView.setImageURI(MainActivity.imageUri);
                        Snackbar.make(MainActivity.this.findViewById(16908290), "Gambar dipilih", -1).show();
                        return;
                    }
                    Snackbar.make(MainActivity.this.findViewById(16908290), "Tidak dapat memuat gambar", -1).show();
                    return;
                }
                Snackbar.make(MainActivity.this.findViewById(16908290), "Pemilihan gambar dibatalkan", -1).show();
            }
        });
        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("image/*");
                MainActivity.this.launcherIntentGallery.launch(Intent.createChooser(intent, "Pilih foto"));
            }
        });
        ((Button) findViewById(R.id.buttonOK)).setOnClickListener(new View.OnClickListener() {
            /* JADX WARNING: type inference failed for: r5v0, types: [com.example.tugaspraktikum2.MainActivity, android.content.Context] */
            /* JADX WARNING: type inference failed for: r5v1, types: [com.example.tugaspraktikum2.MainActivity, android.content.Context] */
            public void onClick(View v) {
                String etc = ((EditText) MainActivity.this.findViewById(R.id.etcEditText)).getText().toString();
                String etc2 = ((EditText) MainActivity.this.findViewById(R.id.etcEdit2)).getText().toString();
                Intent intent2 = new Intent(MainActivity.this, MainActivity2.class);
                if (etc == null || MainActivity.imageUri.toString().isEmpty() || etc2 == null) {
                    Toast.makeText(MainActivity.this, "Data belum lengkap", 0).show();
                    return;
                }
                intent2.putExtra("nama", etc);
                intent2.putExtra("usernama", etc2);
                intent2.putExtra("nul", MainActivity.imageUri.toString());
                MainActivity.this.startActivity(intent2);
            }
        });
    }
}
