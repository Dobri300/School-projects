package Events;



public class Reminder {
	
	private EventClass[] events = new EventClass[30];
	private int n = events.length;
	
	public Reminder(int _n, EventClass[] _events)
	{
		this.n = _n;
		this.events = _events;
		
	}
	
	
	public void addEvent(EventClass newEvent) {
		
		this.events[events.length+1] = newEvent;
		
	}
	
	
	public void nSet(int _n) {
		
		this.n = _n;
	}
	
	public int nGet() {
	
	return this.n;
	}
	
	
	
}
