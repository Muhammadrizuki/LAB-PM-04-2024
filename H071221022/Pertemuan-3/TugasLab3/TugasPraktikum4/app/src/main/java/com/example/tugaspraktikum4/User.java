package com.example.tugaspraktikum4;

import java.util.ArrayList;

import android.os.Parcel;
import  android.os.Parcelable;

import androidx.annotation.NonNull;

public class User implements Parcelable{
    String name ;
    int following ;
    int followers ;
    int photoprofile ;
    ArrayList<Post> listpost ;

    ArrayList<Integer> liststory;
    public User(String name, int following, int followers, int photoprofile, ArrayList<Integer> liststory, ArrayList<Post> listpost ) {
        this.name = name;
        this.following = following;
        this.followers = followers;
        this.photoprofile = photoprofile;
        this.liststory = liststory;
        this.listpost = listpost;

    }

    protected User(Parcel in) {
        name = in.readString();
        following = in.readInt();
        followers = in.readInt();
        photoprofile = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFollowing() {
        return this.following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFollowers() {
        return this.followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getPhotoprofile() {
        return photoprofile;
    }

    public void setPhotoprofile(int photoprofile) {
        this.photoprofile = photoprofile;
    }

    public ArrayList<Post> getListpost() {
        return this.listpost;
    }

    public void setListpost(ArrayList<Post> listpost) {
        this.listpost = listpost;
    }
    public void setListstory(ArrayList<Integer>  liststory) {
        this.liststory = liststory;
    }

    public ArrayList<Integer> getListstory() {
        return this.liststory;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(following);
        dest.writeInt(followers);
        dest.writeInt(photoprofile);
    }
}
