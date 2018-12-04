// Programmer: Austin Castellino
//Class: CompSci 75 TTh
//Assignment #8 Parking Ticket Simulator
//Due: 11/19/2015
//Explore the uses of 2D Arrays
//Calculates parking a parking ticket fine



package ticketMeter;

public class ParkingTicketSim {

	public static void main(String[] args) {
				ParkingTicket parkingTicket = new ParkingTicket(null, null, 0);
				ParkedCar car = parkingTicket.new ParkedCar("Toyota", "2005",
						"Green", "ABC123", 125);

				// 60 minutes of time was purchased
				Meter meter = parkingTicket.new Meter(60.0);

				// Officer Jack was on duty
				Popo officer = parkingTicket.new Popo(
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
