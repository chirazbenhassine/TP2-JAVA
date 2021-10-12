package fr.dauphine.javaavance.td2;

import java.io.IOException;

public class Fille extends Mere{
//Exercice1
	/*
	 * static int meth() {
	 * return 24;
		}
	 */
//Exercice2
	void miage() {System.out.println("Miage");}

	 public void a() {System.out.println("Fille_a"); } //Redéfinition
	
	 protected void b(Fille fille) {System.out.println("Fille_b(Fille)");} //Redéfinition
	
	 public void c(Mere mere) {System.out.println("Fille_c(Mere)");}//Redéfinition //surcharge
	 void c(Fille b) {System.out.println("Fille_c(Fille)"); }//Redéfinition //surcharge
	
	 static void d() {System.out.println("static Fille_d");}//Redéfinition
	 static void d(Mere mere) {System.out.println("Fille_d(Mere)");} //surcharge
	 
	 protected void f() {System.out.println("Fille_f");}//Redéfinition
	
	 String g() {System.out.println("Fille_g"); return "c";}//Redéfinition
	
	 void j() throws IOException {System.out.println("Fille_j"); }//Redéfinition
	 void l() {System.out.println("Fille_l");}//Redéfinition
	 void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }
	
}
/*
 * Question1:
 * Les erreurs sont:
 
 La méthode e(): la méthode e() son modificateur est protected dans la classe Mere
 donc la modificateur de cette methode doit etre Protected dans la classe Fille pour éviter l'erreur de la visibilité.
 
 La méthode h(): la methode h() dans la classe fille son type de retour est différent que le type de retour de la methode h()
 dans la classe Mere. On doit respecter le type de retour lors d'héritage et de la redefinition.
 
 La methode i(): C'est la meme erreur de type de retour de la methode h(). En effet la methode i() dans la classe Mere ne retourne rien par contre 
 dans classe Fille retourne int.
 
 La méthode k(): Probléme d'exception,l'exception de la methode de la classe Fille est plus générale que l'exception de la methode k() de la classe Mere 
 
 L'appel de mereFille.miage() et mere.miage(): La methode miage() est défnie seuleument dans la classe Fille.
 mais l'appel se fait par des objets de la classe Mere dans ce cas on ne peut pas accéeder à la méthode miage().
 
 *Question3:
 Redéfibition: est la possibilité d’utiliser exactement la même méthode pour définirun objet dans une classe fille. Le type de retour de cette méthode doit être le même,
 mais la visibilité peut changer.
 
 */

