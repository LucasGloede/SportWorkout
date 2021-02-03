package Window;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class day25_click implements ActionListener {

	static boolean choose = false;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(choose == false) {
		Calender_BUTTONCLICK.day25.setBackground(Color.getHSBColor(153, 255, 153));
		choose = true;
		} else {
			Calender_BUTTONCLICK.day25.setBackground(Color.getHSBColor(255, 80, 80));
			choose = false;
			System.out.println(choose);
			
		}
		
	}

}
