package com.company;

public class Echo extends Operation {

    public Echo(Node pNode)
    {
        super(pNode);
    }

    @Override
    public int execute() {
        int result = op(0).execute();

        System.out.println(result);

        return result;
    }

    @Override
    public String opString() {
        return "echo";
    }
}
