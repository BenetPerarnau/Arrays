import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex12 {
/*
 * 12.- Feu un programa en Java que prengui una taula n x m plena de caràcters i que canvií les files per les columnes.
 */
	private static BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
public static void ex12(){
	int [][] array=new int [5][5];
	for(int i=0; i<5; i++){
		for(int j=0; j<5; j++){
			array[i][j]=(int)(Math.random()*10);
			System.out.print(array[i][j]+"\t");
		}
		System.out.println("");
	}
	System.out.println("Files x columnes");
	int aux=0;
	for(int i=0; i<5; i++){
		for(int j=0; j<5; j++){
			if(j>i || i==0){
				aux=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=aux;
			}
			System.out.print(array[i][j]+"\t");
		}
		System.out.println("");
	}
}
}
