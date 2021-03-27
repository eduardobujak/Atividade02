package com.example.atividade02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import com.example.atividade02.model.CommentsClass;
import com.example.atividade02.model.PostsClass;

public class DetalheComments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_comments);
        Intent intent = getIntent();
        Parcelable prc = intent.getParcelableExtra("objComments");
        //if (prc instanceof PostsClass) {

        // }
        CommentsClass comments = intent.getParcelableExtra("objComments");
        bind(comments);
    }

    private void bind(CommentsClass obj) {
        TextView tv = findViewById(R.id.tvPostId);
        tv.setText(obj.getPostId()+"");
        tv = findViewById(R.id.tvId);
        tv.setText(obj.getId()+"");
        tv = findViewById(R.id.tvName);
        tv.setText(obj.getName());
        tv = findViewById(R.id.tvEmail);
        tv.setText(obj.getEmail());
        tv = findViewById(R.id.tvBody);
        tv.setText(obj.getBody());

    }
}