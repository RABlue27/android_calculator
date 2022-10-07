package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import java.lang.*;
import com.example.calculator.*;

import java.util.*;



public class MainActivity extends AppCompatActivity {


    //TODO: Regular clear (ac implinmented, not regular clear.




    public double sum;
    public int firstVal;
    public int secondVal;
    public boolean Equals;
    public boolean isCurrentlySum = false;
    public double lastSum = 0;
    public String op = "";
    public double memory = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Call to update the text box with current value of sum
        findViewById(R.id.eq).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (secondVal == 0 && op.equals("")) {
                    op = "+";

                }

                if (secondVal == 0 && op.equals("/")) {
                    setText(v, String.valueOf(0));

                    isCurrentlySum = true;
                    sum = 0;
                    lastSum = sum;

                    Equals = false;
                    firstVal = (int) lastSum;
                    secondVal = 0;
                }

                switch (op) {
                    case "+":
                        sum = firstVal + secondVal;
                        break;
                    case "-":
                        sum = firstVal - secondVal;
                        break;
                    case "x":
                        sum = firstVal * secondVal;
                        break;
                    case "/":
                        sum = (double) firstVal / secondVal;
                        break;

                }

                setText(v, String.valueOf(sum));

                isCurrentlySum = true;

                lastSum = sum;

                Equals = false;
                firstVal = (int) lastSum;
                secondVal = 0;
                sum = 0;
            }
        });

        findViewById(R.id.one).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "1";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "1";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.two).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "2";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "2";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.three).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "3";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "3";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.four).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "4";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "4";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.five).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "5";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "5";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.six).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "6";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "6";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.seven).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "7";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "7";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.eight).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "8";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "8";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.nine).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "9";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "9";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.zero).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x;
                if (!Equals) {
                    x = String.valueOf(firstVal);
                    x = x + "0";
                    firstVal = Integer.valueOf(x);
                } else {
                    x = String.valueOf(secondVal);
                    x = x + "0";
                    secondVal = Integer.valueOf(x);
                }
                setText(v, String.valueOf(x));
            }
        });

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x = String.valueOf(firstVal);
                setText(v, "+");
                Equals = true;
                op = "+";
                x = "";
            }
        });

        findViewById(R.id.divide).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x = String.valueOf(firstVal);
                setText(v, "/");
                Equals = true;
                op = "/";
                x = "";
            }
        });

        findViewById(R.id.times).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x = String.valueOf(firstVal);
                setText(v, "x");
                Equals = true;
                op = "x";
                x = "";
            }
        });

        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String x = String.valueOf(firstVal);
                setText(v, "-");
                Equals = true;
                op = "-";
                x = "";
            }
        });


        //TODO: regular clear

        findViewById(R.id.ac).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clearBoard(v);
            }
        });

        findViewById(R.id.memory_write).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (isCurrentlySum) {
                    memory = lastSum;
                    return;
                }
                if (Equals) {// right side
                    memory = secondVal;
                    return;
                }
                else {
                    memory=firstVal;
                    return;
                }
            }
        });

        findViewById(R.id.memory_read).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setText(v, String.valueOf(memory));
                if (Equals) {
                    secondVal = (int) memory;
                }
                else {
                    firstVal = (int) memory;
                }
            }
        });


    }

    public void clearBoard (View v){
        Equals = false;
        firstVal = 0;
        secondVal = 0;
        sum = 0;
        setText(v, "");
    }


    public void setText (View view, String st){
        TextView txt = (TextView) findViewById(R.id.text_display);
        String l1 = String.valueOf(firstVal);
        String l2 = String.valueOf(secondVal);
        if (l1.length() >=8) {
            firstVal = firstVal/10;
        }
        if (l2.length() >= 8) {
            secondVal = secondVal/10;
        }

        txt.setText(st);

    }

}
