package com.example.train1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

//    @Override
    private TextView tv_control;
    private TextView tv_bbs;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_bbs = (TextView)findViewById(R.id.tv_bbs);
        tv_control = (TextView)findViewById(R.id.tv_control);
        tv_control.setOnClickListener(this);
        tv_control.setOnLongClickListener(this);
//        tv_bbs.setOnClickListener(this);
//        tv_bbs.setOnLongClickListener(this);
        tv_bbs.setGravity(Gravity.BOTTOM|Gravity.LEFT);
//        tv_bbs.setLines(8);
        tv_bbs.setMaxLines(8);
        tv_bbs.setMovementMethod(new ScrollingMovementMethod());
    }

    private String[] mChatStr = {"1wdaw", "2awdaw", "1dawawdawa", "2wdawdawd", "1dwadawss"};
    public void onClick(View c)
    {
        if(c.getId()==R.id.tv_control||c.getId()==R.id.tv_bbs)
        {
            int infor = (int)(Math.random()*10) % 5;
            String newStr = String.format("%s\n%s %s",
                    tv_bbs.getText().toString(), DateUtil.getNowDateTime(), mChatStr[infor]);
            tv_bbs.setText(newStr);
        }
    }
    public boolean onLongClick(View c)
    {
        if(c.getId()==R.id.tv_control||c.getId()==R.id.tv_bbs)
        {
            tv_bbs.setText("");
        }
        return true;
    }

}