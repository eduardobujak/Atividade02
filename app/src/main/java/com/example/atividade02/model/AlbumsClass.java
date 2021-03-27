package com.example.atividade02.model;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.RequiresApi;

public class AlbumsClass implements Parcelable {
    private int userId;
    private int id;
    private String title;


    public AlbumsClass(int userId, int id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    private AlbumsClass(Parcel parcel) {
        this.userId = parcel.readInt();
        this.id = parcel.readInt();
        this.title = parcel.readString();
    }

    public static final Creator<AlbumsClass> CREATOR = new Creator<AlbumsClass>() {
        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public AlbumsClass createFromParcel(Parcel in) {
            return new AlbumsClass(in);
        }

        @Override
        public AlbumsClass[] newArray(int size) {
            return new AlbumsClass[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.userId);
        parcel.writeInt(this.id);
        parcel.writeString(this.title);

    }
}
