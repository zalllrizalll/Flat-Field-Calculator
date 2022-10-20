package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;
    Button btnP, btnS, btnL;
    TextView htgL, htgK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        btnP = (Button) findViewById(R.id.btnP);
        btnS = (Button) findViewById(R.id.btnS);
        btnL = (Button) findViewById(R.id.btnL);
        htgL = (TextView) findViewById(R.id.htgL);
        htgK = (TextView) findViewById(R.id.htgK);

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persegi persegi = new Persegi();
                double input1, input2;
                double hslLuas, hslKeliling;
                input1 = Double.valueOf(edt1.getText().toString().trim());
                input2 = Double.valueOf(edt2.getText().toString().trim());
                hslLuas = persegi.hitungLuas(input1,input2);
                String hasilL = String.valueOf(hslLuas);
                htgL.setText(hasilL);
                hslKeliling = persegi.hitungKeliling(input1);
                String hasilK = String.valueOf(hslKeliling);
                htgK.setText(hasilK);
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Segitiga segitiga = new Segitiga();
                double input1, input2;
                double hslLuas, hslKeliling;
                input1 = Double.valueOf(edt1.getText().toString().trim());
                input2 = Double.valueOf(edt2.getText().toString().trim());
                hslLuas = segitiga.hitungLuas(input1, input2);
                String hslL = String.valueOf(hslLuas);
                htgL.setText(hslL);
                hslKeliling = segitiga.hitungKeliling(input1);
                String hslK = String.valueOf(hslKeliling);
                htgK.setText(hslK);
            }
        });

        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lingkaran lingkaran = new Lingkaran();
                double input1;
                double hslLuas, hslKeliling;
                input1 = Double.valueOf(edt1.getText().toString().trim());
                hslLuas = lingkaran.hitungLuas(input1);
                String hslL = String.valueOf(hslLuas);
                htgL.setText(hslL);
                hslKeliling = lingkaran.hitungKeliling(input1);
                String hslK = String.valueOf(hslKeliling);
                htgK.setText(hslK);
            }
        });
    }

}