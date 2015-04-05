package com.codeforsurvival.dp.strategypattern.ex2;

public class HumanSimulator {

	public static void main(final String[] args) {
		Human human = new RandomHuman();
		human.displayName();
		human.tellMeYourBehaviour();
	}
}
