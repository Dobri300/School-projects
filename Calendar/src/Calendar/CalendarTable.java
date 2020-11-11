package Calendar;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarTable {
	
	
	public static void main(String[] args) {

		int xDistance = 200;
		int yDistance = 50;
		int dayNumber = 1;
		
		JFrame calendar = new JFrame();
		calendar.setBounds(400, 300 ,800,600);
		calendar.setVisible(true);
		calendar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calendar.setLayout(null);
		JLabel MondayLabel = new JLabel("Monday");
		MondayLabel.setBounds(20,20,90,20);
		calendar.add(MondayLabel);
		//
		JLabel TuesdayLabel = new JLabel("Tuesday");
		TuesdayLabel.setBounds(100,20,90,20);
		calendar.add(TuesdayLabel);
		//
		JLabel WednesdayLabel = new JLabel("Wednesday");
		WednesdayLabel.setBounds(200,20,90,20);
		calendar.add(WednesdayLabel);
		//
		JLabel ThursdayLabel = new JLabel("Thursday");
		ThursdayLabel.setBounds(300,20,90,20);
		calendar.add(ThursdayLabel);
		//
		JLabel FridayLabel = new JLabel(" Friday");
		 FridayLabel.setBounds(400,20,90,20);
		calendar.add( FridayLabel);
		//
		JLabel SaturdayLabel = new JLabel("Saturday");
		SaturdayLabel.setBounds(500,20,90,20);
		calendar.add(SaturdayLabel);
		//
		JLabel SundayLabel = new JLabel("Sunday");
		SundayLabel.setBounds(600,20,90,20);
		calendar.add(SundayLabel);
		
		
		JPanel[] days = new JPanel[31];
		JLabel currDay[] = new JLabel[31];
		JLabel dayText[] = new JLabel [31];
		for (int i = 0; i < days.length; i++) {
			currDay[i] = new JLabel(Integer.toString(i+1)); 
			currDay[i].setBounds(xDistance+10,yDistance-35,100,100);
			calendar.add(currDay[i]);
			
			
			dayText[i] = new JLabel("text"); 
			dayText[i].setBounds(xDistance+20,yDistance,100,100);
			calendar.add(dayText[i]);
			
			days[i] = new JPanel();
			days[i].setBounds(xDistance,yDistance, 90,90);
			calendar.add(days[i]);
			days[i].setBackground(Color.YELLOW);
			
		
			
			
			
			xDistance = xDistance + 100;
			if(xDistance >= 610) {
				xDistance=0;
				yDistance +=100;
				
			}
		}



		
		
		
		
	}

}
