import java.util.ArrayList;

class Flight {
	private String id;
	private String source;
	private String destination;
	private double fare;
	private int totalseats;
	private int availableSeats;
	private String arrivaltime;
	private String departuretime;
	private String companyname;
	public Flight(String id, String source, String destination, double fare, int totalseats, int availableSeats,
			String arrivaltime, String departuretime, String companyname) {
		
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalseats = totalseats;
		this.availableSeats = availableSeats;
		this.arrivaltime = arrivaltime;
		this.departuretime = departuretime;
		this.companyname = companyname;
	}
	
	  
	  
	public boolean addFlight(Object obj)
	{
		if(obj instanceof Flight)
		{
			Flight f=(Flight)obj;
			return id.equals(f.id) &&  source.equals(f.source) && destination.equals(f.destination) && fare==f.fare && totalseats==f.totalseats 
			&& availableSeats==f.availableSeats &&  arrivaltime.equals(f.arrivaltime) && departuretime.equals(f.departuretime)&& 
			companyname.equals(f.companyname);	
		}
		return false;	
	}
	public void decrementseats()
	{
		availableSeats--;
	}

}
