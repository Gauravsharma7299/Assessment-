package com.example.assessmentproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.assessmentproject.R;


public class FAQFragment extends Fragment {

  WebView webViewFAQ;

  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_f_a_q, container, false);
        webViewFAQ=view.findViewById(R.id.web_faq);
        webViewFAQ.loadUrl("https://www.webtonative.com/faq");
        return view;
    }
}