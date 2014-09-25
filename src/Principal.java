import java.io.IOException;


public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		byte op=1;
		do{
			op=Menu.menu();
			switch(op){
			case 0:
				System.out.println("Dew");
				break;
			case 1:
				Ex1.ex1();
				break;
			case 2:
				Ex2.ex2();
				break;
			case 3:
				Ex3.ex3();
				break;
			case 4:
				Ex4.ex4();
				break;
			case 5:
				Ex5.ex5();
				break;
			case 6: 
				Ex6.ex6();
				break;
			case 7:
				Ex7.ex7();
				break;
			case 8:
				Ex8.ex8();
				break;
			case 9:
				Ex9.ex9();
				break;
			case 10:
				Ex10.ex10();
				break;
			case 11:
				Ex11.ex11();
				break;
			case 12:
				Ex12.ex12();
				break;
				default:
					System.out.println("pasar por caja");
					break;
			}
		}while(op!=0);

	}

}
