package com.example.lenovo.itaninew.Board;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lenovo.itaninew.Board.Board1;
import com.example.lenovo.itaninew.Board.Board2;
import com.example.lenovo.itaninew.Board.Board3;

/**
 * Created by wolfsoft on 10/11/2015.
 */
public class PagerAdapter_board extends FragmentStatePagerAdapter {



    Board1 tab1;
    Board2 tab2;
    Board3 tab3;
    public PagerAdapter_board(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                tab1 = new Board1();
                return tab1;

            case 1:
                tab2 = new Board2();
                return tab2;


            case 2:
                tab3 = new Board3();
                return tab3;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}