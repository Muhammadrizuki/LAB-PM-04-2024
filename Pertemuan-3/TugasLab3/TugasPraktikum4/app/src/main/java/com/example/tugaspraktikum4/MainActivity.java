package com.example.tugaspraktikum4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_students;
    private RecyclerView rv_post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_students = findViewById(R.id.rv_user);
//        rv_students.setLayoutManager(new GridLayoutManager(this, 2));
        rv_students.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_students.setHasFixedSize(true);

        Useradapter useradapter = new Useradapter(MainActivity.this, DataSource.userss);
        rv_students.setAdapter(useradapter);

        rv_post = findViewById(R.id.rv_post);
        rv_post.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv_post.setHasFixedSize(true);

        PostAdapter postAdapter = new PostAdapter(MainActivity.this, DataSource.userss);
        
        rv_post.setAdapter(postAdapter);

    }
}