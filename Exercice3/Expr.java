package Exercice3;

public class Expr {
	
	public double eval() {
		if ( this instanceof Value) {
			return ((Value) this).eval();
		}
		if (this instanceof Add) {
			return ((Add) this).eval();
		}
		return 0;
	}

}
