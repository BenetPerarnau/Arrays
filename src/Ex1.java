import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex1 {
	/*
	 * 
1.- Feu un programa en Java que demani el nombre de dades amb les quals es vol treballar (n), 
	que les carregui en un array unidimensional real x i que:
	a) un cop introduïdes les dades les visualitzi per pantalla.
	b) calculi la mitjana, el valor més gran i el valor més petit de l’array.
	c) digui quins elements es troben per sobre i per sota de la mitjana.

	 */
	private static BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
public static void ex1(){
	int num=0;
	try{
	System.out.print("Nombre de dades que vols tractar => ");
	num=Integer.parseInt(stdin.readLine());
	}catch(Exception e){
		System.out.println("Valor no valido");
	}
	int [] array=new int[num];
	for(int i=0; i<num; i++){//introduir dades
		try{
		System.out.print("Valor "+(i+1)+" => ");
		array[i]=Integer.parseInt(stdin.readLine());
		}catch(Exception e){
			System.out.println("Valor no valido");
		}
	}
	for(int i=0; i<num; i++){//veure dades
		if(i!=num-1){System.out.print(array[i]+",");}
		else{System.out.println(array[i]+"");}
	}
	int petit=100, gran=0, suma=0;
	for(int i=0; i<num; i++){//calculs
		if(array[i]>gran)gran=array[i];
		if(array[i]<petit)petit=array[i];
		suma=suma+array[i];
	}
	
	System.out.println("Més gran => "+gran);
	System.out.println("Més petit => "+petit);
	System.out.println("Mitjana => "+(suma/num));
	for(int i=0; i<num; i++){//calul sobre sota mitjana
		if(array[i]<(suma/num)){System.out.println(array[i]+" esta per sota la mitjana");}
		else if(array[i]==(suma/num)){System.out.println(array[i]+" es = que la mitjana");}
		else{System.out.println(array[i]+" esta per sobre la mitjana");}
	}
}
}
