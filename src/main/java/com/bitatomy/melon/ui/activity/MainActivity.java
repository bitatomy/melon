package com.bitatomy.melon.ui.activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.bitatomy.melon.R;
import com.bitatomy.melon.ui.fragment.ArticleFragment;
import com.bitatomy.melon.ui.fragment.NewsArticlesFragment;

/**
 * @author jsingh on 11/17/2013 at 1:04 AM
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        // Check that the activity is using the layout version with the fragment_container FrameLayout
        if(findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state, then we don't need to do anything and
            // should return or else we could end up with overlapping fragments.
            if(savedInstanceState != null) {
                return;
            }

            // Create a new fragment to be placed in the activity layout
            NewsArticlesFragment newsArticlesFragment = new NewsArticlesFragment();

            // In case this activity was started with special instructions from an Intent, pass the Intent's
            // extras to the fragment as arguments
            newsArticlesFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getFragmentManager().beginTransaction().add(R.id.fragment_container, newsArticlesFragment).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_search:
                Toast.makeText(getApplicationContext(), "Switching to Article Fragment", Toast.LENGTH_SHORT).show();
                openArticleFragment();
                return true;
            case R.id.action_compose:
                Toast.makeText(getApplicationContext(), "Switching to News Article Fragment", Toast.LENGTH_SHORT).show();
                openNewsArticleFragment();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openArticleFragment() {
        ArticleFragment articleFragment = new ArticleFragment();
        Bundle args = new Bundle();
        articleFragment.setArguments(args);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, articleFragment);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }

    public void openNewsArticleFragment() {
        NewsArticlesFragment newsArticlesFragment = new NewsArticlesFragment();
        Bundle args = new Bundle();
        newsArticlesFragment.setArguments(args);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, newsArticlesFragment);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }
}
