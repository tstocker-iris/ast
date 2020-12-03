package com.company;

public class Main {

    public static void main(String[] args) {
    	//Exercice2();
		//Exercice3();
		Exercice4();
    }

    public static void Exercice4()
	{
		Scalar scalarTwentyTwo = new Scalar(22);
		Variable varX = new Variable("x");
		Set set = new Set(varX, scalarTwentyTwo);
		System.out.println(set);
		System.out.println(set.execute());

		Scalar scalarTwenty = new Scalar(20);
		Add lAdd = new Add(varX, scalarTwenty);
		System.out.println(lAdd);
		System.out.println(lAdd.execute());
	}

    public static void Exercice3()
	{
		Scalar scalarThree = new Scalar(3);
		Scalar scalarFour = new Scalar(4);
		Add firstAdd = new Add(scalarThree, scalarFour);
		Neg firstNeg = new Neg(firstAdd);

		Scalar scalarOne = new Scalar(1);
		Scalar scalarTwo = new Scalar(2);
		Add secondAdd = new Add(scalarOne, scalarTwo);

		Add finalAdd = new Add(secondAdd, firstNeg);
		System.out.println(finalAdd);
		System.out.println(finalAdd.execute());
	}

    public static void Exercice2()
	{
		Scalar scalarThree = new Scalar(3);
		Scalar scalarFour = new Scalar(4);
		Add firstAdd = new Add(scalarThree, scalarFour);

		Scalar scalarOne = new Scalar(1);
		Scalar scalarTwo = new Scalar(2);
		Add secondAdd = new Add(scalarOne, scalarTwo);

		Add finalAdd = new Add(secondAdd, firstAdd);
		System.out.println(finalAdd);
		System.out.println(finalAdd.execute());
	}

    public static void Exercice1()
	{
		Scalar scalarOne = new Scalar(1);
		Scalar scalarTwo = new Scalar(2);

		Add add = new Add(scalarOne, scalarTwo);
		System.out.println(add.execute());
		System.out.println(add);
	}
}
