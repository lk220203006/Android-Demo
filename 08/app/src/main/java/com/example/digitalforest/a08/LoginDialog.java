package com.example.digitalforest.a08;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

public class LoginDialog extends Dialog {
    private Button btnok,btncancel;
    private TextView tvname,tvpwd;

    public LoginDialog(@NonNull Context context) {
        super(context);
    }

    public LoginDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected LoginDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.loginlayout);
        tvname = findViewById(R.id.editText);
        tvpwd = findViewById(R.id.editText3);
        btnok = findViewById(R.id.button3);
        btncancel = findViewById(R.id.button4);
        super.onCreate(savedInstanceState);
    }
}
