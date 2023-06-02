package Decorator;

import Boisson.Boisson;

public class Vanille extends AbsractDecorator {

	public Vanille(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return 0.9+boisson.cout();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription()+ " au vanille";
	}

}
