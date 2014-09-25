import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex7 {
/*
 * 7.- Feu un programa en Java que carregui un array unidimensional amb números reals i que digui si està ordenat 
 * en forma creixent (de més petit a més gran) o en forma decreixent (de més gran a més petit).
 * En cas contrari que també ho digui.
 */
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
public static void ex7() throws NumberFormatException, IOException{
	System.out.print("Dimensió del array => ");
	int dim=Integer.parseInt(stdin.readLine());
	int[] array=new int[dim];
	for(int i=0; i<dim; i++){
		array[i]=(int)(Math.random()*10);
		System.out.print(array[i]+" , ");
	}
	boolean creixent=true;
	boolean decre=true;
	for(int i=0; i<dim-1; i++){
		if(array[i]>array[i+1]){creixent=false;}
		if(array[i]<array[i+1]){decre=false;}
	}
	if(creixent==true){System.out.println("El array esta ordenat de forma creixent");}
	else if(decre==true){System.out.println("El array esta ordenat de forma decreixent");}
	else{System.out.println("El array no segueix cap patro de ordre");}
	
}
}
