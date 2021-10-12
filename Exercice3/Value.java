package Exercice3;

public class Value extends Expr{
	double val;
	
	public Value(double val) {
		this.val = val;
	}
	
	public double eval() {
		return val;
	}
	
	@Override
	public String toString() {
		return String.valueOf(val);
	}

}
