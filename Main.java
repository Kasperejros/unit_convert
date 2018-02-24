import java.util.Scanner;

public class Main{
	
	static Scanner userInput = new Scanner(System.in);
	static String milimeterUnit = "mm";
	static String centimeterUnit = "cm";
	static String decimeterUnit = "dm";
	static String meterUnit = "m";
	static String kilometerUnit = "km";
	
	public static void main(String[] args) {
		
		System.out.println("Wybierz rodzaj konwersji:"+"\n1. Odległości");
		
		if(userInput.hasNextInt()) {
			if(userInput.nextInt()==1 ) {
				System.out.println("Wybierz jednostkę z jakiej chcesz przeliczać:" + "\n1. Metry [m]");
				if(userInput.hasNextInt() && userInput.nextInt() == 1) {
					System.out.println("Wybrałeś Metry");
				} else { System.out.println("Podaj numer wybranej opcji");}
			}
		} else { System.out.println("Podaj numer wybranej opcji");}
		
		System.out.println("koniec");
		
	}
}