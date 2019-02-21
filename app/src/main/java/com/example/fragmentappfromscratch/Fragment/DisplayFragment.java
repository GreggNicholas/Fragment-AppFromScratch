package com.example.fragmentappfromscratch.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentappfromscratch.R;


public class DisplayFragment extends Fragment {
    private static final String getDataFromEditText1 = "params1";
    private static final String getDataFromEditText2 = "params2";
    private static final String getDataFromEditText3 = "params3";
    private String showText1;
    private String showText2;
    private String showText3;
    private View rootView;

    public static DisplayFragment getInstance(String showText1, String showText2, String showText3) {
        DisplayFragment displayFragment = new DisplayFragment();
        Bundle args = new Bundle();
        args.putString(getDataFromEditText1, showText1);
        args.putString(getDataFromEditText2, showText2);
        args.putString(getDataFromEditText3, showText3);
        displayFragment.setArguments(args);
        return displayFragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            showText1 = getArguments().getString(getDataFromEditText1);
            showText2 = getArguments().getString(getDataFromEditText2);
            showText3 = getArguments().getString(getDataFromEditText3);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_display, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView1 = view.findViewById(R.id.textview1_displayFragment);
        TextView textView2 = view.findViewById(R.id.textview2_displayFragment);
        TextView textView3 = view.findViewById(R.id.textview3_displayFragment);

        textView1.setText(showText1);
        textView2.setText(showText2);
        textView3.setText(showText3);
    }

}
