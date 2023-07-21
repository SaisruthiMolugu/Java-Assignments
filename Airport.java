import java.util.ArrayList;
import java.time.LocalDate;
class Airport 
{
	public static void main(String[] args)
	{
		Flight f;
		Traveller t;
  Address address;
  ArrayList<Flight> flights = new ArrayList<>();
  flights.add(new Flight("2468","Delhi","Karnataka",7900.45,35,5,"1:34","3:50","Indigo"));
  flights.add(new Flight("3555","Telanganna","goa",8900.45,35,5,"2:34","4:50","Airways"));
  flights.add(new Flight("6555","Karnataka","J&K",9900.45,35,5,"3:34","5:50","Indigo"));
  flights.add(new Flight("7555","Delhi","Kerala",5900.45,35,5,"4:34","6:50","AIrways")); 
  ArrayList<Traveller> travellers = new ArrayList<>();
  travellers.add(new Traveller("sruthi",992344567,"sai@gmail.com","2468",LocalDate.of(2022, 2, 2)));
  travellers.add(new Traveller("jaya",992344567,"jaya@gmail.com","2468",LocalDate.of(2022, 2, 2)));
  travellers.add(new Traveller("sushma",992344567,"sushma@gmail.com","2468",LocalDate.of(2022, 2, 2)));
 
  
  public ArrayList<Flight>  searchFlightBySandD(String source,String destination)
  {
	  
	if(flights.contains(sd) && flights.contains(sd))
		return flights.;
	
		
  }

  public void bookTicket(String flightId,Traveller traveller)
  {
	  
	  if(flights.contains(flightId))
	  {
		  travellers.add(new Traveller("sushma",992344567,"sushma@gmail.com","2468",LocalDate.of(2022, 2, 2)));
		 f. decrementseats();
		  
	  }
  }

  
  
  
}
}