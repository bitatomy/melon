package com.bitatomy.melon.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author jsingh on 11/14/2013 at 12:01 AM
 */
public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(intent.getStringExtra(MainActivity.SECRET_MESSAGE));

        setContentView(textView);
    }
}
