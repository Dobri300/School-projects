package Events;

public class EventClass {

	private String date;
	private String name;
	
	
	public String dateGet() {
		
		return date;
		
	}
	public String nameGet() {
		
		return name;
		
	}
	
	public EventClass(String _date, String _name) {
		
		this.date = _date;
		this.name = _name;
		
	}
	
	
	public String toString() {

	
		return date + " - " + name;
		
		
	}
		
	
}
