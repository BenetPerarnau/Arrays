import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex3 {
/*
 * 3.- Feu un programa en Java que demani el nombre de valors que té l’array unidimensional, 
 * que carregui l’array (double), que demani una posició i que esborri (elimini) l’element que
 *  es troba en aquesta posició. Després que mostri de nou array per pantalla.
 */
	private static BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
public static void ex3() throws NumberFormatException, IOException{
	System.out.print("Valor del array => ");
	int valor=Integer.parseInt(stdin.readLine());
	double [] array=new double[valor];
	for(int i=0; i<valor; i++){
		array[i]=Math.random()*100;
		System.out.print(array[i]+"\t");
	}
	System.out.print("\nColumna del array que vols borrar => ");
	int col=Integer.parseInt(stdin.readLine());
	for(int i=0; i<valor; i++){
		if(i==col-1){}
		else System.out.print(array[i]+"\t");
	}
	System.out.println("");
}
}
