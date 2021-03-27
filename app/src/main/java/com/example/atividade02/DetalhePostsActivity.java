package com.example.atividade02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import com.example.atividade02.model.PostsClass;

public class DetalhePostsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_posts);
        Intent intent = getIntent();
        Parcelable prc = intent.getParcelableExtra("objPosts");
        //if (prc instanceof PostsClass) {

       // }
        PostsClass posts = intent.getParcelableExtra("objPosts");
        bind(posts);
    }

    private void bind(PostsClass obj) {
        TextView tv = findViewById(R.id.tvId);
        tv.setText(obj.getId()+"");
        tv = findViewById(R.id.tvIdUser);
        tv.setText(obj.getUserId()+"");
        tv = findViewById(R.id.tvTitle);
        tv.setText(obj.getTitle());
        tv = findViewById(R.id.tvBody);
        tv.setText(obj.getBody());

    }
}