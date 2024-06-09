package com.example.prak2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private TextView texttitle, textcontent, edtextname, edtextusername;
    private ImageView imageView;
    Uri image;
    private Button buttonsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        edtextname = findViewById(R.id.textname);
        edtextusername = findViewById(R.id.username);
        texttitle = findViewById(R.id.titlee);
        textcontent = findViewById(R.id.bio);
        imageView = findViewById(R.id.edimage);

        String namee = getIntent().getStringExtra("name");
        String usernamee = getIntent().getStringExtra("username");
        String image = getIntent().getStringExtra("image");
        String title = getIntent().getStringExtra("title");
        String bio = getIntent().getStringExtra("bio");
        Uri imageUri = Uri.parse(image);

        textcontent.setText(title);
        texttitle.setText(bio);
        edtextname.setText(namee);
        edtextusername.setText(usernamee);
        imageView.setImageURI(imageUri);



    }
}