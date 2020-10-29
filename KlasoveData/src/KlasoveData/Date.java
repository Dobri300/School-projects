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
			
			
			return year +" "+ mounth + " "+ day+ " "+  hour + " " + min +" " + hour +" " + second;
			
			
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
