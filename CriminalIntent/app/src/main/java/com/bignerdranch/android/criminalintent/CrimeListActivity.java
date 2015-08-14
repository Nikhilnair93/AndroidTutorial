package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

import java.util.UUID;

/**
 * Created by nikhilnair on 8/13/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();


    }
}
