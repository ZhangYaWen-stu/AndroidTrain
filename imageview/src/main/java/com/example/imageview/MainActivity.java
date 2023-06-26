package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView c;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = (ImageView) findViewById(R.id.image);
        findViewById(R.id.b_Center).setOnClickListener(new MyOnClickLinstener());
        findViewById(R.id.b_fitXY).setOnClickListener(new MyOnClickLinstener());
        findViewById(R.id.b_CenterCrop).setOnClickListener(new MyOnClickLinstener());
        findViewById(R.id.b_CenterInside).setOnClickListener(new MyOnClickLinstener());
        findViewById(R.id.b_fitCenter).setOnClickListener(new MyOnClickLinstener());
        findViewById(R.id.b_fitEnd).setOnClickListener(new MyOnClickLinstener());
        findViewById(R.id.b_fitStart).setOnClickListener(new MyOnClickLinstener());
    }

    public class MyOnClickLinstener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.b_fitXY)
                c.setScaleType(ImageView.ScaleType.FIT_XY);
            else if(v.getId()==R.id.b_Center)
                c.setScaleType(ImageView.ScaleType.CENTER);
            else if(v.getId()==R.id.b_CenterCrop)
                c.setScaleType(ImageView.ScaleType.CENTER_CROP);
            else if(v.getId()==R.id.b_fitCenter)
                c.setScaleType(ImageView.ScaleType.FIT_CENTER);
            else if(v.getId()==R.id.b_CenterInside)
                c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            else if(v.getId()==R.id.b_fitEnd)
                c.setScaleType(ImageView.ScaleType.FIT_END);
            else if(v.getId()==R.id.b_fitStart)
                c.setScaleType(ImageView.ScaleType.FIT_START);
        }
    }
}