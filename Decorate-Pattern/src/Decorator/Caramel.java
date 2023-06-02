package Decorator;

import Boisson.Boisson;

public class Caramel extends AbsractDecorator {

	public Caramel(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() {
		return 0.6+boisson.cout();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription()+ " au caramel";
	}

}
