package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button mButton0, mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7, mButton8,
            mButton9, mButtonPoint, mButtonAdd, mButtonSub, mButtonDiv, mButtonMul, mButtonEq, mButtonSqr, mButtonSqrt, mButtonM, mButtonMC;
    EditText mEditText;
    float mValueOne, mValueTwo, savedValue;
    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton0 = (Button) findViewById(R.id.button0);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);
        mButton7 = (Button) findViewById(R.id.button7);
        mButton8 = (Button) findViewById(R.id.button8);
        mButton9 = (Button) findViewById(R.id.button9);
        mButtonPoint = (Button) findViewById(R.id.buttonPoint);
        mButtonAdd = (Button) findViewById(R.id.buttonAdd);
        mButtonSub = (Button) findViewById(R.id.buttonSub);
        mButtonMul = (Button) findViewById(R.id.buttonMul);
        mButtonDiv = (Button) findViewById(R.id.buttonDiv);
        mButtonSqr = (Button) findViewById(R.id.buttonSqr);
        mButtonSqrt = (Button) findViewById(R.id.buttonSqrt);
        mButtonEq = (Button) findViewById(R.id.buttonEq);
        mButtonM = (Button) findViewById(R.id.buttonM);
        mButtonMC = (Button) findViewById(R.id.buttonMC);
        mEditText = (EditText) findViewById(R.id.editText1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "1");
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "2");
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "3");
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "4");
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "5");
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "6");
            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "7");
            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "8");
            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "9");
            }
        });
        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "0");
            }
        });
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    if (mAddition) {
                        mValueTwo = Float.parseFloat(mEditText.getText() + "");
                        mValueOne = mValueOne + mValueTwo;
                        mEditText.setText(null);
                    } else {
                        mValueOne = Float.parseFloat(mEditText.getText() + "");
                        mAddition = true;
                        mEditText.setText(null);
                    }
                }
            }
        });
        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    if (mSubtract) {
                        mValueTwo = Float.parseFloat(mEditText.getText() + "");
                        mValueOne = mValueOne - mValueTwo;
                        mEditText.setText(null);
                    } else {

                        mValueOne = Float.parseFloat(mEditText.getText() + "");
                        mSubtract = true;
                        mEditText.setText(null);
                    }
                }
            }
        });
        mButtonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    if (mMultiplication) {
                        mValueTwo = Float.parseFloat(mEditText.getText() + "");
                        mValueOne = mValueOne * mValueTwo;
                        mEditText.setText(null);
                    } else {
                        mValueOne = Float.parseFloat(mEditText.getText() + "");
                        mMultiplication = true;
                        mEditText.setText(null);
                    }
                }
            }
        });
        mButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    if (mDivision) {
                        mValueTwo = Float.parseFloat(mEditText.getText() + "");
                        mValueOne = mValueOne / mValueTwo;
                        mEditText.setText(null);
                    } else {
                        mValueOne = Float.parseFloat(mEditText.getText() + "");
                        mDivision = true;
                        mEditText.setText(null);
                    }
                }
            }
        });
        mButtonSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(mEditText.getText() + "");
                    mEditText.setText(Math.pow(mValueOne,2)+"");
                }
            }
        });
        mButtonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(mEditText.getText() + "");
                    mEditText.setText(Math.sqrt(mValueOne)+"");
                }
            }
        });
        mButtonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText.getText()+"" == "") {
                    System.out.println(savedValue);
                    if (Float.isNaN(savedValue)){
                        mEditText.setText("");
                    }
                    else {
                        mEditText.setText(savedValue+"");
                    }
                } else {
                    mValueOne = Float.parseFloat(mEditText.getText() + "");
                    savedValue = mValueOne;
                    mEditText.setText("");
                }
            }
        });
        mButtonMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Float.isNaN(savedValue)) {
                    savedValue=Float.NaN;
                }
            }
        });
        mButtonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(mEditText.getText() + "");
                if (mAddition == true) {
                    mEditText.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }
                if (mSubtract == true) {
                    mEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }
                if (mMultiplication == true) {
                    mEditText.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }
                if (mDivision == true) {
                    mEditText.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });
        mButtonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + ".");
            }
        });
    }
}