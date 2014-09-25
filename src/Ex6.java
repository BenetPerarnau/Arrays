import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex6 {
	/*
	 * 6.- Feu un programa en Java que carregui dos arrays reals unidimensionals i una posició i que faci un nou array 
	 * on inserti tot el segon array en la posició indicada del primer array i, a continuació d’aquest, acabi d’escriure
	 *  el primer array.
	 */
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
public static void ex6() throws NumberFormatException, IOException{
	int[] x=new int [5];
	int[] y=new int [5];
	int[] array=new int [10];
	for(int i=0; i<5; i++){
		x[i]=(int)(Math.random()*100);
		y[i]=(int)(Math.random()*100);
	}
	for(int i=0; i<5; i++){
		if(i==0){System.out.print("Array x => "+x[i]+" , ");}
		else if(i!=0 && i!=4){System.out.print(x[i]+" , ");}
		else{System.out.println(x[i]);}
	}
	for(int i=0; i<5; i++){
		if(i==0){System.out.print("Array y => "+y[i]+" , ");}
		else if(i!=0 && i!=4){System.out.print(y[i]+" , ");}
		else{System.out.println(y[i]);}
	}
	System.out.print("Pos del array x donde se insertara el array y => ");
	int pos=Integer.parseInt(stdin.readLine())-1;
	for(int i=0; i<10; i++){
		if(i<pos){
			array[i]=x[i];
		}
		else if(i-pos<5){
			array[i]=y[i-pos];
		}
		else{
			array[i]=x[i-5];
		}
		if(i==0)System.out.print("Array x+y => "+array[i]+" , ");
		else if(i!=0 && i<9){System.out.print(array[i]+" , ");}
		else{System.out.println(array[i]);}
	}
}
}
