package com.company;

public class Add implements Node {
    private Node left;
    private Node right;

    public Add(Node pLeft, Node pRight)
    {
        left = pLeft;
        right = pRight;
    }

    public int execute()
    {
        return this.left.execute() + this.right.execute();
    }

    public String toString()
    {
        return "(+ " + this.left.toString() + " " + this.right.toString() + ")";
    }
}
