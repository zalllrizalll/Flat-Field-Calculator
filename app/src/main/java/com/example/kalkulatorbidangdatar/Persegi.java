package com.example.kalkulatorbidangdatar;

public class Persegi {
    public double panjang, lebar;
    public double luas, keliling;

    public double hitungLuas(double panjang, double lebar)
    {
        luas = panjang * lebar;
        return luas;
    }

    public double hitungKeliling(double panjang, double lebar)
    {
        keliling = (2 * panjang) + (2 * lebar);
        return keliling;
    }
}
