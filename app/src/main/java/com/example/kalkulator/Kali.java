package com.example.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kali extends AppCompatActivity {
    private EditText etPanjang, etLebar;
    private Button btnKali, btnMenu;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kali);

        etPanjang = findViewById(R.id.et_panjang);
        etLebar = findViewById(R.id.et_lebar);

        btnKali = findViewById(R.id.btn_kali);
        btnMenu = findViewById(R.id.btn_menu);
        tvHasil = findViewById(R.id.tv_hasil);

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sPanjang = etPanjang.getText().toString();
                String sLebar = etLebar.getText().toString();

                double panjang = Double.parseDouble(sPanjang);
                double lebar = Double.parseDouble(sLebar);


                double hasil = panjang * lebar;

                tvHasil.setText(String.valueOf(hasil));
                Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_SHORT).show();

            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(Kali.this ,
                        MainActivity.class);
                startActivity(moveIntent);
            }
        });
    }
}


