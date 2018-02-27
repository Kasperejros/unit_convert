import java.util.Scanner;

public class Main{
	
	static Scanner userInput = new Scanner(System.in);
	static String milimeterUnit = "mm";
	static String centimeterUnit = "cm";
	static String decimeterUnit = "dm";
	static String meterUnit = "m";
	static String kilometerUnit = "km";
	static Boolean isChosen = false; 
	public static void main(String[] args) {
		
		System.out.println("Wybierz rodzaj konwersji:"+"\n1. Odległości");
		
	while(isChosen == false) {
			switch (userInput.next()) {
			
				case "1": 	System.out.println("Wybrałeś 1");
							isChosen = true;
							System.out.println(isChosen);
							break;
				default: 	System.out.println("Nie ma takiej opcji");
			}
	}
		System.out.print("varDump: " + isChosen);
	}
}