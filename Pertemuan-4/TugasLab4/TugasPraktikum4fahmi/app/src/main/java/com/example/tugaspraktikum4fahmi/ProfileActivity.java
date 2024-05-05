package com.example.tugaspraktikum4fahmi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugaspraktikum4fahmi.MamaliaPurba;
import com.example.tugaspraktikum4fahmi.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvName = findViewById(R.id.tv_name);
        TextView tvUsername = findViewById(R.id.tv_username);

        Intent intent = getIntent();
        MamaliaPurba instagram = intent.getParcelableExtra("mamaliaPurba");

        ivProfile.setImageResource(instagram.getFotoProfile());
        tvName.setText(instagram.getName());
        tvUsername.setText(instagram.getUsername());

    }
}
