package com.company;

public class Scalar implements Node {
    private int value;

    public Scalar(int pValue)
    {
        this.value = pValue;
    }

    public int get()
    {
        return this.value;
    }
    public void set(int pValue)
    {
        value = pValue;
    }

    public String toString()
    {
        return Integer.toString(this.value);
    }

    public int execute() {
        return this.value;
    }
}
