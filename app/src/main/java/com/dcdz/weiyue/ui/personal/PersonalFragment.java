package com.dcdz.weiyue.ui.personal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dcdz.weiyue.R;
import com.dcdz.weiyue.component.ApplicationComponent;
import com.dcdz.weiyue.ui.base.BaseFragment;

/**
 * “我的”页面
 */
public class PersonalFragment extends BaseFragment {


    public static PersonalFragment newInstance() {
        
        Bundle args = new Bundle();
        
        PersonalFragment fragment = new PersonalFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_personal, container, false);
    }

    @Override
    public int getContentLayout() {
        return 0;
    }

    @Override
    public void initInjector(ApplicationComponent appComponent) {

    }

    @Override
    public void bindView(View view, Bundle savedInstanceState) {

    }

    @Override
    public void initData() {

    }
}
