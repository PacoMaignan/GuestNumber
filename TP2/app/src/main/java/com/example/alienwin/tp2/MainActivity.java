package com.example.alienwin.tp2;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends Activity {

    Activity lecontext;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lecontext = this;
        final EditText textoui = findViewById(R.id.textView1);
        Button buttonOui = (Button) findViewById(R.id.buttonOui);

        buttonOui.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                Intent defineIntent = new Intent(lecontext,Activity2.class);
                Bundle objetbunble = new Bundle();
                objetbunble.putString("passInfo",textoui.getText().toString());
                defineIntent.putExtras(objetbunble);
                lecontext.startActivity(defineIntent);
            }
        });
    }
}

