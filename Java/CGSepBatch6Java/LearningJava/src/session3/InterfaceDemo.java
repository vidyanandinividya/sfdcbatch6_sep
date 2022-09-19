package session3;

public class InterfaceDemo {
	private static FlighManager flighManager=new FlighManager();
	public static void main(String[] args) {
		loadVendor();
		System.out.println("Get All Flights");
		for(FlightService fs:flighManager.getListVendors())
		{
			
			fs.getAllFlight();
		}
		System.out.println("Do booking");
		for(FlightService fs:flighManager.getListVendors())
		{
			fs.doBooking();
		}
		
	}
	public static void loadVendor()
	{
		
		flighManager.addVendor(new AirIndia());
		flighManager.addVendor(new Indigo());
	}

}
