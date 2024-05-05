package com.example.tugaspraktikum6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaspraktikum6.R;
import com.example.tugaspraktikum6.User;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.usercard, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user = userList.get(position);

//        holder.imageView.setImageResource(user.getImageResource());
        Picasso.get().load(user.getAvatar()).into(holder.imageView);
        holder.usernameTextView.setText(user.getEmail());
        holder.nameTextView.setText(user.getFirst_name());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView usernameTextView, nameTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.avatar);
            nameTextView = itemView.findViewById(R.id.nama);
            usernameTextView = itemView.findViewById(R.id.iv_username);
        }
    }
}
