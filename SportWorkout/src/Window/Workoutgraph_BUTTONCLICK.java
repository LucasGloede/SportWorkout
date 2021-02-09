package Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Main.Draw;

public class Workoutgraph_BUTTONCLICK implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		create.choosed = true;
		create.refresh();

	}

}
