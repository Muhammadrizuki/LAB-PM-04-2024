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

public class PostActivity extends AppCompatActivity {

    public static final String EXTRA_USER = "USER";
    public static final String EXTRA_PHOTO = "POST";
    public static final String EXTRA_CAPTION = "caption";

    ImageView ivPost, ivProfile;
    TextView tvName, tvCaption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post);

        // Inisialisasi ImageView dan TextView
        ivPost = findViewById(R.id.iv_post);
        ivProfile = findViewById(R.id.iv_profile);
        tvName = findViewById(R.id.tv_Name);
        tvCaption = findViewById(R.id.tv_caption);

        int i = getIntent().getIntExtra(EXTRA_PHOTO,0);
        String caption = getIntent().getStringExtra(EXTRA_CAPTION);
        User user= getIntent().getParcelableExtra(EXTRA_USER);

        // Pastikan semua ImageView dan TextView telah diinisialisasi sebelum digunakan
        ivProfile.setImageResource(user.getPhotoprofile());
        ivPost.setImageResource(i);
        tvName.setText(user.getName());
        tvCaption.setText(caption);

        // Tidak perlu ini, sudah dilakukan di atas
        // ivProfile.findViewById(R.id.iv_profile);
        // tvName.findViewById(R.id.tv_Name);
        // tvCaption.findViewById(R.id.tv_caption);

        tvName.setOnClickListener(v-> {
            Intent intent = new Intent(PostActivity.this, ProfileActivity.class);
            intent.putExtra(StoryActivity.EXTRA_USER, (Parcelable) user);
            startActivity(intent);
        });
    }
}
