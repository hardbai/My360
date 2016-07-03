package app.bai.com.my360.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import app.bai.com.my360.R;
import app.bai.com.my360.ui.ContentActivity;

/**
 * Created by 86724 on 2016/7/1 0001.
 */
public class WelcomeFragment2 extends BaseFragment {
    private Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.welcomefragment2layout,null);
        button = ((Button) view.findViewById(R.id.goContent));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ContentActivity.class));
            }
        });
        return view;

    }

}
