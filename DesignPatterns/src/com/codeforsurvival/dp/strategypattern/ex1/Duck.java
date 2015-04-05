package com.codeforsurvival.dp.strategypattern.ex1;

public abstract class Duck {

	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;

	public abstract void display();

	public void swim() {
		System.out.println("Swimming");
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuck() {
		quackBehaviour.quack();
	}

	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
