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

public class adgroup4 extends AppCompatActivity {

    private int mbtn1;
    private int Mgroup1;
    Button[] gbtn = new Button[1];

    Button[] btn = new Button[13];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adgroup4);

        final LinearLayout mgroup1 = (LinearLayout) findViewById(R.id.btns);
        Button ALL = findViewById(R.id.adgroup_all);
        Button group1 = findViewById(R.id.adgroup1);
        Button group2 = findViewById(R.id.adgroup2);
        Button group3 = findViewById(R.id.adgroup3);
        Button group4 = findViewById(R.id.adgroup4);

        btn[0] = (Button)findViewById(R.id.button1);
        btn[1] = (Button)findViewById(R.id.button2);
        btn[2] = (Button)findViewById(R.id.button3);

        ALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adgroup4.this, Skin2.class);
                startActivity(intent);
            }
        });

        group1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(adgroup4.this, adgroup1.class);
                startActivity(myintent);
                finish();
            }
        });

        group2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(adgroup4.this, adgroup2.class);
                        startActivity(intent);
                    }
                });

        group3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adgroup4.this, adgroup3.class);
                startActivity(intent);
            }
        });

        group4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adgroup4.this, adgroup4.class);
                startActivity(intent);
            }
        });

        mgroup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Mgroup1 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(adgroup4.this);
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

                            btn[0].setSelected(false);
                            btn[1].setSelected(false);

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(adgroup4.this);
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
                            on3 process3 = new on3();
                            process3.execute();

                            dialog.dismiss();   // 닫기

                            btn[0].setSelected(true);
                            btn[1].setSelected(true);

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