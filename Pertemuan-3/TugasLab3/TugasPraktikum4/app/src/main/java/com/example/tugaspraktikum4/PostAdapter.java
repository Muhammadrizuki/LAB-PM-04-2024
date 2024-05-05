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


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private final ArrayList<User> users;
    Context context;

    public PostAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }


    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_itime, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        User user = users.get(position);
        Random random = new Random();

        // Menghasilkan angka acak antara 0 dan panjang daftar posting - 1
        int angkaAcak = 0;

        holder.ivImage.setImageResource(user.getListpost().get(angkaAcak).getPhoto());
        holder.ivProfile.setImageResource(user.getPhotoprofile());
        holder.tvName.setText(user.getName());
        holder.tvName.setOnClickListener(v->{
            Intent intent = new Intent(context, ProfileActivity.class);
            intent.putExtra(StoryActivity.EXTRA_USER, user);

            context.startActivity(intent);
        });;
        holder.tvCaption.setText(user.getListpost().get(angkaAcak).getCaptio());

        holder.main.setOnClickListener(v -> {
            Toast.makeText(holder.itemView.getContext(), user.getName(), Toast.LENGTH_SHORT).show();
        });
    }


    @Override
    public int getItemCount() {
        return users.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout main;
        TextView tvName, tvCaption;
        ImageView ivImage, ivProfile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_Name);
            tvCaption = itemView.findViewById(R.id.tv_caption);
            ivImage = itemView.findViewById(R.id.iv_image);
            ivProfile = itemView.findViewById(R.id.iv_profile);
            main = itemView.findViewById(R.id.main);

        }
    }
}
