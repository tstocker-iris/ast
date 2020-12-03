package com.company;

public class Lt extends Operation{

    public Lt(Node pFirstNode, Node pSecondNode)
    {
        super(pFirstNode, pSecondNode);
    }

    @Override
    public int execute() {
        if (op(0).execute() < op(1).execute()) {
            return 1;
        }

        return 0;
    }

    @Override
    public String opString() {
        return "<";
    }
}
