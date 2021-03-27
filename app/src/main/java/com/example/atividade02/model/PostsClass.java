package com.example.atividade02.model;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.RequiresApi;

public class PostsClass implements Parcelable {
    private int userId;
    private int id;
    private String title;
    private String body;


    public PostsClass(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    @RequiresApi(api = Build.VERSION_CODES.Q)
    private PostsClass(Parcel parcel) {
        this.userId = parcel.readInt();
        this.id = parcel.readInt();
        this.title = parcel.readString();
        this.body = parcel.readString();
    }

    public static final Creator<PostsClass> CREATOR = new Creator<PostsClass>() {
        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public PostsClass createFromParcel(Parcel in) {
            return new PostsClass(in);
        }

        @Override
        public PostsClass[] newArray(int size) {
            return new PostsClass[size];
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
        parcel.writeString(this.body);

    }
}
