package com.company;

public class Scalar {
    private int value;

    public Scalar(int pValue)
    {
        this.value = pValue;
    }

    public int get()
    {
        return this.value;
    }

    public String toString()
    {
        return Integer.toString(this.value);
    }
}