package com.example.mylearningappviewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    MyViewPagerAdapter myViewPagerAdapter;
    ViewPager2 viewPager2;

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPagerAdapter= new MyViewPagerAdapter(getSupportFragmentManager(), getLifecycle());
        myViewPagerAdapter.addFragment(new Fragment1());
        myViewPagerAdapter.addFragment(new Fragment2());
        myViewPagerAdapter.addFragment(new Fragment3());
        myViewPagerAdapter.addFragment(new Fragment4());
        myViewPagerAdapter.addFragment(new Fragment5());

        viewPager2=findViewById(R.id.viewPager);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        viewPager2.setAdapter(myViewPagerAdapter);

        tabLayout=findViewById(R.id.tabLayout);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout,
                viewPager2,
                /* */
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText("Tab-Fragment "+position);
                    }
                }
                );

        tabLayoutMediator.attach();
    }
}
