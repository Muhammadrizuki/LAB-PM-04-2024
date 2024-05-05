package com.example.tugaspraktikum4;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaspraktikum4.R;
import com.example.tugaspraktikum4.StoryActivity;
import com.example.tugaspraktikum4.User;

import java.util.ArrayList;

public class Useradapter extends RecyclerView.Adapter<Useradapter.ViewHolder> {
    private final ArrayList<User> users;
    private final Context context;

    public Useradapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public Useradapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.story_itime, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Useradapter.ViewHolder holder, int position) {
        User user = users.get(position);

        holder.ivImage.setImageResource(user.getPhotoprofile());
        holder.ivImage.setOnClickListener(v -> {
            Intent intent = new Intent(context, StoryActivity.class);
            intent.putExtra(StoryActivity.EXTRA_USER, user);
            context.startActivity(intent);
        });
        holder.main.setOnClickListener(v -> {
            Toast.makeText(context, user.getName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout main;
        ImageView ivImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.iv_image);
            main = itemView.findViewById(R.id.main);
        }
    }
}
