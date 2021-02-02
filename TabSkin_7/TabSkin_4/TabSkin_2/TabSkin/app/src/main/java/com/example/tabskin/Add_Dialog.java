package com.example.tabskin;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class Add_Dialog extends Dialog implements View.OnClickListener {
    private Context mContext;

    private TextView btn_cancel;
    private TextView btn_ok;

    private CustomDialogListener customDialogListener;
    private EditText editName;

    private RadioGroup rg;
    private int state;

    public Add_Dialog(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    interface CustomDialogListener {
        void btn_ok(String name, int state);
        void btn_cancel();
    }

    public void setDialogListener(CustomDialogListener customDialogListener) {
        this.customDialogListener = customDialogListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_dialog);

        btn_cancel = (TextView) findViewById(R.id.btn_cancel);
        btn_ok = (TextView) findViewById(R.id.btn_ok);

        btn_cancel.setOnClickListener(this);
        btn_ok.setOnClickListener(this);

        editName = findViewById(R.id.editName);
        rg = findViewById(R.id.rg);

        final String name = editName.getText().toString();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cancel:

                dismiss();
                break;

            case R.id.btn_ok:

                final String name = editName.getText().toString();

                rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                        int state = 0;
                        switch (checkedId) {
                            case R.id.skin1_light_btn:
                                state = 0;
                                customDialogListener.btn_ok(name, state);
                                break;
                            case R.id.skin1_tv_btn:
                                state = 1;
                                customDialogListener.btn_ok(name, state);
                                break;
                            case R.id.skin1_key_btn:
                                state = 2;
                                customDialogListener.btn_ok(name, state);
                                break;
                            case R.id.skin1_wifi_btn:
                                state = 3;
                                customDialogListener.btn_ok(name, state);
                                break;

                            default:
                                break;
                        }

                        Toast.makeText(mContext, "state" + state + name, Toast.LENGTH_SHORT).show();
                    }
                });

                customDialogListener.btn_ok(name, state);
                dismiss();

                break;
        }
    }
}