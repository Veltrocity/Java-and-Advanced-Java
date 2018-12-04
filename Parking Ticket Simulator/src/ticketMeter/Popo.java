package ticketMeter;

public class Popo {
	private String name;
	private String badgeNum;
	
	public Popo(String name, String badgeNum){
		super();
		this.name=name;
		this.badgeNum= badgeNum;
	}
	public ParkingTicket patrol(ParkedCar car, Meter meter) {

		ParkingTicket ticket = null;

		// Calculate the total number of minutes parked over minutes
		// purchased
		double illegalMinutes = car.getMinParked()
				- meter.getMinsPaid();

		// if illegalMinutes, give ticket
		if (illegalMinutes > 0) {
			// Yes, it is illegally parked.
			ticket = new ParkingTicket(car, this, illegalMinutes);
		}

		return ticket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBadgeNum() {
		return badgeNum;
	}

	public void setBadgeNum(String badgeNum) {
		this.badgeNum = badgeNum;
	}
}

