package com.example.kalkulatorbidangdatar;

public class Segitiga {
    public double alas, tinggi;
    public double luas, keliling;

    public double hitungLuas(double alas, double tinggi)
    {
        luas = (alas * tinggi) / 2;
        return luas;
    }

    public double hitungKeliling(double alas)
    {
        keliling = 3 * alas;
        return keliling;
    }
}
