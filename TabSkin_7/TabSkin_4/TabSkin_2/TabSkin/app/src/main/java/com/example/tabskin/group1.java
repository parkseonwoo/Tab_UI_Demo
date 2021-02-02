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

public class group1 extends AppCompatActivity {

    private int mbtn1;
    private int Mgroup1;
    Button[] gbtn = new Button[1];

    Button[] btn = new Button[13];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group1);

        final LinearLayout mgroup1 = (LinearLayout) findViewById(R.id.btns);
        Button ALL = findViewById(R.id.group_all);
        Button group2 = findViewById(R.id.group2);
        Button group3 = findViewById(R.id.group3);
        Button group4 = findViewById(R.id.group4);

        btn[0] = (Button)findViewById(R.id.button1);
        btn[1] = (Button)findViewById(R.id.button2);
        btn[2] = (Button)findViewById(R.id.button3);

        ALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        group2.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group1.this, group2.class);
                startActivity(intent);
            }
        });

        group3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group1.this, group3.class);
                startActivity(intent);
            }
        });

        group4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(group1.this, group4.class);
                startActivity(intent);
            }
        });

        mgroup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Mgroup1 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(group1.this);
                    ad.setMessage("group1을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            off1 process1 = new off1();
                            process1.execute();
                            off2 process2 = new off2();
                            process2.execute();
                            off3 process3 = new off3();
                            process3.execute();
                            dialog.dismiss();   // 닫기

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.btn_sub));
                            btn[0].setBackgroundDrawable(states);
                            btn[1].setBackgroundDrawable(states);
                            btn[2].setBackgroundDrawable(states);

                            Mgroup1 = 0;
                            mgroup1.setSelected(false);

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(group1.this);
                    ad.setMessage("group1을 켜시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            on1 process1 = new on1();
                            process1.execute();
                            on2 process2 = new on2();
                            process2.execute();
                            on3 process3 = new on3();
                            process3.execute();

                            dialog.dismiss();   // 닫기

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.btn_sub));
                            btn[0].setBackgroundDrawable(states);
                            btn[1].setBackgroundDrawable(states);
                            btn[2].setBackgroundDrawable(states);

                            //Event
                            Mgroup1 = 1;
                            mgroup1.setSelected(true);
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
