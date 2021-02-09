package Window;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class day1_click implements ActionListener {
	
	static boolean choose = false;

	
	@Override
	public void actionPerformed(ActionEvent e) {
		int i = 0;
		
		if(choose == false) {
			
			while(i <= 30) {
				
				Calender_BUTTONCLICK.days[i].setBackground(Color.getHSBColor(255, 80, 80));
				i++;
			}
			
			
		Calender_BUTTONCLICK.days[0].setBackground(Color.getHSBColor(153, 255, 153));
		choose = true;
		} else {
			Calender_BUTTONCLICK.days[0].setBackground(Color.getHSBColor(255, 80, 80));
			choose = false;
			System.out.println(choose);
			
		}
		
	}

}
