package com.bishal.blackicons;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Black Round Icons\n\n" +
                "Apply korte: Lawnchair ba Nova launcher er\n" +
                "Settings > Icon style / Theme > Black Round Icons\n\n" +
                "Je app er icon pack e nei, segulo o mask diye\n" +
                "ekoi black rounded style e auto hoye jabe.");
        tv.setTextSize(18);
        tv.setTextColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.rgb(13, 13, 13));
        setContentView(tv);
    }
}
