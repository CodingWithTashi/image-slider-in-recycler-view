package com.tectibet.tutorilaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ImageActicity extends AppCompatActivity {
    private ImageView mImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_acticity);
        String url=getIntent().getStringExtra("url");
        mImg=findViewById(R.id.image_id);
        if(mImg!=null){
            Glide.with(ImageActicity.this).load(url).into(mImg);

        }
    }
}
