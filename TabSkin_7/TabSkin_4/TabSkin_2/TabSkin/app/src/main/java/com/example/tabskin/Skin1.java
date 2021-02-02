package com.example.tabskin;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Skin1 extends AppCompatActivity {

    public static final String TAG = "Test_Alert_Dialog";

    Context context;
    private TextView btn_ok;

    private int mbtn1;
    private int mbtn2;
    private int mbtn3;
    private int mbtn4;
    private int mbtn5;
    private int mbtn6;
    private int mbtn7;
    private int mbtn8;
    private int mbtn9;
    private int mbtn10;
    private int mgroup1;

    private LinearLayout layout;
    private GridLayout btns1;



    Button[] btn = new Button[13];
    Button scan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skin1);

        Button rvgroup1 = findViewById(R.id.rvgroup1);
        Button rvgroup2 = findViewById(R.id.rvgroup2);
        Button rvgroup3 = findViewById(R.id.rvgroup3);
        Button rvgroup4 = findViewById(R.id.rvgroup4);

        layout = findViewById(R.id.mainlayout);
        btns1 = findViewById(R.id.btns1);
        btn_ok = findViewById(R.id.btn_ok);

        btn[0] = (Button)findViewById(R.id.button1);
        btn[1] = (Button)findViewById(R.id.button2);
        btn[2] = (Button)findViewById(R.id.button3);
        btn[3] = (Button)findViewById(R.id.button4);
        btn[4] = (Button)findViewById(R.id.button5);
        btn[5] = (Button)findViewById(R.id.button6);
        btn[6] = (Button)findViewById(R.id.button7);
        btn[7] = (Button)findViewById(R.id.button8);
        btn[8] = (Button)findViewById(R.id.button9);
        btn[9] = (Button)findViewById(R.id.button10);

        rvgroup1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), rvgroup1.class);
                myintent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myintent);
                finish();
            }
        });

        rvgroup2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), rvgroup2.class);
                myintent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myintent);
                finish();
            }
        });

        rvgroup3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), rvgroup3.class);
                myintent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myintent);
                finish();
            }
        });

        rvgroup4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), rvgroup4.class);
                myintent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myintent);
                finish();
            }
        });

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn1 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#1을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            //Log.v(TAG, "Yes btn Click");
                            off1 process1 = new off1();
                            process1.execute();

                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            //Execute code here
                            btn[0].setBackgroundDrawable(states);

                            mbtn1 = 0;
                            btn[0].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn1 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#1을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on1 process1 = new on1();
                            process1.execute();

                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            //Execute code here
                            btn[0].setBackgroundDrawable(states);
                            mbtn1 = 1;
                            btn[0].setSelected(true);

                            /* TextView2.append("device#1 light ON" + "\n"); */
                        }
                    });
                    //취소 버튼 설정
                    ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Log.v(TAG, "No Btn Click");
                            dialog.dismiss(); // 닫기
                            //Event
                            dialog.cancel();
                            mbtn1 = 0;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                }
            }
        });

        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn2 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#2을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off2 process2 = new off2();
                            process2.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[1].setBackgroundDrawable(states);
                            mbtn2 = 0;
                            btn[1].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn2 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#2을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on2 process1 = new on2();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[1].setBackgroundDrawable(states);
                            //Execute code here
                            mbtn2 = 1;
                            btn[1].setSelected(true);

                            /* TextView2.append("device#1 light ON" + "\n"); */
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
                            mbtn2 = 0;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                }
            }
        });

        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn3 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#3을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off3 process1 = new off3();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[2].setBackgroundDrawable(states);
                            mbtn3 = 0;
                            btn[2].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn3 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#3을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on3 process1 = new on3();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[2].setBackgroundDrawable(states);
                            //Execute code here
                            mbtn3 = 1;
                            btn[2].setSelected(true);

                            /* TextView2.append("device#1 light ON" + "\n"); */
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
                            mbtn3 = 0;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                }
            }
        });

        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn4 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#4을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off4 process1 = new off4();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[3].setBackgroundDrawable(states);
                            mbtn4 = 0;
                            btn[3].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn4 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#4을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on4 process1 = new on4();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[3].setBackgroundDrawable(states);
                            //Execute code here
                            mbtn4 = 1;
                            btn[3].setSelected(true);

                            /* TextView2.append("device#1 light ON" + "\n"); */
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
                            mbtn4 = 0;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                }
            }
        });

        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn5 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#5을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off5 process1 = new off5();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[4].setBackgroundDrawable(states);
                            mbtn5 = 0;
                            btn[4].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn5 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#5을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on5 process1 = new on5();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[4].setBackgroundDrawable(states);
                            //Execute code here
                            mbtn5 = 1;
                            btn[4].setSelected(true);

                            /* TextView2.append("device#1 light ON" + "\n"); */
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
                            mbtn5 = 0;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                }
            }
        });

        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn6 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#6을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off6 process1 = new off6();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[5].setBackgroundDrawable(states);
                            mbtn6 = 0;
                            btn[5].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn6 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#6을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on6 process1 = new on6();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[5].setBackgroundDrawable(states);
                            //Execute code here
                            mbtn6 = 1;
                            btn[5].setSelected(true);
                            /* TextView2.append("device#1 light ON" + "\n"); */
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
                            mbtn6 = 0;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                }
            }
        });

        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn7 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#7을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off7 process1 = new off7();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[6].setBackgroundDrawable(states);
                            mbtn7 = 0;
                            btn[6].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn7 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#7을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on7 process1 = new on7();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[6].setBackgroundDrawable(states);
                            //Execute code here
                            mbtn7 = 1;
                            btn[6].setSelected(true);

                            /* TextView2.append("device#1 light ON" + "\n"); */
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
                            mbtn7 = 0;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                }
            }
        });

        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn8 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#8을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off8 process1 = new off8();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[7].setBackgroundDrawable(states);
                            mbtn8 = 0;
                            btn[7].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn8 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#8을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on8 process1 = new on8();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[7].setBackgroundDrawable(states);
                            //Execute code here
                            mbtn8 = 1;
                            btn[7].setSelected(true);

                            /* TextView2.append("device#1 light ON" + "\n"); */
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
                            mbtn8 = 0;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                }
            }
        });

        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn9 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#9을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off9 process1 = new off9();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[8].setBackgroundDrawable(states);
                            mbtn9 = 0;
                            btn[8].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn9 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#9을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on9 process1 = new on9();
                            process1.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[8].setBackgroundDrawable(states);
                            //Execute code here
                            mbtn9 = 1;
                            btn[8].setSelected(true);

                            /* TextView2.append("device#1 light ON" + "\n"); */
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
                            mbtn9 = 0;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                }
            }
        });

        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn10 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#10을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off10 process10 = new off10();
                            process10.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[9].setBackgroundDrawable(states);
                            mbtn10 = 0;
                            btn[9].setSelected(false);
                            /* TextView2.append("device#1 light OFF" + "\n"); */
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
                            mbtn10 = 1;
                        }
                    });
                    // 창 띄우기
                    ad.show();
                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin1.this);
                    ad.setMessage("Device#10을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on10 process10 = new on10();
                            process10.execute();
                            dialog.dismiss();   // 닫기
                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[9].setBackgroundDrawable(states);
                            //Execute code here
                            mbtn10 = 1;
                            btn[9].setSelected(true);

                            /* TextView2.append("device#1 light ON" + "\n"); */
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
                            mbtn10 = 0;
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
    // end 버튼 클릭
    public void end(final View v) {
        End_Dialog end_dialog;
        end_dialog = new End_Dialog(this);
        end_dialog.show();
    }

    /*
    // add_btn 버튼 클릭
    public void add_btn(final View v) {
        Add_Dialog add_dialog;
        add_dialog = new Add_Dialog(this);


        add_dialog.setDialogListener(new Add_Dialog.CustomDialogListener() {
            @Override
            public void btn_ok(final String name, int state) {
                final Button addbtn = new Button(Skin1.this);

                if(state == 0) {

                    LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                    addbtn.setBackgroundResource(R.drawable.skin1_btn_subs);

                    Drawable imgs = Skin1.this.getResources().getDrawable(R.drawable.skin1_light_btn_bg);
                    imgs.setBounds(18, 0, 0, 120);
                    addbtn.setCompoundDrawables(imgs, null, null, null);
                    addbtn.setText(name);
                    addbtn.setTextSize(10);
                    addbtn.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                    addbtn.setSelected(false);
                    param.topMargin = 7;
                    param.width = 110;
                    param.height = 120;
                    param.leftMargin = 20;
                    addbtn.setText(name);
                    btns1.addView(addbtn, param);

                }
                else if(state == 1) {

                        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                        addbtn.setBackgroundResource(R.drawable.skin1_btn_subs);

                        Drawable imgs = Skin1.this.getResources().getDrawable(R.drawable.skin1_tv_btn_bg);
                        imgs.setBounds(18, 0, 0, 120);
                        addbtn.setCompoundDrawables(imgs, null, null, null);
                        addbtn.setText(name);
                        addbtn.setTextSize(10);
                        addbtn.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                        addbtn.setSelected(false);
                        param.topMargin = 7;
                        param.width = 110;
                        param.height = 120;
                        param.leftMargin = 20;
                        addbtn.setText(name);
                        btns1.addView(addbtn, param);

                }

                else if(state == 2) {

                    LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                    addbtn.setBackgroundResource(R.drawable.skin1_btn_subs);

                    Drawable imgs = Skin1.this.getResources().getDrawable(R.drawable.skin1_key_btn_bg);
                    imgs.setBounds(18, 0, 0, 120);
                    addbtn.setCompoundDrawables(imgs, null, null, null);
                    addbtn.setText(name);
                    addbtn.setTextSize(10);
                    addbtn.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                    addbtn.setSelected(false);
                    param.topMargin = 7;
                    param.width = 110;
                    param.height = 120;
                    param.leftMargin = 20;
                    addbtn.setText(name);
                    btns1.addView(addbtn, param);

                }

                else if(state == 3) {

                    LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                    addbtn.setBackgroundResource(R.drawable.skin1_btn_subs);

                    Drawable imgs = Skin1.this.getResources().getDrawable(R.drawable.skin1_wifi_btn_bg);
                    imgs.setBounds(18, 0, 0, 120);
                    addbtn.setCompoundDrawables(imgs, null, null, null);
                    addbtn.setText(name);
                    addbtn.setTextSize(10);
                    addbtn.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                    addbtn.setSelected(false);
                    param.topMargin = 7;
                    param.width = 110;
                    param.height = 120;
                    param.leftMargin = 20;
                    addbtn.setText(name);
                    btns1.addView(addbtn, param);

                }
            }

            @Override
            public void btn_cancel() {

            }
        });

        add_dialog.show();

    }

     */
}
