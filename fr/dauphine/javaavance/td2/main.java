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
Le main affiche "42,42,24,24,24,24".L'objet fille est de type FilleExercice1 désigne une instance de classe FilleExercice1.La classe FilleExercice1 contient une redefinition 
de la methode meth(), donc dans le main on fait l'appel à cette méthode.
L'objet mereFille est de type MereExercice1 désigne une instance de classe FilleExercice1 c'est à dire la référence et l'objet mereFille ne sont pas de même type,
mais c'est la meme affichage de l'objet fille, c'est à dire dans le main on fait l'appel aux methodes de classe FilleExercice1. C'est grâce à l'héritage et au polymorphisme,
une seule et même méthode peut être utilisée pour plusieurs objets de types différents.

*Question2:
Un objet de type FilleExercice1 aura accès dans la classe FilleExercice1 à deux méthode meth(),
la méthode qu'est dans la classe FilleExercice1, et la méthode qu'est dans la classe Mère en utilisant le mot-clé "super".
Par contre dans la classe MainExercice1, l'objet n'aura accès qu'à une seule méthode meth(), qu'est dans la classe FilleExercice1.

*Question3:
Le main affiche "42", "42", "24","42", "42", "42", lors de l'appel de la méthode printMeth(),on a toujours l'affichage de 42
car la methode printMeth() est dans la classe MereExercice1 fait l'appel à la methode Meth() qu'est dans la classe MereExercice1.
En effet,les objets MereExercice1 et mereFille sont de type MereExercice1 affiche 42 et l'objet fille est de type FilleExercice1 affiche 24.

*Question4:
C'est la meme affichage que la question 3, et meme explication.
*/
	
