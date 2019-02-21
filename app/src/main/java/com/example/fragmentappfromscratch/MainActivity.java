package com.example.fragmentappfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragmentappfromscratch.Fragment.InputFragment;

public class MainActivity extends AppCompatActivity implements InputFragment.FragmentInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentLauncher();
    }

    public void fragmentLauncher(){
        InputFragment inputFragment = InputFragment.getInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, inputFragment)
                .commit();

    }

    @Override
    public void fragmentDataSender(String editText1, String editText2, String editText3) {

    }
}
