package com.example.digitalforest.mysave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class testActivity extends AppCompatActivity {
    EditText etUserName,edPwd;
    Button btnOK;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //显示界面与布局文件关联
        setContentView(R.layout.test2);
        //代码与xml众控件关联
        etUserName = findViewById(R.id.edName);
        edPwd = findViewById(R.id.edPwd);
        btnOK = findViewById(R.id.test2_btnOK);
        tvResult = findViewById(R.id.tvResult);
        //非激活
        btnOK.setEnabled(false);

        //注册事件
        etUserName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() != 0){
                    btnOK.setEnabled(true);
                }
                else{
                    btnOK.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";
                result = "用户名："+etUserName.getText()+"，密码："+edPwd.getText();
                tvResult.setText(result);
            }
        });
    }
}
