package Decorator;

import Boisson.Boisson;

public abstract class AbsractDecorator extends Boisson {
	protected Boisson boisson;

	public AbsractDecorator(Boisson boisson) {
		super();
		this.boisson = boisson;
	}
	
	public abstract String getDescription();
	

}
