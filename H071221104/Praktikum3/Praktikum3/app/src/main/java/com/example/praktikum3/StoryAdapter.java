package com.example.praktikum3;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    private ArrayList<University> universities;

    public StoryAdapter(ArrayList<University> universities) {
        this.universities = universities;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        University university = universities.get(position);

        holder.ivStoryProfile.setImageResource(university.getImageprofile());
        holder.tv_name.setText(university.getNama());

    }

    @Override
    public int getItemCount() {
        return universities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivStoryProfile;
        TextView tv_name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivStoryProfile = itemView.findViewById(R.id.iv_storyprofile);
            tv_name = itemView.findViewById(R.id.tv_nama);

            ivStoryProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition(); // Mendapatkan posisi item yang diklik
                    if (position != RecyclerView.NO_POSITION) { // Memastikan posisi item valid
                        University clickedUniversity = DataSource.universities.get(position); // Mendapatkan objek University dari ArrayList berdasarkan posisi

                        // Membuat intent
                        Intent intent = new Intent(itemView.getContext(), MainActivity2.class);
                        // Mengirim data melalui intent
                        intent.putExtra("nama", clickedUniversity.getNama());
                        intent.putExtra("imageprofile", clickedUniversity.getImageprofile());
                        intent.putExtra("imagestory", clickedUniversity.getImagestory());
                        intent.putExtra("imagefeed", clickedUniversity.getImagefeed());
                        intent.putExtra("followers", clickedUniversity.getFollowers());
                        intent.putExtra("following", clickedUniversity.getFollowing());
                        intent.putExtra("caption", clickedUniversity.getCaption());
                        intent.putExtra("position", position);
                        // Memulai MainActivity2
                        itemView.getContext().startActivity(intent);
                    }
                }
            });
        }
    }
}