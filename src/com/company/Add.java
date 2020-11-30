package com.company;

public class Add {
    private Scalar left;
    private Scalar right;

    public Add(Scalar pLeft, Scalar pRight)
    {
        left = pLeft;
        right = pRight;
    }

    public int execute()
    {
        return this.left.get() + this.right.get();
    }

    public String toString()
    {
        return "(+ " + this.left.toString() + " " + this.right.toString() + ")";
    }
}
