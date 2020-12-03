package com.company;

public class While extends Operation{

    public While(Node pCondition, Node pBody) {
        super(pCondition, pBody);
    }

    @Override
    public int execute() {
        int result = 0;

        while(op(0).execute() != 0) {
            result = op(1).execute();
        }

        return result;
    }

    @Override
    public String opString() {
        return "while";
    }
}
