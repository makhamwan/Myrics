package com.example.makhamwan.myrics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import com.example.makhamwan.myricsapp.R;

/**
 * Created by makhamwan on 5/17/2017 AD.
 */

public class TabList extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fav_tab, container, false);
    }
}
