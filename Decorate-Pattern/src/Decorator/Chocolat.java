package Decorator;

import Boisson.Boisson;

public class Chocolat extends AbsractDecorator {

	public Chocolat(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return 0.7+boisson.cout();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription()+ " au chocolat";
	}

}
