import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex10 {
/*
 * 10.- Feu un programa en Java que demani el número de files i de columnes d’una taula i que la carregui
 *  amb números parells consecutius. 
 *  Després que:
	a) Mostri la taula per pantalla.
	b) Demani un valor de la taula, que canviï aquest valor per un 0 i que torni a mostrar la taula. 
	c) Demani una fila i una columna i que canviï el valor que està en aquella fila i columna per un 0 
	   i que torni a mostrar la taula.
 */
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
public static void ex10() throws NumberFormatException, IOException{
	System.out.print("Nº Filas => ");
	int f=Integer.parseInt(stdin.readLine());
	System.out.print("Nº de columnes => ");
	int c=Integer.parseInt(stdin.readLine());
	int[][] array=new int[f][c];
	int cont=2;
	for(int i=0; i<f; i++){
		for(int j=0; j<c; j++){
			array[i][j]=cont;
			cont=cont+2;
			System.out.print(array[i][j]+"\t");
		}
		System.out.println("");
	}
	System.out.print("Valor de la taula => ");
	int val=Integer.parseInt(stdin.readLine());
	for(int i=0; i<f; i++){
		for(int j=0; j<c; j++){
			if(array[i][j]==val){array[i][j]=0;}
			System.out.print(array[i][j]+"\t");
		}
		System.out.println("");
	}
	System.out.print("Fila => ");
	 int fil=Integer.parseInt(stdin.readLine())-1;
	System.out.print("Columna => ");
	int col=Integer.parseInt(stdin.readLine())-1;
	array[fil][col]=0;
	for(int i=0; i<f; i++){
		for(int j=0; j<c; j++){
			System.out.print(array[i][j]+"\t");
		}
		System.out.println("");
	}
	
}
}
