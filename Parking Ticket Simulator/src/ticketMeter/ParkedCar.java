package ticketMeter;

public class ParkedCar {

	private String model;
	private String color;
	private String Lnum;
	private double MinParked;
	private String make;
	
	public ParkedCar(String model, String make, String color, String Lnum, Double MinParked){
		super();
		this.model = model;
		this.make = make;
		this.color = color;
		this.MinParked = MinParked;
		this.Lnum = Lnum;
	}
	
	public String getMake(){
		return make;
	}
	private void setMake(String make){
		this.make = make;		
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getLnum(){
		return Lnum;
	}
	public void setLnum(String Lnum){
		this.Lnum=Lnum;
	}
	public double getMinParked(){
		return MinParked;
	}
	public void setMinParked(double MinParked){
		this.MinParked=MinParked;
	}
	
}
