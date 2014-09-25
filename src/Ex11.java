import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex11 {
/*
 * 11.- Feu un programa en Java que:
	a) carregui una taula n x n de números enters positius.
	b) sumi per separat els elements situats a cada fila.
	c) multipliqui per separat els elements situats a cada columna.
 */
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
public static void ex11(){
	int [][] array=new int[5][5];
	int multi=1;
	for(int i=0; i<5; i++){
		for(int j=0; j<5; j++){
			array[i][j]=(int)(Math.random()*10);
			multi=multi*array[i][j];
			if(j<4){System.out.print(array[i][j]+"\t");}
			else{System.out.println(array[i][j]+"\tMultipicació fila => "+multi);}
		}
		multi=1;
	}
	int suma=0;
	for(int i=0; i<5; i++){
		for(int j=0; j<5; j++){
			suma=suma+array[j][i];
		}
		System.out.print(suma+"\t");
		suma=0;
	}
	System.out.println("Suma Columnes");
}
}
