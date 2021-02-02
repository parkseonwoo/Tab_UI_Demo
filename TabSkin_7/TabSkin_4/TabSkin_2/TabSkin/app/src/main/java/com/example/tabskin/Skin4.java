package com.example.tabskin;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Skin4 extends AppCompatActivity {

    public static final String TAG = "Test_Alert_Dialog";

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

    Button[] btn = new Button[13];
    Button scan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skin4);

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

        Button skin4_group1 = findViewById(R.id.skin4_group1);
        Button skin4_group2 = findViewById(R.id.skin4_group2);
        Button skin4_group3 = findViewById(R.id.skin4_group3);
        Button skin4_group4 = findViewById(R.id.skin4_group4);

        skin4_group1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), Skin4_group1.class);
                myintent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myintent);
                finish();
            }
        });

        skin4_group2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), Skin4_group2.class);
                myintent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myintent);
                finish();
            }
        });

        skin4_group3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), Skin4_group3.class);
                myintent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myintent);
                finish();
            }
        });

        skin4_group4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), Skin4_group4.class);
                myintent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myintent);
                finish();
            }
        });

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mbtn1 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#1을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            //Log.v(TAG, "Yes btn Click");
                            off1 process1 = new off1();
                            process1.execute();

                            dialog.dismiss();   // 닫기


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
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#1을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on1 process1 = new on1();
                            process1.execute();

                            dialog.dismiss();   // 닫기

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

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#2을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off2 process2 = new off2();
                            process2.execute();
                            dialog.dismiss();   // 닫기

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#2을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on2 process1 = new on2();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#3을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off3 process1 = new off3();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#3을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on3 process1 = new on3();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#4을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off4 process1 = new off4();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#4을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on4 process1 = new on4();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#5을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off5 process1 = new off5();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#5을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on5 process1 = new on5();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#6을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off6 process1 = new off6();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#6을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on6 process1 = new on6();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#7을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off7 process1 = new off7();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#7을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on7 process1 = new on7();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#8을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off8 process1 = new off8();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#8을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on8 process1 = new on8();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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

                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#9을 끄시겠습니까?"); //내용 설정

                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            off9 process1 = new off9();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(Skin4.this);
                    ad.setMessage("Device#9을 켜시겠습니까?"); //내용 설정
                    // 확인 버튼 설정
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "Yes btn Click");
                            on9 process1 = new on9();
                            process1.execute();
                            dialog.dismiss();   // 닫기

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
