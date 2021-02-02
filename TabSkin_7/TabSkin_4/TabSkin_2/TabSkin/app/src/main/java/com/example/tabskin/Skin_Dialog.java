package com.example.tabskin;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

public class Skin_Dialog extends Dialog implements View.OnClickListener {
    private Context mContext;

    private Button skin;
    private Button skin1;
    private Button skin2;
    private Button skin3;
    private Button skin4;
    Intent intent;

    public Skin_Dialog(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skin_dialog);
        skin = (Button) findViewById(R.id.skin);
        skin1 = (Button) findViewById(R.id.skin1);
        skin2 = (Button) findViewById(R.id.skin2);
        skin3 = (Button) findViewById(R.id.skin3);
        skin4 = (Button) findViewById(R.id.skin4);

        skin.setOnClickListener(this);
        skin1.setOnClickListener(this);
        skin2.setOnClickListener(this);
        skin3.setOnClickListener(this);
        skin4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        LinearLayout layout = findViewById(R.id.mainlayout);
        switch (v.getId()) {
            case R.id.skin:
                dismiss();
                intent = new Intent(getContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getContext().startActivity(intent);
                break;

            case R.id.skin1:
                dismiss();
                intent = new Intent(getContext(), Skin1.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getContext().startActivity(intent);
                break;

            case R.id.skin2:
                dismiss();
                intent = new Intent(getContext(), Skin2.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getContext().startActivity(intent);
                break;

            case R.id.skin3:
                dismiss();
                intent = new Intent(getContext(), Skin3.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getContext().startActivity(intent);
                break;

            case R.id.skin4:
                dismiss();
                intent = new Intent(getContext(), Skin4.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getContext().startActivity(intent);
                break;
        }
    }
}