package com.example.administrator.fragmenttabhost17_8_4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-8-4.
 */
public class BlankFragment extends Fragment {
    private String text;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Bundle bundle = getArguments();
//        text = bundle.getString("text");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setTextSize(90);
        textView.setTextColor(Color.BLACK);
//        textView.setText(text);

        return textView;
    }
}

