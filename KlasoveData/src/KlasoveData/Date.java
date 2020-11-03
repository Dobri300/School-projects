package KlasoveData;




public class Date {
		private int second;
		private int min;
		private int hour;
		private int day;
		private int mounth;
		private int year;
		

		public Date (int sekk,int minn, int chass, int denn,int mesecc, int godinaa) {
			DateSet(sekk,minn, chass, denn,mesecc,godinaa);
			
		}

		
		
		public void GodinaCheck() {
			
			if(year%4 == 0) {
				System.out.println("Visokosna e!");
				
			}else{
				
				System.out.println("Ne e visokosna!");
				
			}
			
		}
		
		
		public void SekIncrease() {
			
			second++;
			
			if(second == 60) {
				
				second =0;
				min+=1;
				
			}
			if(min == 60) {
				
				min =0;
				hour+=1;
				
			}
			if(hour == 24) {
				
				hour =0;
				day+=1;
				
			}
			
			if(day == 30) {
				
				day =0;
				mounth+=1;
				
			}
			if(mounth == 12) {
				
				mounth =0;
				year+=1;
				
			}
			
		}
		
		public void SedmicaCount() {
			
		System.out.println("Tolkova sedmici -->  " + mounth*4+day/7+hour/(24*7)+min/(60*24*7)+second/(60*60*24*7));
			
		}
		
		public void DateSet(int sekk,int minn, int chass, int denn,int mesecc, int godinaa) {
			
			second = sekk;
			min = minn;
			hour = chass;
			day = denn;
			mounth = mesecc;
			year = godinaa;
			
		}
	
	
		public int sekGet() {
			
		return second;
		}
		
		public int minGet() {
			
		return min;
		}
		
		public int chasGet() {
			
		return hour;
		}
		
		public int denGet() {
			
		return day;
		}
		
		public int mesecGet() {
			
		return mounth;
		}
		
		public int godinaGet() {
			
		return year;
		}
		
		
		public String toString() {
			
			
			return year +" "+ mounth + " "+ day+ " "+  hour + " " + min +" " + hour +" " + second + "The day of the week is: " + DayOfWeek.constGetByNum(day);
			
			
		}
		
		public String toString(int a) {
				
				if(denGet() == 1) {
					if(a==1) {
						return "M";				
					}
					if(a==2) {
						return "Mo";					
					}
					if(a==3) {
						return "Mon";				
					}
					if(a==4) {
						return "Mond";					
					}
					if(a==5) {
						return "Monda";					
					}
					if(a==6) {
						return "Monday";					
					}
				}
				
				if(denGet() == 2) {
				
					
					if(a==1) {
						return "T";				
					}
					if(a==2) {
						return "Tu";					
					}
					if(a==3) {
						return "Tue";				
					}
					if(a==4) {
						return "Tues";					
					}
					if(a==5) {
						return "Tuesd";					
					}
					if(a==6) {
						return "Tuesda";					
					}
					if(a==7) {
						return "Tuesday";					
					}
					
					
				}
				if(denGet() == 3) {
					
					

					if(a==1) {
						return "W";				
					}
					if(a==2) {
						return "We";					
					}
					if(a==3) {
						return "Wed";				
					}
					if(a==4) {
						return "Wedn";					
					}
					if(a==5) {
						return "Wedne";					
					}
					if(a==6) {
						return "Wednes";					
					}
					if(a==7) {
						return "Wednesd";					
					}
					if(a==8) {
						return "Wednesda";					
					}
					if(a==9) {
						return "Wednesday";					
					}
					
				}
					if(denGet() == 4) {
					
					

					if(a==1) {
						return "T";				
					}
					if(a==2) {
						return "Th";					
					}
					if(a==3) {
						return "Thu";				
					}
					if(a==4) {
						return "Thur";					
					}
					if(a==5) {
						return "Thurs";					
					}
					if(a==6) {
						return "Thursd";					
					}
					if(a==7) {
						return "Thursda";					
					}
					if(a==8) {
						return "Thursday";					
					}
					
					
				}				
					if(denGet() == 5) {

						if(a==1) {
							return "F";				
						}
						if(a==2) {
							return "Fr";					
						}
						if(a==3) {
							return "Fri";				
						}
						if(a==4) {
							return "Frid";					
						}
						if(a==5) {
							return "Frida";					
						}
						if(a==6) {
							return "Friday";					
						}
					
											
					}
					if(denGet() == 6) {
						if(a==1) {
							return "S";				
						}
						if(a==2) {
							return "Sa";					
						}
						if(a==3) {
							return "Sat";				
						}
						if(a==4) {
							return "Satu";					
						}
						if(a==5) {
							return "Satur";					
						}
						if(a==6) {
							return "Saturd";					
						}
						if(a==7) {
							return "Saturda";					
						}
						if(a==8) {
							return "Saturday";					
						}				
						
					}	
					if(denGet() == 7) {
						if(a==1) {
							return "S";				
						}
						if(a==2) {
							return "Su";					
						}
						if(a==3) {
							return "Sun";				
						}
						if(a==4) {
							return "Sund";					
						}
						if(a==5) {
							return "Sunda";					
						}
						if(a==6) {
							return "Sunday";					
						}
					}	
				
					return null;
			
		}
		
		
		public DayOfWeek DateDayGetter(Date d) {
			
			
			DayOfWeek.constGetByNum(d.day);
			
			return null;
		}
		
		
		
			
		public int compareTo(Date a) {
			
			
			if(year >a.year) {
				return 1;
				
			}else if(year == a.year){
				
				if(mounth > a.mounth) {
					return 1;
					
				}else if(mounth == a.mounth){
					
					if(day >a.day) {
						
						return 1;
					}else if(day == a.day){
						
						if(hour >a.hour) {
							
							
							return 1;
						}else if (hour == a.hour){
							
							if(min > a.min) {
								
								return 1;
							}else if(min == a.min){
								
								if(second > a.second) {
									
									return 1;
								}else if (second == a.second){
									
									return 0;
								}
							}
						}
					}
					
				}
				
			}
		
			////
			if(year <a.year) {
				return -1;
				
			}else if(year == a.year){
				
				if(mounth < a.mounth) {
					return -1;
					
				}else if(mounth == a.mounth){
					
					if(day <a.day) {
						
						return -1;
					}else if(day == a.day){
						
						if(hour <a.hour) {
							
							
							return -1;
						}else if (hour == a.hour){
							
							if(min < a.min) {
								
								return -1;
							}else if(min == a.min){
								
								if(second < a.second) {
									
									return -1;
								}else if (second == a.second){
									
									return 0;
								}
							}
						}
					}
					
				}
				
			}
		return 0;
			
			
				
		}
	
}
