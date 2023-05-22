package com.titinsumarni202102246.uts_202102246;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private WebResmiFragment _WebResmiFragment = new WebResmiFragment();
    private Context _context;
    private WebInternalFragment _WebInternalFragment = new WebInternalFragment();
    private int _tabCount;

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount) {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return _WebResmiFragment;
            case 1:
                return  _WebInternalFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}
