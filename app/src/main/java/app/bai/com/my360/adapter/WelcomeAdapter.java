package app.bai.com.my360.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import app.bai.com.my360.fragment.BaseFragment;

/**
 * Created by 86724 on 2016/7/1 0001.
 */
public class WelcomeAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> data;
    public WelcomeAdapter(FragmentManager fm,List<BaseFragment> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
