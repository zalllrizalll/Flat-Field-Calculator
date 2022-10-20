package com.example.kalkulatorbidangdatar;

public class Lingkaran {
    public double diameter;
    public double luas, keliling;

    public double hitungLuas(double diameter)
    {
        luas = (3.14 * diameter * diameter) / 4;
        return luas;
    }

    public double hitungKeliling(double diameter)
    {
        keliling = 3.14 * diameter;
        return keliling;
    }
}
