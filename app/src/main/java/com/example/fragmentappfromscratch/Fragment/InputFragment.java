package com.example.fragmentappfromscratch.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentappfromscratch.R;

public class InputFragment extends Fragment {
    private FragmentInterface mListener;

    public static InputFragment getInstance() {
        return new InputFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentInterface) {
            mListener = (FragmentInterface) context;
        } else {
            throw new RuntimeException(context.toString() + "No interface implemented");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_input, container, false);
    }

    public interface FragmentInterface {
        void fragmentDataSender(String editText1, String editText2, String editText3);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
