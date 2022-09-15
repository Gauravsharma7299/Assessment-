package com.example.assessmentproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.assessmentproject.fragments.FAQFragment;
import com.example.assessmentproject.fragments.FeaturesFragment;
import com.example.assessmentproject.fragments.HomeFragment;
import com.example.assessmentproject.fragments.PricingFragment;
import com.example.assessmentproject.fragments.ShowcaseFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottom_Navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.home_item){
                    loadFragment(new HomeFragment() ,true);

                }else if (id==R.id.Showcase_item){
                    loadFragment(new ShowcaseFragment() ,false);

                }else if (id==R.id.Features_item) {

                    loadFragment(new FeaturesFragment(),false);
                }else if (id==R.id.FAQ_item) {
                    loadFragment(new FAQFragment(),false);

                }else {
                    loadFragment(new PricingFragment(),false );

                }

                return true;
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.home_item);
    }
    public void loadFragment(Fragment fragment , boolean flag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if (flag)
            ft.add(R.id.frame_layout,fragment);
        else ft.replace(R.id.frame_layout,fragment);
        ft.commit();
    }
}