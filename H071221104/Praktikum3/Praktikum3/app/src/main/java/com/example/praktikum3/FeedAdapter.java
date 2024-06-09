package com.example.praktikum3;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {

    private ArrayList<University> universities;

    public FeedAdapter(ArrayList<University> universities){this.universities = universities;}

    @NonNull
    @Override
    public FeedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed, parent, false);
        return new FeedAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedAdapter.ViewHolder holder, int position) {

        University university = universities.get(position);

        holder.tv_namaProfile.setText(university.getNama());
        holder.ivProfile.setImageResource(university.getImageprofile());
        holder.ivFeed.setImageResource(university.getImagefeed());
        holder.tv_caption.setText(university.getCaption());
    }

    @Override
    public int getItemCount() {
        return universities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFeed, ivProfile;
        TextView tv_caption, tv_namaProfile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFeed = itemView.findViewById(R.id.iv_feed);
            ivProfile = itemView.findViewById(R.id.iv_profile);
            tv_namaProfile = itemView.findViewById(R.id.tv_namaprofile);
            tv_caption = itemView.findViewById(R.id.tv_caption);

            ivProfile.setOnClickListener(new View.OnClickListener() {
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

            tv_namaProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition(); // Mendapatkan posisi item yang diklik
                    if (position != RecyclerView.NO_POSITION) { // Memastikan posisi item valid
                        University clickedUniversity = DataSource.universities.get(position); // Mendapatkan objek University dari ArrayList berdasarkan posisi

                        // Membuat intent
                        Intent intent = new Intent(itemView.getContext(), MainActivity3.class);
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
