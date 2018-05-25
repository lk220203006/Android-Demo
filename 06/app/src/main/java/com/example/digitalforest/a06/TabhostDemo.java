package com.example.digitalforest.a06;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabhostDemo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost_demo);

        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup();
        //在tabhost上添加选项卡
        TabSpec tabSpec = tabHost.newTabSpec("TEST");
        //选项卡上的标签
        tabSpec.setIndicator("Label1");
        //选项卡对应的内容
        tabSpec.setContent(R.id.tab1);
        tabHost.addTab(tabSpec);

        tabHost.addTab(
                tabHost.newTabSpec("TEST2").setIndicator("Label2").setContent(R.id.tab2)
        );
        tabHost.addTab(
                tabHost.newTabSpec("TEST3").setIndicator("Label3").setContent(R.id.tab3)
        );
    }
}
