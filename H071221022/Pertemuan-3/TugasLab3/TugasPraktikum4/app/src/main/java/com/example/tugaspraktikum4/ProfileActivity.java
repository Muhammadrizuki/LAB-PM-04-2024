package com.example.tugaspraktikum4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    public static final String EXTRA_USER = "USER";
    ImageView iv_profile ;
    LinearLayout linearLayout;
    TextView iv_nama, iv_following, iv_follower;
    ArrayList<Post> listpost;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        User user = getIntent().getParcelableExtra(EXTRA_USER);

        iv_profile = findViewById(R.id.iv_profile);
        iv_nama = findViewById(R.id.tv_nama);
        iv_follower = findViewById(R.id.tv_follow);
        iv_following = findViewById(R.id.tv_following);
        linearLayout = findViewById(R.id.postlist);

        iv_profile.setImageResource(user.getPhotoprofile());
        iv_nama.setText(user.getName());
        iv_following.setText(Integer.toString(user.getFollowing()));
        iv_follower.setText(Integer.toString(user.getFollowers()));


        ArrayList<User> users = DataSource.userss;
        for(User u : users){
            if(u.getName().equals(user.getName())){
                listpost = u.getListpost();
                break;
            }else {
                continue;
            }
        }


        for (Post post : listpost){
            ImageView imageView = new ImageView(this);
            int i = post.getPhoto();
            String caption = post.getCaptio();
            imageView.setImageResource(i);
            imageView.setMinimumWidth(100);
            imageView.setMinimumHeight(100);
            imageView.setMaxWidth(100);
            imageView.setMaxHeight(100);
            linearLayout.addView(imageView);
            imageView.setOnClickListener(v->{
                Intent intent = new Intent(ProfileActivity.this, PostActivity.class);
                intent.putExtra(PostActivity.EXTRA_PHOTO, i);
                intent.putExtra(PostActivity.EXTRA_CAPTION, caption);
                intent.putExtra(PostActivity.EXTRA_USER, user);
                startActivity(intent);
            });
        }

    }
}