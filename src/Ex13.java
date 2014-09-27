import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;


public class Ex13 {
/*
 * 13.- Feu un programa en Java que carregui un tauler d’escacs amb els caràcters blanc B o negre N. Després que:
		a) Demani una posició del tauler i que digui si hi ha un quadre blanc o un de negre.
		b)Si al primer quadre posen una moneda d’un cèntim d’euro, al segon dues, al tercer 
		  quatre i així successivament, quants diners tindrem en total?
 */
	private static BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
public static void ex13(){
	char[][] taula=new char[8][8];
	for(int i=0; i<taula.length; i++){
		for(int j=0; j<8; j++){
			if((i+j)%2==0){taula[i][j]='B';}
			else{taula[i][j]='N';}
			if(j==0)System.out.print("|"+taula[i][j]+"|");
			else System.out.print(taula[i][j]+"|");
		}
		System.out.println("");
	}
	
		byte fil=0, colum=0;
		boolean correcte=false;
		do{
			try{
			System.out.print("Introduce una fila => ");
			fil=Byte.parseByte(stdin.readLine());
			System.out.print("Introduce una columna => ");
			colum=Byte.parseByte(stdin.readLine());
			correcte=true;
			}catch(Exception e){
				System.out.println("Valor fuera de rango");
				correcte=false;
			}
		}while(fil<0 || fil>8 || colum<0 || colum>8 || correcte==false);
		System.out.println("La casilla es de color => "+taula[fil][colum]);
}
}
