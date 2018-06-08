package com.codingdojo.web.models;

public class Dog extends Animal implements Pet {
	
	public Dog (String name, String breed, int weight){
		super(name, breed, weight);
	}
	
	
	public String showAffection() {
		int weight = this.getWeight();
		if (weight < 30) {
			return this.getName() + " hopped into your lap and cuddled you!";
		} else {
			return this.getName() + " curled up next to you!";
		}
	}
}
