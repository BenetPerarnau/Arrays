import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex5 {
	/*
	 * 5.- Feu un programa en Java que demani la longitud de dos arrays unidimensionals llista1 llista2, 
	 * que carregui els dos arrays el primer amb números parells i el segon amb imparells, que uneixi els
	 *  dos arrays en un de sol anomenat llista i que el mostri per pantalla.
	 */
	private static BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
public static void ex5() throws NumberFormatException, IOException{
	System.out.print("Longitud Llista 1 => ");
	int val1=Integer.parseInt(stdin.readLine());
	System.out.print("Longitud Llista 2 => ");
	int val2=Integer.parseInt(stdin.readLine());
	int[] llista1=new int[val1];
	int[] llista2=new int[val2];
	for(int i=0; i<val1; i++){//parells lllista 1
		do{
		llista1[i]=(int)(Math.random()*50)*2;
		}while(llista1[i]==0);
		if(i==0)System.out.print("Llista 1 (Parells) => "+llista1[i]+" , ");
		else if(i!=0 && i!=val1-1)System.out.print(llista1[i]+" , ");
		else System.out.println(llista1[i]);
	}
	for(int i=0; i<val2; i++){//imparells llista2
		do{
		llista2[i]=(int)(Math.random()*100)*2-1;
		}while(llista2[i]==0);
		if(i==0)System.out.print("Llista 2 (Imparells) => "+llista2[i]+" , ");
		else if(i!=0 && i!=val1-1)System.out.print(llista2[i]+" , ");
		else System.out.println(llista2[i]);
	}
	int[] llista=new int[val1+val2];
	for(int i=0; i<(val1+val2); i++){
		if(i<val1){
			llista[i]=llista1[i];
		}
		else{
			llista[i]=llista2[i-val1];
		}
		if(i==0)System.out.print("LLista (LLista 1 + Lista 2) => "+llista[i]+" , ");
		else if(i!=0 && i!=val1+val2-1) System.out.print(llista[i]+" , ");
		else System.out.println(llista[i]);
	}
}
}
