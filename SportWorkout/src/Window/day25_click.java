package Window;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class day25_click implements ActionListener {

	static boolean choose = false;

	@Override
	public void actionPerformed(ActionEvent e) {
int i = 0;
		
			
			while(i <= 30) {
				
				Calender_BUTTONCLICK.days[i].setBackground(Color.getHSBColor(255, 80, 80));
				i++;
			}
		
		if(choose == false) {
		Calender_BUTTONCLICK.days[24].setBackground(Color.getHSBColor(153, 255, 153));
		choose = true;
		} else {
			Calender_BUTTONCLICK.days[24].setBackground(Color.getHSBColor(255, 80, 80));
			choose = false;
			System.out.println(choose);
			
		}
		
	}

}
