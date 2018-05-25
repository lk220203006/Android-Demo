package com.example.digitalforest.a06;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivityDemo extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_demo);

        TabHost tabHost = getTabHost();

        //在tabhost上添加选项卡
        TabHost.TabSpec tabSpec = tabHost.newTabSpec("TEST");
        //选项卡上的标签
        tabSpec.setIndicator("",getDrawable(R.drawable.a));
        //选项卡对应的内容
        tabSpec.setContent(R.id.tab1);
        tabHost.addTab(tabSpec);

        tabHost.addTab(
                tabHost.newTabSpec("TEST2").setIndicator("TEST2").setContent(R.id.tab2)
        );
        tabHost.addTab(
                tabHost.newTabSpec("TEST3").setIndicator("TEST3").setContent(R.id.tab3)
        );
    }
}
