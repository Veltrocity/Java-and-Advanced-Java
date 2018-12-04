package ticketMeter;

public class Meter {
	
	private double MinsPaid;

	public Meter(double MinsPaid){
		this.MinsPaid = MinsPaid;
	}
	public double getMinsPaid(){
		return MinsPaid;
	}
	public void setMinsPaid(double MinsPaid){
		this.MinsPaid=MinsPaid;
	}
}
