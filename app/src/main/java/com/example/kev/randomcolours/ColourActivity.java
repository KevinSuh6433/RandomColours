package com.example.kev.randomcolours;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

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

        double redPercent = (red/255.0)*100;
        double bluePercent = (blue/255.0)*100;
        double greenPercent = (green/255.0)*100;

        String r = String.format(Locale.CANADA, "%.0f", redPercent);
        String b = String.format(Locale.CANADA, "%.0f", bluePercent);
        String g = String.format(Locale.CANADA, "%.0f", greenPercent);

        String phrase = "R=" + r + "%, G=" + g + "%, B=" + b + "%";
        ((TextView) findViewById(R.id.textView)).setText(phrase);
    }
}
