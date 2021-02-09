package Window;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class addtraining implements ActionListener {
	static int i = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		while(i <= 30) {
			if(Calender_BUTTONCLICK.days[i].getBackground().equals(Color.getHSBColor(153, 255, 153))) {
				
				create.safechanges.add(Calender_BUTTONCLICK.days[i].getText() + "." + Calender_BUTTONCLICK.choosebox.getSelectedItem() + ";" + Calender_BUTTONCLICK.minutes.getValue() + ";");
				
			}
			i++;
			
			
			
			
		}
		i = 0;
		
		try {
			
			int points = create.safechanges.size();
			System.out.println(points);
			ArrayList<String> list = new ArrayList<String>();
			FileWriter write = new FileWriter("trainingsdays.csv");
			Scanner scan = new Scanner("trainingsdays.csv");
			scan.useDelimiter(";");
			while(scan.hasNext()) {
				 list.add(scan.nextLine()); 
			}
			scan.close();
			while(i < points) {
				
				if(list.contains(create.safechanges.get(i))) {
					i++;
				} else {
					write.append(create.safechanges.get(i));
					i++;
				}
				
			}
			write.flush();
			write.close();
			i = 0;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println(create.safechanges);
		
		

	}

}
