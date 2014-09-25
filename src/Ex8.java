import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex8 {
/*
 * 8.- Feu un programa en Java que carregui un array unidimensional amb números enters.
 * Després que ens demani si el volem ordenar en forma creixent o decreixent i que ho faci.
 */
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
public static void ex8() throws NumberFormatException, IOException{
	System.out.print("Dimensio del array => ");
	int dim=Integer.parseInt(stdin.readLine());
	int [] array=new int[dim];
	for(int i=0; i<dim; i++){
		array[i]=(int)(Math.random()*100);
		System.out.print(array[i]+" ");
	}
	System.out.print("\nComo quieres ordenar el array (c:Creciente d:Decreciente) C o D => ");
	char op=stdin.readLine().charAt(0);
	switch(op){
	case 'C':
		for(int i=0; i<dim; i++){
			for(int j=0; j<dim-1; j++){
				if(array[j]<array[j+1]){//no fa res
					}
				else{
					int aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
				}
			}
		for(int i=0; i<dim; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		break;
	case 'D':
		for(int i=0; i<dim; i++){
			for(int j=0; j<dim-1; j++){
				if(array[j]>array[j+1]){//no fa res
					}
				else{
					int aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
				}
			}
		for(int i=0; i<dim; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		break;
		default:
			System.out.println(" o C o D ");
			break;
	}
	
}
}
