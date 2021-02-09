package Window;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class minuteschange implements ChangeListener {

	@Override
	public void stateChanged(ChangeEvent e) {
		
		
		String changed = Integer.toString(Calender_BUTTONCLICK.minutes.getValue());
		Calender_BUTTONCLICK.minutestext.setText(changed);	
		
		
		
	}

}
