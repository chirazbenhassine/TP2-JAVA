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

	 public void a() {System.out.println("Fille_a"); } //Red�finition
	
	 protected void b(Fille fille) {System.out.println("Fille_b(Fille)");} //Red�finition
	
	 public void c(Mere mere) {System.out.println("Fille_c(Mere)");}//Red�finition //surcharge
	 void c(Fille b) {System.out.println("Fille_c(Fille)"); }//Red�finition //surcharge
	
	 static void d() {System.out.println("static Fille_d");}//Red�finition
	 static void d(Mere mere) {System.out.println("Fille_d(Mere)");} //surcharge
	 
	 protected void f() {System.out.println("Fille_f");}//Red�finition
	
	 String g() {System.out.println("Fille_g"); return "c";}//Red�finition
	
	 void j() throws IOException {System.out.println("Fille_j"); }//Red�finition
	 void l() {System.out.println("Fille_l");}//Red�finition
	 void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }
	
}
/*
 * Question1:
 * Les erreurs sont:
 
 La m�thode e(): la m�thode e() son modificateur est protected dans la classe Mere
 donc la modificateur de cette methode doit etre Protected dans la classe Fille pour �viter l'erreur de la visibilit�.
 
 La m�thode h(): la methode h() dans la classe fille son type de retour est diff�rent que le type de retour de la methode h()
 dans la classe Mere. On doit respecter le type de retour lors d'h�ritage et de la redefinition.
 
 La methode i(): C'est la meme erreur de type de retour de la methode h(). En effet la methode i() dans la classe Mere ne retourne rien par contre 
 dans classe Fille retourne int.
 
 La m�thode k(): Probl�me d'exception,l'exception de la methode de la classe Fille est plus g�n�rale que l'exception de la methode k() de la classe Mere 
 
 L'appel de mereFille.miage() et mere.miage(): La methode miage() est d�fnie seuleument dans la classe Fille.
 mais l'appel se fait par des objets de la classe Mere dans ce cas on ne peut pas acc�eder � la m�thode miage().
 
 *Question3:
 Red�fibition: est la possibilit� d�utiliser exactement la m�me m�thode pour d�finirun objet dans une classe fille. Le type de retour de cette m�thode doit �tre le m�me,
 mais la visibilit� peut changer.
 
 */

