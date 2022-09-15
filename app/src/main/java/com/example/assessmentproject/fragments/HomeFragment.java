package com.example.assessmentproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.assessmentproject.R;


public class HomeFragment extends Fragment {
  WebView webViewhome;
  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view= inflater.inflate(R.layout.fragment_home, container, false);
         webViewhome=view.findViewById(R.id.web_home);
         webViewhome.loadUrl(" https://www.webtonative.com/");
         return view;
    }
}