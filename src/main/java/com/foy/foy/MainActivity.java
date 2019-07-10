package com.foy.foy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView cyperpunk =findViewById(R.id.cyperpunk);
        cyperpunk.setText("赛博朋克天下第一！！！");
        cyperpunk.setTextColor(Color.RED);
        cyperpunk.setTextSize(30);
    }
}
