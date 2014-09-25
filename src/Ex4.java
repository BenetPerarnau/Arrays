import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex4 {
/*
 * 4.- Feu un programa en Java que carregui un array unidimensional amb enters, que demani un valor i que 
 * escrigui la posició en la qual es troba aquest valor a dins d’aquest array i en cas que no hi sigui el valor que ho digui.
 *
 */
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
public static void ex4() throws NumberFormatException, IOException{
	int [] array=new int[10];
	for(int i=0; i<10; i++){
		array[i]=(int)(Math.random()*100);
		System.out.print(array[i]+"\t");
	}
	System.out.print("\nValor => ");
	int val=Integer.parseInt(stdin.readLine());
	boolean encontrado=false;
	for(int i=0; i<10 && encontrado==false; i++){
		if(array[i]==val){encontrado=true; System.out.println("El valor "+val+" esta en el array en la pos "+i);}
	}
	if(encontrado==false){System.out.println("El valor "+val+" no se encuentra en el array");}
}
}
