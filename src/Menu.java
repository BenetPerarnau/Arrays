import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Menu {
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
public static byte menu(){
	byte op=-1;
	System.out.println("1.- Feu un programa en Java que demani el nombre de dades amb les quals es vol treballar (n), que les carregui en un array unidimensional real x i que:a) un cop introduïdes les dades les visualitzi per pantalla.b) calculi la mitjana, el valor més gran i el valor més petit de l’array.c) digui quins elements es troben per sobre i per sota de la mitjana.");
	System.out.println("2.- Feu un programa en Java que demani el nombre de valors que té l’array unidimensional, que carregui aquest array amb nombres enters i que demani una certa posició i un valor. Després que inserti aquest valor en la posició donada i que mostri de nou l’array per pantalla.");
	System.out.println("3.- Feu un programa en Java que demani el nombre de valors que té l’array unidimensional, que carregui l’array (double), que demani una posició i que esborri (elimini) l’element que es troba en aquesta posició. Després que mostri de nou array per pantalla.");
	System.out.println("4.- Feu un programa en Java que carregui un array unidimensional amb enters, que demani un valor i que escrigui la posició en la qual es troba aquest valor a dins d’aquest array i en cas que no hi sigui el valor que ho digui.");
	System.out.println("5.- Feu un programa en Java que demani la longitud de dos arrays unidimensionals llista1 llista2, que carregui els dos arrays el primer amb números parells i el segon amb imparells, que uneixi els dos arrays en un de sol anomenat llista i que el mostri per pantalla.");
	System.out.println("6.- Feu un programa en Java que carregui dos arrays reals unidimensionals i una posició i que faci un nou array on inserti tot el segon array en la posició indicada del primer array i, a continuació d’aquest, acabi d’escriure el primer array.");
	System.out.println("7.- Feu un programa en Java que carregui un array unidimensional amb números reals i que digui si està ordenat en forma creixent (de més petit a més gran) o en forma decreixent (de més gran a més petit). En cas contrari que també ho digui.");
	System.out.println("8.- Feu un programa en Java que carregui un array unidimensional amb números enters. Després que ens demani si el volem ordenar en forma creixent o decreixent i que ho faci.");
	System.out.println("9.- Suposeu que teniu les qualificacions de dos crèdits A i B que els fan els mateixos alumnes. Feu un programa en Java que demani les notes dels dos crèdits i que digui quin o quins alumnes tenen la mateixa nota del crèdit A i del B.");
	System.out.println("10.- Feu un programa en Java que demani el número de files i de columnes d’una taula i que la carregui amb números parells consecutius. Després que:a) Mostri la taula per pantalla.b) Demani un valor de la taula, que canviï aquest valor per un 0 i que torni a mostrar la taula. c) Demani una fila i una columna i que canviï el valor que està en aquella fila i columna per un 0 i que torni a mostrar la taula.");
	System.out.println("11.- Feu un programa en Java que:a) carregui una taula n x n de números enters positius.b) sumi per separat els elements situats a cada fila.c) multipliqui per separat els elements situats a cada columna.");
	System.out.println("12.- Feu un programa en Java que prengui una taula n x m plena de caràcters i que canvií les files per les columnes.");
	System.out.println("13.- Feu un programa en Java que carregui un tauler d’escacs amb els caràcters blanc B o negre N. Després que:a) Demani una posició del tauler i que digui si hi ha un quadre blanc o un de negre.b)Si al primer quadre posen una moneda d’un cèntim d’euro, al segon dues, al tercer quatre i així successivament, quants diners tindrem en total?");
	System.out.println("14.- Feu un programa en Java que demani una taula n x n amb nombres reals i que calculi: La suma de tots els elements que es troben per sobre de cada diagonal. La suma de tots els elements que es troben per sota de cada diagonal.");
	System.out.println("15.- En un cert crèdit de CFGS tenim una llista numerada de 25 persones amb el número de llista, les qualificacions de conceptes (60%), les qualificacions de procediments (30%) i les qualificacions d’actituds (10%).Feu un programa en Java que carregui de cada alumne/a les qualificacions i que doni la qualificació final en forma quantitativa (amb dos decimals) i qualitativa (E, N, B, S, I) i que mostri totes les dades per pantalla.");
	boolean entra=true;
	do{
	try{
	System.out.print("Exercici => ");
	op=Byte.parseByte(stdin.readLine());
	entra=true;
	}catch(Exception e){
		System.out.println("No has introducido un valor válido");
		entra=false;
	}
	}while(entra==false);
	return op;
}
}
