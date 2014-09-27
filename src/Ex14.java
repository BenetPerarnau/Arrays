import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex14 {
/*
 * 14.- Feu un programa en Java que demani una taula n x n amb nombres reals i que calculi:
	 La suma de tots els elements que es troben per sobre de cada diagonal.
	 La suma de tots els elements que es troben per sota de cada diagonal.
 */
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
	public static void ex14(){
		boolean entra=true;
		int fil=0, colum=0;
		do{
			try{
				System.out.print("Dimension de las filas => ");
				fil=Integer.parseInt(stdin.readLine());
				System.out.print("Dimension de las columnas => ");
				colum=Integer.parseInt(stdin.readLine());
				
			}catch(Exception e){
				System.out.println("Valor fuera de rango");
			}
		}while(entra==false || fil<1 || colum<1 || fil!=colum);
		int [][] array=new int [fil][colum];
		for(int i=0; i<array.length; i++){
			for(int j=0; j<colum; j++){
				array[i][j]=(int)(Math.random()*101);
				System.out.print(array[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("Valores por encima de la diagonal: ");
		int suma=0;
		for(int i=0; i<array.length; i++){
			for(int j=array.length-1; j>i; j--){
				suma+=array[i][j];
				System.out.println(array[i][j]);
			}
		}
		System.out.println("Suma => "+suma);
		System.out.println("Valores por debajo de la diagonal: ");
		suma=0;
		for(int i=0; i<array.length; i++){
			for(int j=0; j<i; j++){
				suma+=array[i][j];
				System.out.println(array[i][j]);
			}
		}
		System.out.println("Suma => "+suma);
	}

}
