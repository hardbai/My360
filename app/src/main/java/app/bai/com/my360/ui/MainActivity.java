package app.bai.com.my360.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import app.bai.com.my360.R;

public class MainActivity extends BaseActivity {
    private SharedPreferences config;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //判断是否第一次金进入应用，如果是跳转至欢迎页面，如果不是跳转至主页面
            if(config.getBoolean("isFirst",true)){
                config.edit().putBoolean("isFirst",false).commit();
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish();
            }else {
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish();
            }

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         config = getSharedPreferences("config", MODE_PRIVATE);
        //handler延迟一秒发送信息
        handler.sendEmptyMessageDelayed(0,1000);
    }
}
