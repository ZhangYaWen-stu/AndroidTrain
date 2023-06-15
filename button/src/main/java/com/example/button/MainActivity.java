package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new Listener());
        button.setOnLongClickListener(new Listener());
    }
    class Listener implements View.OnClickListener, View.OnLongClickListener {
        @Override
        public void onClick(View v)
        {
            if(v.getId()==R.id.button)
            {
                Toast.makeText(MainActivity.this, "你弹了一下我...", Toast.LENGTH_SHORT).show();
                Toast toast = Toast.makeText(MainActivity.this, "你弹了一下我...", Toast.LENGTH_SHORT);
            }
        }

        @Override
        public boolean onLongClick(View v) {
            if(v.getId()==R.id.button)
            {
                Toast.makeText(MainActivity.this, "你按我干嘛...", Toast.LENGTH_SHORT).show();
            }
            return false;
        }
    }
}