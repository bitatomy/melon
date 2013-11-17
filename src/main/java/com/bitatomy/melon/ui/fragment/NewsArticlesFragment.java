package com.bitatomy.melon.ui.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bitatomy.melon.R;

/**
 * @author jsingh on 11/17/2013 at 1:12 AM
 */
public class NewsArticlesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.news_articles_fragment, container, false);
    }

    public void loadNewFragment(View view) {
        ArticleFragment articleFragment = new ArticleFragment();
        Bundle args = new Bundle();
        articleFragment.setArguments(args);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, articleFragment);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }
}
