package fr.dauphine.javaavance.td2;
//Exercice2
public class main{
 public static void main(String[] args) throws Exception {
 Mere mere=new Mere();
 Mere mereFille=new Fille();
 Fille fille=new Fille();


 fille.miage();
 
 ((Fille)mereFille).miage();

 mere.a();
 mereFille.a();
 fille.a();
 ((Mere)mereFille).a();
 mereFille.b(null);

 mereFille.c();
 mereFille.c(mere);
 mereFille.c(mereFille);
 mereFille.c(fille);
 fille.c(fille);

 mere.d();
 mereFille.d();

 mere.printF();
 mereFille.printF();
 mereFille.j();
 mereFille.k();
 mereFille.l();
 mereFille.m();
}
}

//Exercice1

/*public class main {

	public static void main(String[] args) {
		Mere mere = new Mere();
		System.out.println(mere.meth()); 
		mere.printMeth();
		
		Fille fille = new Fille();
		System.out.println(fille.meth());
		fille.printMeth();
		
		Mere mereFille = new Fille();
		System.out.println(mereFille.meth());
		mereFille.printMeth();
		}
}
*Question1:
Le main affiche "42,42,24,24,24,24".L'objet fille est de type FilleExercice1 d�signe une instance de classe FilleExercice1.La classe FilleExercice1 contient une redefinition 
de la methode meth(), donc dans le main on fait l'appel � cette m�thode.
L'objet mereFille est de type MereExercice1 d�signe une instance de classe FilleExercice1 c'est � dire la r�f�rence et l'objet mereFille ne sont pas de m�me type,
mais c'est la meme affichage de l'objet fille, c'est � dire dans le main on fait l'appel aux methodes de classe FilleExercice1. C'est gr�ce � l'h�ritage et au polymorphisme,
une seule et m�me m�thode peut �tre utilis�e pour plusieurs objets de types diff�rents.

*Question2:
Un objet de type FilleExercice1 aura acc�s dans la classe FilleExercice1 � deux m�thode meth(),
la m�thode qu'est dans la classe FilleExercice1, et la m�thode qu'est dans la classe M�re en utilisant le mot-cl� "super".
Par contre dans la classe MainExercice1, l'objet n'aura acc�s qu'� une seule m�thode meth(), qu'est dans la classe FilleExercice1.

*Question3:
Le main affiche "42", "42", "24","42", "42", "42", lors de l'appel de la m�thode printMeth(),on a toujours l'affichage de 42
car la methode printMeth() est dans la classe MereExercice1 fait l'appel � la methode Meth() qu'est dans la classe MereExercice1.
En effet,les objets MereExercice1 et mereFille sont de type MereExercice1 affiche 42 et l'objet fille est de type FilleExercice1 affiche 24.

*Question4:
C'est la meme affichage que la question 3, et meme explication.
*/
	
