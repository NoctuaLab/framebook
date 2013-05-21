package com.noctualab.framebook.slides;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noctualab.framebook.R;

public class SlidePageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        
    	ViewGroup rootView = (ViewGroup) inflater.inflate( R.layout.fragment_slide_page, container, false);
        return rootView;
    }
}