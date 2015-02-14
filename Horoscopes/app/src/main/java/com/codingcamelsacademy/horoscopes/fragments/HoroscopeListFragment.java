package com.codingcamelsacademy.horoscopes.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codingcamelsacademy.horoscopes.R;

public class HoroscopeListFragment extends Fragment {

    public static final String TAG = HoroscopeListFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater li,ViewGroup vg, Bundle b) {
        View view = li.inflate(R.layout.fragment_horoscope_list, vg,false);
        // TODO: show list of all horoscopes, with a onClick on each one opening HoroscopeViewFragment

        return view;
    }

}