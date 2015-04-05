package com.codeforsurvival.dp.strategypattern.ex2;

import java.util.ArrayList;
import java.util.List;

public class RandomHuman extends Human {

	public RandomHuman() {
		List<HumanBehaviour> behaviours = new ArrayList<HumanBehaviour>();
		behaviours.add(new Aggressive());
		behaviours.add(new Assertive());
		this.setBehaviours(behaviours);
	}

	@Override
	public void displayName() {
		System.out.println("I am Random human.");

	}

}
