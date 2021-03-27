package com.example.atividade02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PrimeiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        Button btnPosts = (Button) findViewById(R.id.btnPosts);
        Button btnComments = (Button) findViewById(R.id.btnComments);
        Button btnAlbums = (Button) findViewById(R.id.btnAlbums);
        Button btnPhotos = (Button) findViewById(R.id.btnPhotos);

        btnPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Posts.class);
                startActivity(intent1);
            }
        });

        btnComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Comments.class);
                startActivity(intent1);
            }
        });

        btnAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Albums.class);
                startActivity(intent1);
            }
        });

        btnPhotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Photos.class);
                startActivity(intent1);
            }
        });

    }
}