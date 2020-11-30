package com.company;

public class Main {

    public static void main(String[] args) {
	    Scalar scalarOne = new Scalar(1);
	    Scalar scalarTwo = new Scalar(2);

	    Add add = new Add(scalarOne, scalarTwo);
	    System.out.println(add.execute());
	    System.out.println(add);
    }
}
