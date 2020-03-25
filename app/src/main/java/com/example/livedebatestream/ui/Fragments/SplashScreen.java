package com.example.livedebatestream.ui.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.livedebatestream.R;

public class SplashScreen extends Fragment {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.splashscreen,container,false);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                FragmentManager fm=getFragmentManager();
                Login hm=new Login();
                fm.beginTransaction().replace(R.id.container,hm).commit();
            }
        }, SPLASH_TIME_OUT);

        return view;
    }
}
