import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	
	static Scanner userInput = new Scanner(System.in);
	static String convertType;
	static String inputUnit;
	static String outputUnit;
	static int inputValue;
	static int outputValue;
	static Boolean isChosen = false; 
	
	
	public static void main(String[] args) {
		
		System.out.println("Wybierz rodzaj konwersji:"+"\n1. Odległości:");
		
		while(isChosen == false) {
			
			switch (userInput.next()) {
				case "1": 	convertType = "Odległość";
							isChosen = true;
							break;
				default: 	System.out.println("Nie podałeś liczby, spróbuj ponownie:");
			}
		}
		
		isChosen = false;
		System.out.println("Wybrany typ konwersji to "+convertType+". Podaj teraz jednostkę wejściową:");
		
		
		//Podajemy jednostkę wejściową
		while(isChosen == false) {
			
			switch (userInput.next()) {
				case "mm":	inputUnit = "mm";
							isChosen = true;
							break;
				case "cm":	inputUnit = "cm";
							isChosen = true;
							break;
				case "m":	inputUnit = "m";
							isChosen = true;
							break;
				case "km":	inputUnit = "km";
							isChosen = true;
							break;
				default:	System.out.println("Podana jednostka jest nieobsługiwana");
			}
		}
		
		isChosen = false;
		System.out.println("Wybrałeś ["+inputUnit+"]. Podaj teraz jednostkę wyjściową:");
		
		
		//Podajemy jednostkę wyjściową
		while(isChosen == false) {
			
			switch (userInput.next()) {
				case "mm":	outputUnit = "mm";
							isChosen = true;
							break;
				case "cm":	outputUnit = "cm";
							isChosen = true;
							break;
				case "m":	outputUnit = "m";
							isChosen = true;
							break;
				case "km":	outputUnit = "km";
							isChosen = true;
							break;
				default:	System.out.println("Podana jednostka jest nieobsługiwana");
			}
		}
		
		isChosen = false;
		System.out.println("Wybrałeś ["+outputUnit+"]. Podaj teraz wartość wejściową:");
		
		do {
			try{ 
				inputValue = userInput.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Podana wartość nie jest liczbą");
			}
		} while(userInput.hasNextInt());
	}	
}