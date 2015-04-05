package com.codeforsurvival.dp.strategypattern.ex2;

import java.util.List;

public abstract class Human {

	private List<HumanBehaviour> behaviours;

	public abstract void displayName();

	public void tellMeYourBehaviour() {
		System.out.println("My behaviours are: ");
		for (HumanBehaviour behaviour : behaviours) {
			behaviour.tellBehaviour();
		}
	}

	public List<HumanBehaviour> getBehaviours() {
		return behaviours;
	}

	public void setBehaviours(List<HumanBehaviour> behaviours) {
		this.behaviours = behaviours;
	}
}
