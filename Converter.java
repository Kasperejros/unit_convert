public class Converter{
	

	
	
	public static double Convert(double inputMultiplier , double outputMultiplier, double inputValue){
		double outputValue = 0;
		
		double input = inputValue * inputMultiplier;
		outputValue = input / outputMultiplier;
		
		
		return outputValue;
	}
}