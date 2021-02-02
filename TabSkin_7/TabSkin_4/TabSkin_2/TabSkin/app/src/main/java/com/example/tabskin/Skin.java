package com.example.tabskin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Skin extends AppCompatActivity {

    private int mbtn1;
    private int Mgroup1;
    Button[] gbtn = new Button[1];

    Button[] btn = new Button[13];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skin);

    }
    public void skin_btn(final View v) {
        Skin_Dialog skin_dialog;
        skin_dialog = new Skin_Dialog(this);
        skin_dialog.show();
    }
    // end 버튼 클릭
    public void end(final View v) {
        End_Dialog end_dialog;
        end_dialog = new End_Dialog(this);
        end_dialog.show();
    }

    // add_btn 버튼 클릭
    public void add_btn(final View v) {
        Add_Dialog add_dialog;
        add_dialog = new Add_Dialog(this);
        add_dialog.show();
    }
}
