package com.codeforsurvival.dp.strategypattern.ex1;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuck();
	}

}
