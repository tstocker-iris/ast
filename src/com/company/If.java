package com.company;

public class If extends Operation {

    public If (Node pCondition, Node pIfTrue, Node pIfFalse)
    {
        super(pCondition, pIfTrue, pIfFalse);
    }

    @Override
    public int execute()
    {
        if (op(0).execute() == 0) {
            return op(2).execute();
        }

        return op(1).execute();
    }

    @Override
    public String opString() {
        return "if";
    }
}
