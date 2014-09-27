import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class Ex15 {
/*
 * 15.- En un cert crèdit de CFGS tenim una llista numerada de 25 persones amb el número de llista, 
 * les qualificacions de conceptes (60%), les qualificacions de procediments (30%) i les qualificacions d’actituds (10%).
Feu un programa en Java que carregui de cada alumne/a les qualificacions i que doni la qualificació final en forma 
quantitativa (amb dos decimals) i qualitativa (E, N, B, S, I) i que mostri totes les dades per pantalla.
 */
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
public static void ex15(){
	System.out.println("Taula de qualificacions del alumnes: ");
	System.out.println("Alumne\tConeptes (60%)\tProcediments (30%)\tActitud (10%)\tFinal");
	int c=0, p=0, a=0;
	float f=0;
	DecimalFormat df=new DecimalFormat("0.00");
	for(int i=0; i<25; i++){
		c=(int)(Math.random()*11);
	    p=(int)(Math.random()*11);
		a=(int)(Math.random()*11);
		f=(float)(((float)c*0.6)+((float)p*0.3)+((float)a*0.1));
		char l=' ';
		if(f>=9){
			l='E';
		}else if(f>=7){
			l='N';
		}else if(f>=6){
			l='B';
		}else if(f>=5){
			l='S';
		}else{
			l='I';
		}
		System.out.println((i+1)+"\t"+c+"\t\t"+p+"\t\t\t"+a+"\t\t"+df.format(f)+" => "+l);
	}
}

}
