package com.example.test.ui.collection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.test.R;

public class BlankFragmentWishList extends Fragment {

public BlankFragmentWishList() {
    // Required empty public constructor
}
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {// Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_blank_watched, container, false);
}
}
