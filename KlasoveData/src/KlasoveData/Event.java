package KlasoveData;

public class Event {

	private String name;
	private Date date;
		
	
	public Event(String Name, Date Date) {
		
			
		if(Date!=null) {
			this.date = Date;
		}
		if(name!=null && !name.isEmpty()) {			
			this.name = Name;			
		}	
		
				
	}

	public String GetName() {
		
		return name;	
		
	}
	
	public Date GetDate() {
		
		
		
		return date;
	}
	

	public String ToString() {
		
			
		return name + " " + date;
		
	}
	
	
}
