package app.bai.com.my360.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import app.bai.com.my360.R;

/**
 * Created by 86724 on 2016/7/1 0001.
 */
public class WelcomFragment extends BaseFragment {
    private int index=0;
    private ImageView imageView;
    private ImageView imageView1;

    public WelcomFragment(int index) {
        this.index = index;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(getContext(), R.layout.welcomfragment1,null);
        imageView = ((ImageView) view.findViewById(R.id.welcome_iv));
        imageView1 = ((ImageView) view.findViewById(R.id.welcome_iv2));
        switch (index){
            case 1:
                imageView.setImageResource(R.drawable.cg);
                imageView1.setImageResource(R.drawable.dg);
                break;
            case 2:
                imageView.setImageResource(R.drawable.ag);
                imageView1.setImageResource(R.drawable.bg);
                break;
            case 3:
                imageView.setImageResource(R.drawable.eg);
                imageView1.setImageResource(R.drawable.fg);
                break;
        }
        return view;
    }
}
