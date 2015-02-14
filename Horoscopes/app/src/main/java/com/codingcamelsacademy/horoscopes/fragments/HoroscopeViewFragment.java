package com.codingcamelsacademy.horoscopes.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codingcamelsacademy.horoscopes.Horoscope;
import com.codingcamelsacademy.horoscopes.R;

public class HoroscopeViewFragment extends Fragment {

    public static final String TAG = HoroscopeViewFragment.class.getSimpleName();

    public static HoroscopeViewFragment newInstance (Horoscope horoscope) {
        Bundle bundle = new Bundle();
        // TODO: handle moving horoscope object to bundle such that we're able to show its details onCreateView
        HoroscopeViewFragment horoscopeViewFragment = new HoroscopeViewFragment();
        horoscopeViewFragment.setArguments(bundle);
        return horoscopeViewFragment;
    }

    @Override
    public View onCreateView(LayoutInflater li,ViewGroup vg, Bundle b) {
        View view = li.inflate(R.layout.fragment_horoscope_view, vg,false);
        // TODO: show details of horoscope
        return view;
    }

}