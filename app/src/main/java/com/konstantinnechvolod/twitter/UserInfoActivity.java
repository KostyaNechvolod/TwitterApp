package com.konstantinnechvolod.twitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;

public class UserInfoActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        imageView = findViewById(R.id.user_image_view);

        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);
    }
}
