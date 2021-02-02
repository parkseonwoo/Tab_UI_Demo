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

public class group4 extends AppCompatActivity {

    private int mbtn4;
    private int Mgroup4;

    Button[] btn = new Button[13];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group4);

        final LinearLayout mgroup4 = (LinearLayout) findViewById(R.id.btns);
        Button ALL = findViewById(R.id.group_all);
        Button group1 = findViewById(R.id.group1);
        Button group2 = findViewById(R.id.group2);
        Button group3 = findViewById(R.id.group3);

        btn[8] = (Button)findViewById(R.id.button9);
        btn[9] = (Button)findViewById(R.id.button10);

        ALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group4.this, MainActivity.class);
                startActivity(intent);
            }
        });

        group1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group4.this, group1.class);
                startActivity(intent);
            }
        });

        group2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group4.this, group2.class);
                startActivity(intent);
            }
        });

        group3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group4.this, group2.class);
                startActivity(intent);
            }
        });

        mgroup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Mgroup4 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(group4.this);
                    ad.setMessage("group4을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            off9 process9 = new off9();
                            process9.execute();
                            off10 process10 = new off10();
                            process10.execute();

                            dialog.dismiss();   // 닫기

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.btn_sub));
                            btn[8].setBackgroundDrawable(states);
                            btn[9].setBackgroundDrawable(states);

                            Mgroup4 = 0;
                            mgroup4.setSelected(false);
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
                    AlertDialog.Builder ad = new AlertDialog.Builder(group4.this);
                    ad.setMessage("group4을 켜시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            on9 process9 = new on9();
                            process9.execute();
                            on10 process10 = new on10();
                            process10.execute();

                            dialog.dismiss();   // 닫기

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.btn_sub));
                            btn[8].setBackgroundDrawable(states);
                            btn[9].setBackgroundDrawable(states);

                            //Event
                            Mgroup4 = 1;
                            mgroup4.setSelected(true);
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
