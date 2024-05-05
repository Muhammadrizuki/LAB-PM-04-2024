package com.example.tugaspraktikum4;

import android.os.Parcel;
import  android.os.Parcelable;

import androidx.annotation.NonNull;

public class MyParselable implements Parcelable{
    protected MyParselable(Parcel in) {
    }

    public static final Creator<MyParselable> CREATOR = new Creator<MyParselable>() {
        @Override
        public MyParselable createFromParcel(Parcel in) {
            return new MyParselable(in);
        }

        @Override
        public MyParselable[] newArray(int size) {
            return new MyParselable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
    }
}
