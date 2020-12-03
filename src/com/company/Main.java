package com.company;

public class Main {

    public static void main(String[] args) {
    	//Exercice2();
		//Exercice3();
		//Exercice4();
		Exercice5();
    }

    public static void Exercice5()
	{
		// Question 5.a
		Scalar scalarOne = new Scalar(1);
		Scalar scalarTwo = new Scalar(2);
		Scalar scalarSeven = new Scalar(7);
		Add firstAdd = new Add(scalarOne, scalarTwo);

		Echo firstEcho = new Echo(firstAdd);
		Add secondAdd = new Add(firstEcho, scalarSeven);

		//printNode(secondAdd);

		// Question 5.b
		Scalar scalarTrue = new Scalar(1);
		Scalar scalarFalse = new Scalar(0);

		Scalar scalarFirtyTwo = new Scalar(42);
		Scalar scalarSixHundred = new Scalar(666);
		If firstIf = new If(scalarTrue, scalarFirtyTwo, scalarSixHundred);
		If secondIf = new If(scalarFalse, scalarFirtyTwo, scalarSixHundred);

		//printNode(firstIf);
		//printNode(secondIf);

		//Question 5.c
		If thirdIf = new If(scalarTrue, new Begin(new Echo(new Scalar(0)), scalarFirtyTwo), scalarSixHundred);
		//printNode(thirdIf);

		//Question 5.d
		Lt firstLt = new Lt(scalarFirtyTwo, scalarSixHundred);
		//printNode(firstLt);

		//Question 5.e
		Variable secondX = new Variable("x");
		Begin secondBegin = new Begin(
				new Set(
						secondX,
						new Scalar(0)
				),
				new While(
						new Lt(
								secondX,
								new Scalar(10)
						),
						new Begin(
								new Echo(secondX),
								new Set(
										secondX,
										new Add(
												secondX,
												new Scalar(1)
										)
								)
						)
				)
		);
		printNode(secondBegin);
	}

	public static void printNode(Node pNode)
	{
		System.out.println(pNode);
		System.out.println(pNode.execute());
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
