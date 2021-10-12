package Exercice3;

public class Multiplication extends Expr {
	
	Expr[] m = new Expr[]{null, null};
	
	public Multiplication(Expr e1, Expr e2) {
		m[0] = e1;
		m[1] = e2;
	}
	
	public double eval() {
		return m[0].eval() * m[1].eval();
	}
	
	@Override
	public String toString() {
		return "(" + m[0].toString() + " * " + m[1].toString() + ")";
	}
	
}
