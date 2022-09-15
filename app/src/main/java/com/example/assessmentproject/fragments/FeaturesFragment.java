package com.example.assessmentproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.assessmentproject.R;


public class FeaturesFragment extends Fragment {

    WebView webViewFeatures;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_features, container, false);
        webViewFeatures=view.findViewById(R.id.web_features);
        webViewFeatures.loadUrl("https://www.webtonative.com/features");
        return view;
    }
}