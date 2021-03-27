package com.example.atividade02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import com.example.atividade02.model.CommentsClass;
import com.example.atividade02.model.PhotosClass;
import com.example.atividade02.model.PostsClass;

public class DetalhePhotos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_photos);
        Intent intent = getIntent();
        Parcelable prc = intent.getParcelableExtra("objPhotos");
        //if (prc instanceof PostsClass) {

        // }
        PhotosClass photos = intent.getParcelableExtra("objPhotos");
        bind(photos);
    }

    private void bind(PhotosClass obj) {
        TextView tv = findViewById(R.id.tvAlbumId);
        tv.setText(obj.getAlbumId()+"");
        tv = findViewById(R.id.tvId);
        tv.setText(obj.getId()+"");
        tv = findViewById(R.id.tvTitle);
        tv.setText(obj.getTitle());
        tv = findViewById(R.id.tvUrl);
        tv.setText(obj.getUrl());
        tv = findViewById(R.id.tvThumbnailUrl);
        tv.setText(obj.getThumbnailUrl());

    }
}