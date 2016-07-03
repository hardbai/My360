package app.bai.com.my360.ui;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import app.bai.com.my360.R;
import app.bai.com.my360.adapter.WelcomeAdapter;
import app.bai.com.my360.fragment.BaseFragment;
import app.bai.com.my360.fragment.WelcomFragment;
import app.bai.com.my360.fragment.WelcomeFragment2;

public class WelcomeActivity extends AppCompatActivity {
    private List<BaseFragment> data;
    private List<RadioButton> radioButtons;
    private ViewPager viewPager;
    private WelcomeAdapter welcomeAdapter;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        viewPager = ((ViewPager) findViewById(R.id.welcome_vp));
        radioGroup = ((RadioGroup) findViewById(R.id.welcome_radio));
        initRadioButton();
        initData();
        welcomeAdapter = new WelcomeAdapter(getSupportFragmentManager(),data);
        viewPager.setAdapter(welcomeAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                radioButtons.get(position).setChecked(true);
                if(position==3){
                    radioGroup.setVisibility(View.GONE);
                }else {
                    radioGroup.setVisibility(View.VISIBLE);
                }
                radioButtons.get(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initRadioButton() {
        radioButtons = new ArrayList<>();
        radioButtons.add((RadioButton) findViewById(R.id.welcome_button1));
        radioButtons.add((RadioButton) findViewById(R.id.welcome_button2));
        radioButtons.add((RadioButton) findViewById(R.id.welcome_button3));
        radioButtons.add((RadioButton) findViewById(R.id.welcome_button4));
    }


    private void initData() {
        data = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            WelcomFragment fragment = new WelcomFragment(i+1);
            data.add(fragment);
        }
        WelcomeFragment2 fragment = new WelcomeFragment2();
        data.add(fragment);
    }

}
