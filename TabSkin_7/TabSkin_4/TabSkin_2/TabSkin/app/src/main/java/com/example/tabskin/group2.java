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

public class group2 extends AppCompatActivity {

    private int mbtn2;
    private int Mgroup2;

    Button[] btn = new Button[13];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group2);

        final LinearLayout mgroup2 = (LinearLayout) findViewById(R.id.btns);
        Button ALL = findViewById(R.id.group_all);
        Button group1 = findViewById(R.id.group1);
        Button group3 = findViewById(R.id.group3);
        Button group4 = findViewById(R.id.group4);

        btn[3] = (Button)findViewById(R.id.button4);
        btn[4] = (Button)findViewById(R.id.button5);
        btn[5] = (Button)findViewById(R.id.button6);

        ALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        group1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group2.this, group1.class);
                startActivity(intent);
            }
        });

        group3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group2.this, group3.class);
                startActivity(intent);
            }
        });

        group4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group2.this, group4.class);
                startActivity(intent);
            }
        });

        mgroup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Mgroup2 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(group2.this);
                    ad.setMessage("group2을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            off4 process4 = new off4();
                            process4.execute();
                            off5 process5 = new off5();
                            process5.execute();
                            off6 process6 = new off6();
                            process6.execute();
                            dialog.dismiss();   // 닫기

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.btn_sub));
                            btn[3].setBackgroundDrawable(states);
                            btn[4].setBackgroundDrawable(states);
                            btn[5].setBackgroundDrawable(states);

                            Mgroup2 = 0;
                            mgroup2.setSelected(false);
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
                    AlertDialog.Builder ad = new AlertDialog.Builder(group2.this);
                    ad.setMessage("group2을 켜시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            on4 process4 = new on4();
                            process4.execute();
                            on5 process5 = new on5();
                            process5.execute();
                            on6 process6 = new on6();
                            process6.execute();

                            dialog.dismiss();   // 닫기

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.btn_sub));
                            btn[3].setBackgroundDrawable(states);
                            btn[4].setBackgroundDrawable(states);
                            btn[5].setBackgroundDrawable(states);

                            //Event
                            Mgroup2 = 1;
                            mgroup2.setSelected(true);
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
