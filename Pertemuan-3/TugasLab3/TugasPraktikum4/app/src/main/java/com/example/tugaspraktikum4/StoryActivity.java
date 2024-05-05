package com.example.tugaspraktikum4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class StoryActivity extends AppCompatActivity {
    public static final String EXTRA_USER = "USER";
    ImageView iv_profile ;
    ImageView ivcerita ;
    TextView iv_nama;
    ArrayList<Integer> listStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_story);

        User user = getIntent().getParcelableExtra(EXTRA_USER);

        iv_profile = findViewById(R.id.iv_profile);
        iv_nama = findViewById(R.id.ivnama);
        ivcerita = findViewById(R.id.iv_cerita);


        iv_profile.setImageResource(user.getPhotoprofile());
        iv_nama.setText(user.getName());
        ArrayList<User> users = DataSource.userss;
        for(User u : users){
            if(u.getName().equals(user.getName())){
                listStory = u.getListstory();
                break;
            }else {
                continue;
            }
        }
        ivcerita.setImageResource(listStory.get(0));
        iv_profile.setOnClickListener(v->{
            Intent intent = new Intent(StoryActivity.this, ProfileActivity.class);
            intent.putExtra(StoryActivity.EXTRA_USER,  user);
            startActivity(intent);
        });
        iv_nama.setOnClickListener(v->{
            Intent intent = new Intent(StoryActivity.this, ProfileActivity.class);
            intent.putExtra(StoryActivity.EXTRA_USER, user);
            startActivity(intent);
        });

    }
}