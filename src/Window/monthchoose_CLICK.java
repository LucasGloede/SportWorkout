package Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class monthchoose_CLICK implements ActionListener {
	
	static Calender_BUTTONCLICK cal = new Calender_BUTTONCLICK();

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		String month = (String) Calender_BUTTONCLICK.choosebox.getSelectedItem();
		
		if(month == "Januar") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(true);
		}
		
		if(month == "Februar" ) {
			
			
			cal.day29.setVisible(false);
			cal.day30.setVisible(false);
			cal.day31.setVisible(false);
		}
		

		if(month == "März") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(true);
		}
		
		if(month == "April") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(false);
		}
		
		if(month == "Mai") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(true);
		}
		
		if(month == "Juni") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(false);
			
		}
		
		if(month == "Juli") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(true);
			
		}
		
		if(month == "August") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(true);
			
		}
		
		if(month == "September") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(false);
			
		}
		
		if(month == "Oktober") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(true);
			
		}
		
		if(month == "November") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(false);
			
		}
		
		if(month == "Dezember") {
			cal.day29.setVisible(true);
			cal.day30.setVisible(true);
			cal.day31.setVisible(true);
			
		}
		
		

		
	}

}
