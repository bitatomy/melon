package com.bitatomy.melon.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bitatomy.melon.R;

/**
 * @author jsingh on 11/17/2013 at 1:05 AM
 */
public class ArticleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.article_view_fragment, container, false);
    }
}
