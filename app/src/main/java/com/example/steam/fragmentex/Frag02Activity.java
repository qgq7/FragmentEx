package com.example.steam.fragmentex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by steam on 2017. 6. 30..
 */

public class Frag02Activity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag02, container, false);

       // TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
       // tv.setText(getArguments().getString("msg"));

        return v;
    }

    public static Frag02Activity newInstance(String text) {

        Frag02Activity f = new Frag02Activity();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}
