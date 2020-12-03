package com.company;

public class Set extends Operation {

    public Set(Variable pVar, Node pNode)
    {
        super(pVar, pNode);
    }

    @Override
    public int execute() {
        Variable first = (Variable) op(0);
        Node second = op(1);

        first.set(second.execute());
        return first.get();
    }

    @Override
    public String opString() {
        return "set!";
    }
}
