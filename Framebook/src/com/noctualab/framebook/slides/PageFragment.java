package com.noctualab.framebook.slides;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.noctualab.framebook.R;


// Instances of this class are fragments representing a single
// object in our collection.
public class PageFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        
    	// The last two arguments ensure LayoutParams are inflated properly.
        View rootView = inflater.inflate(R.layout.fragment_slide_page, container, false);

        Bundle args = getArguments();
        String msg = Integer.toString(args.getInt(ARG_OBJECT));
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(msg);
        return rootView;
    }
}