package com.codingcamelsacademy.horoscopes;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.codingcamelsacademy.horoscopes.fragments.HoroscopeListFragment;
import com.codingcamelsacademy.horoscopes.fragments.HoroscopeViewFragment;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Fragment fragment = new HoroscopeListFragment();
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragmentLayoutContainer, fragment, HoroscopeListFragment.TAG)
                    .commit();
    }


    // TODO: Have MainActivity manage fragment switching
    public void showHoroscopeViewFragment(Horoscope horoscope) {
        HoroscopeViewFragment horoscopeViewFragment = HoroscopeViewFragment.newInstance(horoscope);
        getFragmentManager().beginTransaction()
                .replace(R.id.fragmentLayoutContainer, horoscopeViewFragment, HoroscopeViewFragment.TAG)
                .addToBackStack(HoroscopeViewFragment.TAG)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
