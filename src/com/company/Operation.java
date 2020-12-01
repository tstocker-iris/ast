package com.company;

public abstract class Operation implements Node {
    private Node[] ops;

    public Operation(Node... pOps)
    {
        ops = pOps;
    }

    public Node op(int i)
    {
        return this.ops[i];
    }

    public int nbOps()
    {
        return this.ops.length;
    }


    public String toString()
    {
        String toStringResult = "("+opString()+" ";

        for (int i = 0; i < nbOps(); i++)
        {
            toStringResult += op(i) + " ";
        }

        toStringResult += ")";

        return toStringResult;
    }

    public abstract String opString();
}
