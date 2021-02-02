package com.example.tabskin;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class Login_Dialog extends Dialog implements View.OnClickListener {
    private Context mContext;


    public Login_Dialog(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_dialog);
    }

    @Override
    public void onClick(View v) {

    }
}