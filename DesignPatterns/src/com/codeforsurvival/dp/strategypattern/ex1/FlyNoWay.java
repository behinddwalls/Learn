package com.codeforsurvival.dp.strategypattern.ex1;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Don't fly");
	}

}
