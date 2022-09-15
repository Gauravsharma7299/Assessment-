package com.example.assessmentproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.assessmentproject.R;


public class PricingFragment extends Fragment {
WebView webViewPricing;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_pricing, container, false);
       webViewPricing =view.findViewById(R.id.web_pricing);
       webViewPricing .loadUrl("https://www.webtonative.com/pricing");
        return view;
    }
}