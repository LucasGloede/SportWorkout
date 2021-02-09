package Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class monthchoose_CLICK implements ActionListener {
	
	static Calender_BUTTONCLICK cal = new Calender_BUTTONCLICK();
	static int i = 0;

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		String month = (String) Calender_BUTTONCLICK.choosebox.getSelectedItem();
		
		if(month == "Januar") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(true);
			
			
			
		}
		
		if(month == "Februar" ) {
			
			
			cal.days[28].setVisible(false);
			cal.days[29].setVisible(false);
			cal.days[30].setVisible(false);
		}
		

		if(month == "März") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(true);
		}
		
		if(month == "April") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(false);
		}
		
		if(month == "Mai") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(true);
		}
		
		if(month == "Juni") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(false);
			
		}
		
		if(month == "Juli") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(true);
			
		}
		
		if(month == "August") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(true);
			
		}
		
		if(month == "September") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(false);
			
		}
		
		if(month == "Oktober") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(true);
			
		}
		
		if(month == "November") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(false);
			
		}
		
		if(month == "Dezember") {
			cal.days[28].setVisible(true);
			cal.days[29].setVisible(true);
			cal.days[30].setVisible(true);
			
		}
		
		

		
	}

}
