import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex2 {
	/*
	 * 
2.- Feu un programa en Java que demani el nombre de valors que té l’array unidimensional, 
que carregui aquest array amb nombres enters i que demani una certa posició i un valor. 
Després que inserti aquest valor en la posició donada i que mostri de nou l’array per pantalla.

	 */
	private static BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
public static void ex2(){
	int valor=0;
	try{
	System.out.print("Nombre de valors del Array => ");
	valor=Integer.parseInt(stdin.readLine());
	}catch(Exception e){
		System.out.println("Valor incorrecto");
	}
	int [] array=new int[valor];
	for(int i=0; i<valor; i++){
		array[i]=(int)(Math.random()*100);
		System.out.print(array[i]+"\t");
	}
	System.out.println("");
	try{
	System.out.print("Posició  del array => ");
	int pos=Integer.parseInt(stdin.readLine());
	System.out.print("Introdueix un nou valor per la posició "+pos+" => ");
	int nou=Integer.parseInt(stdin.readLine());
	array[pos-1]=nou;
	}catch(Exception e){
		System.out.println("Error en el número de posició o del nou valor");
	}
	for(int i=0; i<valor; i++){
		System.out.print(array[i]+"\t");
	}
	System.out.println("");
}
}
