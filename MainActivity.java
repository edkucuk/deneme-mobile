package com.example.user.deneme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    Button giris;
    EditText sifre1, username2;
    String adAl, sifreAl;
    String AdSoyad = "Elif KÜÇÜK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        giris = (Button) findViewById(R.id.giris);
        sifre1 = (EditText) findViewById(R.id.sifre);
        username2 = (EditText) findViewById(R.id.username1);

        giris.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                adAl = String.valueOf(username2.getText());
                sifreAl = String.valueOf(sifre1.getText());

                if (username2.getText().toString().equals("Elif")&& sifre1.getText().toString().equals("21051995")) {
                    Intent intent = new Intent(MainActivity.this, ActivityGecis.class);
                    intent.putExtra("AdSoyad", AdSoyad);
                    startActivity(intent);
                }
            }

        }

    }
}
