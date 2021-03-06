package com.company;

public class Add extends Operation {
    public Add(Node... ops)
    {
        super(ops);
    }

    public int execute()
    {
        int resultat = 0;

        for (int i = 0; i < nbOps(); i++)
        {
            resultat += op(i).execute();
        }

        return resultat;
    }

    @Override
    public String opString() {
        return "+";
    }
}
