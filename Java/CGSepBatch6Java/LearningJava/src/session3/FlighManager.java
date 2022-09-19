package session3;

import java.util.ArrayList;
import java.util.List;

public class FlighManager {
	private List<FlightService> listVendors=null;
	public FlighManager()
	{
		listVendors=new ArrayList<>();
	}
	public void addVendor(FlightService fs)
	{
		this.listVendors.add(fs);
	}
	public List<FlightService> getListVendors()
	{
		return listVendors;
	}

}
