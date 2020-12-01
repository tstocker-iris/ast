package com.company;

public class Neg extends Operation {

    public Neg(Node... ops)
    {
        super(ops);
    }

    @Override
    public int execute() {
        int resultat = 0;

        for (int i = 0; i < nbOps(); i++)
        {
            resultat -= op(i).execute();
        }

        return resultat;
    }

    @Override
    public String opString() {
        return "-";
    }
}
