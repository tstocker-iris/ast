package com.company;

public class Variable extends Scalar {
    private String name;

    public Variable(String pName) {
        super(0);
        name = pName;
    }

    public String toString()
    {
        return this.name;
    }
}
