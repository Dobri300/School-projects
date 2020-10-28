package KlasoveData;




public class Date {
		public int sek;
		public int min;
		public int chas;
		public int den;
		public int mesec;
		public int godina;
		

		public Date (int sekk,int minn, int chass, int denn,int mesecc, int godinaa) {
			DateSet(sekk,minn, chass, denn,mesecc,godinaa);
			
		}
		// tozi konstruktor go napravih i slojih vutre SetterMethod da se izpulnqva, koito setter method otdolu sum inicializiral
		
		
		public void GodinaCheck() {
			
			if(godina%4 == 0) {
				System.out.println("Visokosna e!");
				
			}else{
				
				System.out.println("Ne e visokosna!");
				
			}
			
		}
		
		
		public void SekIncrease() {
			
			sek++;
			
		}
		
		public void SedmicaCount() {
			
		System.out.println("Tolkova sedmici -->  " + mesec*4+den/7+chas/(24*7)+min/(60*24*7)+sek/(60*60*24*7));
			
		}
		
		public void DateSet(int sekk,int minn, int chass, int denn,int mesecc, int godinaa) {
			
			sek = sekk;
			min = minn;
			chas = chass;
			den = denn;
			mesec = mesecc;
			godina = godinaa;
			
		}
	
	
		public int sekGet() {
			
		return sek;
		}
		
		public int minGet() {
			
		return min;
		}
		
		public int chasGet() {
			
		return chas;
		}
		
		public int denGet() {
			
		return den;
		}
		
		public int mesecGet() {
			
		return mesec;
		}
		
		public int godinaGet() {
			
		return godina;
		}
		
		
		public int compareTo(Date a) {
			
			
			if(godina >a.godina) {
				return 1;
				
			}else if(godina == a.godina){
				
				if(mesec > a.mesec) {
					return 1;
					
				}else if(mesec == a.mesec){
					
					if(den >a.den) {
						
						return 1;
					}else if(den == a.den){
						
						if(chas >a.chas) {
							
							
							return 1;
						}else if (chas == a.chas){
							
							if(min > a.min) {
								
								return 1;
							}else if(min == a.min){
								
								if(sek > a.sek) {
									
									return 1;
								}else if (sek == a.sek){
									
									return 0;
								}
							}
						}
					}
					
				}
				
			}
		
			////
			if(godina <a.godina) {
				return -1;
				
			}else if(godina == a.godina){
				
				if(mesec < a.mesec) {
					return -1;
					
				}else if(mesec == a.mesec){
					
					if(den <a.den) {
						
						return -1;
					}else if(den == a.den){
						
						if(chas <a.chas) {
							
							
							return -1;
						}else if (chas == a.chas){
							
							if(min < a.min) {
								
								return -1;
							}else if(min == a.min){
								
								if(sek < a.sek) {
									
									return -1;
								}else if (sek == a.sek){
									
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
