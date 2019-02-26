package com.example.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etPanjang, etLebar;
    private Button btnTambah, btnKurang, btnKali, btnBagi;
    private TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang = findViewById(R.id.et_panjang);
        etLebar = findViewById(R.id.et_lebar);


        btnTambah = findViewById(R.id.btn_tambah);
        btnKurang = findViewById(R.id.btn_kurang);
        btnKali = findViewById(R.id.btn_kali);
        btnBagi = findViewById(R.id.btn_bagi);
        tvHasil = findViewById(R.id.tv_hasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this ,
                        Jumlah.class);
                startActivity(moveIntent);
            }
        });
                btnKurang.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     Intent moveIntent = new Intent(MainActivity.this ,
                                                             Kurang.class);
                                                     startActivity(moveIntent);
                                                 }
                });


                        btnKali.setOnClickListener(new View.OnClickListener() {
                                                       @Override
                                                       public void onClick(View v) {
                                                           Intent moveIntent = new Intent(MainActivity.this ,
                                                                   Kali.class);
                                                           startActivity(moveIntent);
                                                       }
                        });
                                btnBagi.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent moveIntent = new Intent(MainActivity.this ,
                                                Bagi.class);
                                        startActivity(moveIntent);
                                    }
                                });}}


