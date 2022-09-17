package session2.association;

import java.util.ArrayList;
import java.util.List;

class Sportsperson
{
	private String name;

	public Sportsperson(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
class Country
{
	private String countryName;
	//Aggregation
	
	List<Sportsperson> sportsperson;

	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public List<String> getSportsperson() {
		List<Sportsperson> listSportspersons=this.sportsperson;
		List<String> names=new ArrayList<>();
		for(Sportsperson sportsperson:listSportspersons)
		{
			names.add(sportsperson.getName());
		}
		return names;
	}

	public void setSportsperson(List<Sportsperson> sportsperson) {
		this.sportsperson = sportsperson;
	}
	
}

public class AggregationDemo {

	public static void main(String[] args) {
		//Create the Sportsperson object
		Sportsperson dhoni=new Sportsperson("Dhoni");
		Sportsperson kohli=new Sportsperson("Kohli");
		Sportsperson rohit=new Sportsperson("Rohit");
		//Create a country object
		Country india=new Country("India");
		//Create a arraylist an add the sportspersons
		List<Sportsperson> listSportspersons=new ArrayList<>();
		listSportspersons.add(dhoni);
		listSportspersons.add(rohit);
		listSportspersons.add(kohli);
		//now add this list to country class
		india.setSportsperson(listSportspersons);
		//Display the has-a association (aggregation) between country and sportsperson
		System.out.println("The sports people from country "+ india.getCountryName()+ " are "+
		india.getSportsperson());

	}

}
