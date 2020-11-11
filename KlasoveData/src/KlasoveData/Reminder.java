package KlasoveData;


public class Reminder {
	
	private Event[] events = new Event[30];
	private int n = events.length;
	
	public Reminder(int _n, Event[] _events)
	{
		this.n = _n;
		this.events = _events;
		
	}
	
	
	public void addEvent(Event newEvent) {
		
		this.events[events.length+1] = newEvent;
		
	}
	
	
	public void nSet(int _n) {
		
		this.n = _n;
	}
	
	public int nGet() {
	
	return this.n;
	}
	
	
	
}
