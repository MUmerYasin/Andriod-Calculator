package com.example.android.calculator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnSub, btnMulti, btnDivid, btnEqual, btnClear;
    EditText edt1;
    float vlu1, vlu2;
    boolean madd, msub, mMulti, mDivid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        btn1 = (Button) findViewById(R.id.Button1);
        btn2 = (Button) findViewById(R.id.Button2);
        btn3 = (Button) findViewById(R.id.Button3);
        btn4 = (Button) findViewById(R.id.Button4);
        btn5 = (Button) findViewById(R.id.Button5);
        btn6 = (Button) findViewById(R.id.Button6);
        btn7 = (Button) findViewById(R.id.Button7);
        btn8 = (Button) findViewById(R.id.Button8);
        btn9 = (Button) findViewById(R.id.Button9);
        btn0 = (Button) findViewById(R.id.Button0);
        btnPlus = (Button) findViewById(R.id.ButtonPlus);
        btnSub = (Button) findViewById(R.id.ButtonSub);
        btnDivid = (Button) findViewById(R.id.ButtonMulti);
        btnMulti = (Button) findViewById(R.id.ButtonDvid);
        btnEqual = (Button) findViewById(R.id.ButtonEqual);
        btnClear = (Button) findViewById(R.id.ButtonClear);
        edt1 = (EditText) findViewById(R.id.txtField);
        try {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "1");
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "2");
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "3");
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "4");
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "5");
                }
            });
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "6");
                }
            });
            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "7");
                }
            });
            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "8");
                }
            });
            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "9");
                }
            });
            btn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {edt1.setText(edt1.getText() + "0");
                }
            });
            btnPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edt1 == null) {
                        Toast.makeText(getApplicationContext(), "Filed is Empty", Toast.LENGTH_SHORT).show();
                        edt1.setText("");
                    } else {
                        vlu1 = Float.parseFloat(String.valueOf(edt1.getText()));
                        edt1.setText("");
                        madd = true;
                    }
                }
            });
            btnSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edt1 == null) {
                        Toast.makeText(getApplicationContext(), "Filed is Empty", Toast.LENGTH_SHORT).show();
                        edt1.setText("");
                    } else {
                        vlu1 = Float.parseFloat(String.valueOf(edt1.getText()));
                        edt1.setText("");
                        msub = true;
                    }
                }
            });
            btnMulti.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edt1 == null) {
                        Toast.makeText(getApplicationContext(), "Filed is Empty", Toast.LENGTH_SHORT).show();
                        edt1.setText("");
                    } else {
                        vlu1 = Float.parseFloat(String.valueOf(edt1.getText()));
                        edt1.setText("");
                        mMulti = true;
                    }
                }
            });
            btnDivid.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edt1 == null) {
                        Toast.makeText(getApplicationContext(), "Filed is Empty", Toast.LENGTH_SHORT).show();
                        edt1.setText("");
                    } else {
                        vlu1 = Float.parseFloat(String.valueOf(edt1.getText()));
                        edt1.setText("");
                        mDivid = true;
                    }
                }
            });
            btnEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edt1 == null) {
                        Toast.makeText(getApplicationContext(), "Filed is Empty", Toast.LENGTH_SHORT).show();
                        edt1.setText("");
                    } else {
                        vlu2 = Float.parseFloat(String.valueOf(edt1.getText()));
                        if (madd == true) {
                            float vlu3;
                            vlu3 = vlu1 + vlu2;
                            edt1.setText(String.valueOf(vlu3));
                            madd = false;
                        } else if (msub == true) {
                            float vlu3;
                            vlu3 = vlu1 - vlu2;
                            edt1.setText(String.valueOf(vlu3));
                            msub = false;
                        } else if (mDivid == true) {
                            float vlu3;
                            vlu3 = vlu1 / vlu2;
                            edt1.setText(String.valueOf(vlu3));
                            mDivid = false;
                        } else if (mMulti == true) {
                            float vlu3;
                            vlu3 = vlu1 * vlu2;
                            edt1.setText(String.valueOf(vlu3));
                            mMulti = false;
                        } else {
                            edt1.setText(null);
                        }
                    }
                }
            });

            btnClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText("");
                    Toast.makeText(getApplicationContext(), "Filed is Clear: ", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            String aa = String.valueOf(e);
            Toast.makeText(getApplicationContext(), "aa", Toast.LENGTH_SHORT).show();
        }
    }
}