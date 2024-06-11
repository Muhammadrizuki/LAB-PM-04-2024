package com.example.prak2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private EditText texttitle, textcontent;
    private ImageView imageView;
    Uri image;
    private Button buttonsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        texttitle = findViewById(R.id.title);
        textcontent = findViewById(R.id.bio);
        buttonsave = findViewById(R.id.edbutton);

        buttonsave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v) {

                String namee = getIntent().getStringExtra("name");
                String usernamee = getIntent().getStringExtra("username");
                String image = getIntent().getStringExtra("image");
                String title = texttitle.getText().toString();
                String bio = textcontent.getText().toString();

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("title",title);
                intent.putExtra("bio",bio);
                intent.putExtra("name",namee);
                intent.putExtra("username",usernamee);
                intent.putExtra("image",image);

                startActivity(intent);
            }
        });
    }
}