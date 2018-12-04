package Class;

public class FreezingBoilingPoints {
	//var used this class
	private int temperature;
	
	//what the objectis called, and what arguments it takes
	public FreezingBoilingPoints(int temp){
		temperature = temp;
	}
	//how to set the temperature
	public void setTemp(int temp){
		temperature = temp;
	}
	//get the temperature var returned
	public int getTemp(){
		return temperature;
	}
	//Check temperature against matching freezing/boiling points
	private boolean isEtyhlFreezing(){
		return (temperature <= -173);
	}
	private boolean isEtyhlBoiling(){
		return (temperature <= 172);
	}
	private boolean isOxygenFreezing(){
		return (temperature  <= -362);
	}
	private boolean isOxygenBoiling(){
		return (temperature <= -306);
	}
	private boolean isWaterFreezing(){
		return (temperature <= 32);
	}
	private boolean isWaterBoiling(){
		return (temperature <= 212);
	}
	
	//Conditionals to show what is freezing or boiling on console
	public String TempInfo(){
		 StringBuilder result = new StringBuilder();

	        if (isEtyhlFreezing()) {
	            result.append("Ethyl will freeze\n");
	            result.append("\n");
	        }

	        if (isEtyhlBoiling()) {
	            result.append("Etheyl will boil\n");
	            result.append("\n");
	        }

	        if (isOxygenFreezing()) {
	            result.append("Oxygen will freeze\n");
	            result.append("\n");
	        }

	        if (isOxygenBoiling()) {
	            result.append("Oxygen will Boil\n");
	            result.append("\n");
	        }

	        if (isWaterFreezing()) {
	            result.append("Water will freeze\n");
	            result.append("\n");
	        }

	        if (isWaterBoiling()) {
	            result.append("Water will boil\n");
	            result.append("\n");
	        }

	        return result.toString();
	    }
	}
	
