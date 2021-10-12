package Exercice3;
/**
 * 
 * @author chirazy
 *
 */

public class Main {


	public static void main(String[] args) {
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); //Affiche 1337.0
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); //Affiche 1664.0
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); //Affiche 2014.0
	
		Expr mult = new Multiplication (new Multiplication (new Value(10), val), add);
		System.out.println(mult);
		System.out.println(mult.eval());
		
		Expr val2 = new Value(3);
		Expr val3 = new Value(1);
		Expr racine = new RacineCarre(new Add(val2, val3));
		System.out.println(racine);
		System.out.println(racine.eval());

	}

}
