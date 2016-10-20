package br.com.rm30654.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import br.com.rm30654.fragments.CarrosFragment;

public class TabsAdapter extends FragmentStatePagerAdapter {
    public static final int TOTAL_TABS = 2;

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Bundle args = new Bundle();
        if (position == 0) {
            args.putString("tipo", "classicos");
        } else if (position == 1) {
            args.putString("tipo", "esportivos");
        }
        Fragment f = new CarrosFragment();
        f.setArguments(args);
        return f;
    }

    //Retorna o total de tabs que temos criada
    @Override
    public int getCount() {
        return TOTAL_TABS;
    }
}