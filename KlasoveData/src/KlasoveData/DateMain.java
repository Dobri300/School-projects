package KlasoveData;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date(10,34,4,6,5,2014);
		//Date e = new Date(19,14,4,20,9,2018);
		
		
		
		
		
		
		Event event = new Event("Ime", d);
		
		System.out.println("The Name is: " + event.GetName());
		System.out.println("The Date is: " + event.GetDate());
		
		event.ToString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		d.GodinaCheck();
		d.SekIncrease();
		d.SedmicaCount();
		
		if(d.compareTo(e) == 1) {
			
			System.out.println("Tekushtata godina");
			
		}
		
	if(d.compareTo(e) == -1) {
			
			System.out.println("Podadenata godina");
			
		}
		
		
	}
*/
	
		
		
		
	}
}
