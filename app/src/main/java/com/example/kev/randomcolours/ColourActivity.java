package com.example.kev.randomcolours;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ColourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colour_layout);
    }

    public void buttonClicked(View v)
    {
        int red = (int) (256 * Math.random());
        int blue = (int) (256 * Math.random());
        int green = (int) (256 * Math.random());

        int c = Color.rgb(red,blue,green);

        findViewById(R.id.button).setBackgroundColor(c);
    }
}
