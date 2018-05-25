package com.example.digitalforest.a06;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MyLogin extends LinearLayout {
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    public MyLogin(Context context) {
        super(context);
        init(context);
    }

    public MyLogin(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyLogin(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public MyLogin(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    void init(Context context){
        View view = LayoutInflater.from(context).inflate(R.layout.activity_unit6_8,this,true);
        etUsername = view.findViewById(R.id.editText);
        etPassword = view.findViewById(R.id.editText3);
        btnLogin = view.findViewById(R.id.button5);
    }

    public String getUsername() {
        return etUsername.getText()+"";
    }

    public String getPassword() {
        return etPassword.getText()+"";
    }

    public void setOnClickListener(View.OnClickListener listener){
        btnLogin.setOnClickListener(listener);
    }
}
