package com.example.alienwin.tp2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity  {

    Activity lecontext;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        lecontext = this;
        lecontext.setTitle("fenetre 2");
        final TextView textoui = findViewById(R.id.textView2);
        Bundle objetbunble = this.getIntent().getExtras();

        String leText= objetbunble.getString("passInfo");

        textoui.setText(leText);

    }
}



9