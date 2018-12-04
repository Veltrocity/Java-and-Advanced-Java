package ticketMeter;

public class ParkingTicket {
	private ParkedCar car;
	private Popo officer;
	private double fine;
	private double minutes;

	public final double BASE_FINE = 25.0;
	public final double HOURLY_FINE = 10.0;

	public ParkingTicket(ParkedCar car, Popo officer, double illegalMinutes) {
		super();
		this.car = car;
		this.officer = officer;
		this.minutes = illegalMinutes;

		calculateFine();
	}

	private void calculateFine() {

		double hours = minutes / 60.0;
		int hoursAsInt = (int) hours;

		if ((hours - hoursAsInt) > 0) {
			hoursAsInt++;
		}

		// Assign the base fine.
		fine = BASE_FINE;

		// Add the additional hourly fines.
		fine += (hoursAsInt * HOURLY_FINE);
	}

	public ParkedCar getCar() {
		return car;
	}

	public void setCar(ParkedCar car) {
		this.car = car;
	}

	public Popo getOfficer() {
		return officer;
	}

	public void setOfficer(Popo officer) {
		this.officer = officer;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	public double getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	@Override
	public String toString() {
		return "ParkingTicket [car=" + car + ", officer=" + officer
				+ ", fine=" + fine + ", minutes=" + minutes
				+ ", BASE_FINE=" + BASE_FINE + ", HOURLY_FINE="
				+ HOURLY_FINE + "]";
	}
	public static void main(String[] args) {
		ParkingTicket Ticket = new ParkingTicket();
		ParkedCar car = Ticket.newParkedCar("Toyota", "2005",
				"Green", "ABC123", 125));

		// 60 minutes of time was purchased
		Meter meter = Ticket.new Meter(60.0));

		// Officer Jack was on duty
		Popo officer = Ticket.new Popo(
				"Sargent Jack Johnson", "8909");

		ParkingTicket ticket = officer.patrol(car, meter);

		// Did the officer issue a ticket?
		if (ticket != null) {
			System.out.println(ticket);
		} else {
			System.out.println("No crimes committed!");
		}

}



}
