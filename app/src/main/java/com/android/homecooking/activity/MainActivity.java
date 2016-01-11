package com.android.homecooking.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.android.homecooking.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnRadioGroupCheckedChange;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.rg_main)
    private RadioGroup mRgMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewUtils.inject(this);

    }

    @OnRadioGroupCheckedChange(R.id.rg_main)
    public void rgCheckedChanger(RadioGroup radioGroup, int checkedId){

        switch (checkedId){
            case R.id.rb_home:

                break;
            case R.id.rb_shengxian:

                break;
            case R.id.rb_zhuanti:

                break;
            case R.id.rb_search:

                break;
            case R.id.rb_my:

                break;
        }
    }
}

