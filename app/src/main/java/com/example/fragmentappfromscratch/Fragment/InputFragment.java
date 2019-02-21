package com.example.fragmentappfromscratch.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fragmentappfromscratch.R;

public class InputFragment extends Fragment {
    private View rootView;
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
        rootView = inflater.inflate(R.layout.fragment_input, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final EditText editText1 = rootView.findViewById(R.id.edittext1_inputFrag);
        final EditText editText2 = rootView.findViewById(R.id.edittext2_inputFrag);
        EditText editText3 = rootView.findViewById(R.id.edittext3_inputFrag);
        Button button = rootView.findViewById(R.id.button_inputFragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }

    public interface FragmentInterface {
        void fragmentDataSender(String editText1, String editText2, String editText3);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}
