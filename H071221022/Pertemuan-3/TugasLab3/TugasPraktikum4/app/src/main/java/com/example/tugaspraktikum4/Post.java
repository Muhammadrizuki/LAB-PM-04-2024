package com.example.tugaspraktikum4;

import android.net.Uri;
import android.os.Parcel;
import  android.os.Parcelable;

import androidx.annotation.NonNull;

public class Post implements Parcelable{
    int photo ;
    String captio;

    public Post(int photo, String captio) {
        this.photo = photo;
        this.captio = captio;
    }

    protected Post(Parcel in) {
        photo = in.readInt();
        captio = in.readString();
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        @Override
        public Post createFromParcel(Parcel in) {
            return new Post(in);
        }

        @Override
        public Post[] newArray(int size) {
            return new Post[size];
        }
    };

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getCaptio() {
        return captio;
    }

    public void setCaptio(String captio) {
        this.captio = captio;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(photo);
        dest.writeString(captio);
    }
}
