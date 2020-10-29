package KlasoveData;

public enum DayOfWeek {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	
	public DayOfWeek DayOfWeek(int a) {
		
		switch(ToString(a)) {
		
		case "MONDAY":
			return MONDAY;
		case "TUESDAY":
			return TUESDAY;
		case "WEDNESDAY":
			return WEDNESDAY;
		case "THURSDAY":
			return THURSDAY;
		case "FRIDAY":
			return FRIDAY;
		case "SATURDAY":
			return SATURDAY;
		case "SUNDAY":
			return SUNDAY;
			
		
		
		}

		return null;
		
		
	}
	
	public String ToString(int a) {
		
switch(a) {
		
		case 1:
			return "MONDAY";
		case 2:
			return "TUESDAY";
		case 3:
			return "WEDNESDAY";
		case 4:
			return "THURSDAY";
		case 5:
			return "FRIDAY";
		case 6:
			return "SATURDAY";
		case 7:
			return "SUNDAY";
		
		
	}
	return "Invalid Input";
	
}
}
