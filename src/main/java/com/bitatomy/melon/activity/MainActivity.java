package com.bitatomy.melon.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.bitatomy.melon.R;

/**
 * @author jsingh on 11/13/2013 at 11:41 PM
 */
public class MainActivity extends Activity {

    public static final String SECRET_MESSAGE = "com.bitatomy.melon.activity.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
    }

    public void sendMsg(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextField);
        intent.putExtra(SECRET_MESSAGE, editText.getText().toString());
        startActivity(intent);
    }
}
