package com.codeforsurvival.dp.strategypattern.ex1;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.setFlyBehaviour(new FlyNoWay());
		this.setQuackBehaviour(new Quack());
	}

	@Override
	public void display() {
		System.out.println("This is mallard duck");

	}

}
