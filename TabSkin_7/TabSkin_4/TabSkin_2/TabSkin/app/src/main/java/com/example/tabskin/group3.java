package com.example.tabskin;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class group3 extends AppCompatActivity {

    private int mbtn3;
    private int Mgroup3;

    Button[] btn = new Button[13];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group3);

        final LinearLayout mgroup3 = (LinearLayout) findViewById(R.id.btns);
        Button ALL = findViewById(R.id.group_all);
        Button group1 = findViewById(R.id.group1);
        Button group2 = findViewById(R.id.group2);
        Button group4 = findViewById(R.id.group4);

        btn[6] = (Button)findViewById(R.id.button7);
        btn[7] = (Button)findViewById(R.id.button8);

        ALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        group1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group3.this, group1.class);
                startActivity(intent);
            }
        });

        group2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group3.this, group2.class);
                startActivity(intent);
            }
        });

        group4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group3.this, group4.class);
                startActivity(intent);
            }
        });

        mgroup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Mgroup3 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(group3.this);
                    ad.setMessage("group3을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            off7 process7 = new off7();
                            process7.execute();
                            off8 process8 = new off8();
                            process8.execute();

                            dialog.dismiss();   // 닫기

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.btn_sub));
                            btn[6].setBackgroundDrawable(states);
                            btn[7].setBackgroundDrawable(states);

                            Mgroup3 = 0;
                            mgroup3.setSelected(false);
                        }

                    });

                    //취소 버튼 설정
                    ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Log.v(TAG, "No Btn Click");
                            dialog.dismiss(); // 닫기

                            //Event
                            dialog.cancel();
                        }
                    });

                    // 창 띄우기
                    ad.show();

                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(group3.this);
                    ad.setMessage("group3을 켜시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            on7 process7 = new on7();
                            process7.execute();
                            on8 process8 = new on8();
                            process8.execute();

                            dialog.dismiss();   // 닫기

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.btn_sub));
                            btn[6].setBackgroundDrawable(states);
                            btn[7].setBackgroundDrawable(states);

                            //Event
                            Mgroup3 = 1;
                            mgroup3.setSelected(true);
                        }
                    });

                    //취소 버튼 설정
                    ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "No Btn Click");
                            dialog.dismiss(); // 닫기

                            //Event
                            dialog.cancel();
                        }
                    });

                    // 창 띄우기
                    ad.show();
                }
            }
        });
    }

    public void skin_btn(final View v) {
        Skin_Dialog skin_dialog;
        skin_dialog = new Skin_Dialog(this);
        skin_dialog.show();
    }
}
