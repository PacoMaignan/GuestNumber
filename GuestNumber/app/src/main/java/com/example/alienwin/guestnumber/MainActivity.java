package com.example.alienwin.guestnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    TextView buttonPlus;
    TextView ecran;

    private boolean update = false;
    private int chiffre1;
    private int chiffreRandom;
    private boolean bravo = false;
    private int min = 1;
    private int max = 99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chiffreRandom = (int)(Math.random() * ( max - min ));

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPlus = (TextView) findViewById(R.id.textResult);

        ecran = (TextView) findViewById(R.id.texteInsert);

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("9");
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                plusClick();
            }
        });


    }

    public void chiffreClick(String str) {
        if(update){
            if(chiffre1 < 10) {
                ecran.setText(chiffre1 + str);
            }
        }else{
            ecran.setText(str);
        }
        update = true;
        chiffre1 = Integer.valueOf(ecran.getText().toString());
    }

    public void plusClick(){
        if(!bravo) {
            if (chiffre1 > 0) {
                if (chiffre1 > chiffreRandom) {
                    buttonPlus.setText("-" + chiffre1);

                }
                if (chiffre1 < chiffreRandom) {
                    buttonPlus.setText("+" + chiffre1);

                }
                if (chiffre1 == chiffreRandom) {
                    buttonPlus.setText("BRAVO CHEF");
                    bravo = true;
                }
                ecran.setText(" ");
                update = false;
            }
        }else{
            ecran.setText(" ");
            buttonPlus.setText("+");
            chiffre1 = 0;
            update = false;
            bravo = false;
        }
    }
}
