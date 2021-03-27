package com.example.atividade02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import com.example.atividade02.model.AlbumsClass;


public class DetalheAlbums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_albums);
        Intent intent = getIntent();
        Parcelable prc = intent.getParcelableExtra("objAlbums");
        //if (prc instanceof PostsClass) {

        // }
        AlbumsClass albums = intent.getParcelableExtra("objAlbums");
        bind(albums);
    }

    private void bind(AlbumsClass obj) {
        TextView tv = findViewById(R.id.tvUserId);
        tv.setText(obj.getUserId()+"");
        tv = findViewById(R.id.tvId);
        tv.setText(obj.getId()+"");
        tv = findViewById(R.id.tvTitle);
        tv.setText(obj.getTitle());

    }
}