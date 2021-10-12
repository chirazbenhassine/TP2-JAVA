package Exercice3;

public class RacineCarre extends Expr {
	
	Expr e;

	public RacineCarre(Expr e) {
		this.e = e;
	}
	
	@Override
	public double eval() {
		return Math.sqrt(e.eval());
	}
	
	@Override
	public String toString() {
		return "\u221a(" + e.toString() + ")";}
}
