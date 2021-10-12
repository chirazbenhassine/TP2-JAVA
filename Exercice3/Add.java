package Exercice3;

public class Add extends Expr {
	
	Expr[] a = new Expr[]{null, null};
	
	public Add(Expr e1, Expr e2) {
		a[0] = e1;
		a[1] = e2;
	}
	
	@Override
	public double eval() {
		return a[0].eval() + a[1].eval();
	}
	
	@Override
	public String toString() {
		return "(" + a[0].toString() + " + " + a[1].toString() + ")";
	}
	

}
