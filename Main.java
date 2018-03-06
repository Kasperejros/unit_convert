import java.util.Scanner;

public class Main{
	
	static Scanner userInput = new Scanner(System.in);
	static String convertType;
	static String inputUnit;
	static String outputUnit;
	static double inputValue;
	static double inputMultiplier;
	static double outputMultiplier;
	static double outputValue;
	static boolean isChosen = false; 
	static boolean isValid = false;
	
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
							inputMultiplier = 0.001;
							isChosen = true;
							break;
				case "cm":	inputUnit = "cm";
							inputMultiplier = 0.01;
							isChosen = true;
							break;
				case "dm":	inputUnit = "dm";
							inputMultiplier = 0.1;
							isChosen = true;
							break;
				case "m":	inputUnit = "m";
							inputMultiplier = 1;
							isChosen = true;
							break;
				case "km":	inputUnit = "km";
							inputMultiplier = 1000;
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
							outputMultiplier = 0.001;
							isChosen = true;
							break;
				case "cm":	outputUnit = "cm";
							outputMultiplier = 0.01;
							isChosen = true;
							break;
				case "dm":	outputUnit = "dm";
							outputMultiplier = 0.1;
							isChosen = true;
							break;
				case "m":	outputUnit = "m";
							outputMultiplier = 1;
							isChosen = true;
							break;
				case "km":	outputUnit = "km";
							outputMultiplier = 1000;
							isChosen = true;
							break;
				default:	System.out.println("Podana jednostka jest nieobsługiwana");
			}
		}
		
		isChosen = false;
		System.out.println("Wybrałeś ["+outputUnit+"]. Podaj teraz wartość wejściową:");
		
		
		//Podajemy wartoś wejściową (i sprawdzamy czy jest liczbą)
		while(isValid == false) {
			if(userInput.hasNextDouble()) {
				
				inputValue = userInput.nextDouble();
				isValid = true;
				System.out.println("Podana wartość to: " + inputValue + inputUnit);
				
			} else { System.out.println("Podaj wartość liczbową"); userInput.next(); }
		}
		outputValue = Converter.Convert(inputMultiplier, outputMultiplier, inputValue);
		String formatedOutput = String.format("%.09f" , outputValue);
		System.out.println(inputValue + inputUnit + " to " + outputValue + outputUnit );
	}	
}