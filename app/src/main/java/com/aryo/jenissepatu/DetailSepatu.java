package com.aryo.jenissepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailSepatu extends AppCompatActivity {
    public static final String EXTRA_FULLNAME = "extra_fullname";
    public static final String EXTRA_NICKNAME= "extra_nickname";
    public static final String EXTRA_DETAIL= "extra_detail";
    public static final String EXTRA_IMG= "extra_img";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView imgSepatu;
        TextView tvFullName, tvNickName, tvDetail;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imgSepatu = findViewById(R.id.tv_sepatu_photo);
        tvFullName = findViewById(R.id.tv_full_name);
        tvNickName = findViewById(R.id.tv_nick_name);
        tvDetail = findViewById(R.id.tv_detail);

        String full = getIntent().getStringExtra(EXTRA_FULLNAME),
                nick = getIntent().getStringExtra(EXTRA_NICKNAME),
                detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int photo = getIntent().getIntExtra(EXTRA_IMG,0);

        Bitmap bmp = BitmapFactory.decodeResource(getResources(), photo);
        imgSepatu.setImageBitmap(bmp);
        tvFullName.setText(full);
        tvNickName.setText(nick);
        tvDetail.setText(detail);
    }
}
