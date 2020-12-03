package com.company;

public class Begin extends Operation{
    public Begin(Node... pOps)
    {
        super(pOps);
    }

    @Override
    public int execute() {
        int resultat = 0;

        for (int i = 0; i < nbOps(); i++)
        {
            resultat = op(i).execute();
        }

        return resultat;
    }

    @Override
    public String opString() {
        return "begin";
    }
}
