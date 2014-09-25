import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex9 {
/*
 * 9.- Suposeu que teniu les qualificacions de dos crèdits A i B que els fan els mateixos alumnes.
 * Feu un programa en Java que demani les notes dels dos crèdits i que digui quin o quins alumnes 
 * tenen la mateixa nota del crèdit A i del B.
 */
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
public static void ex9(){
	int[] array1=new int[30];
	int[] array2=new int[30];
	System.out.println("Alumne\tCredit A\tCredit B");
	for(int i=0; i<30; i++){
		array1[i]=(int)(Math.random()*10);
		array2[i]=(int)(Math.random()*10);
		if(array1[i]==array2[i]){System.out.println((i+1)+"\t"+array1[i]+"\t\t"+array2[i]+"\tMateixa nota A i B");}
		else{System.out.println((i+1)+"\t"+array1[i]+"\t\t"+array2[i]);}
	}
}
}
