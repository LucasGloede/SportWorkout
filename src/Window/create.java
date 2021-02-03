package Window;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Main.Draw;

public class create {


	public static JFrame frame = new JFrame("Workout Planer");
	public static JPanel panel = new JPanel();
	private static JButton calender = new JButton("Calender");
	private static JButton Workoutgraph = new JButton("Workoutgraph");
	
	
	public static boolean choosed = false;
	
	private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	private static int x_Framesize = (int) dim.getWidth()/2;
	private static int y_Framesize = (int) dim.getHeight()/2;
	
	
	public static void Window() {
		frame.setSize(x_Framesize, y_Framesize);
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		panel.setLayout(null);
		 
		
		
		Workoutgraph.setSize(x_Framesize/7, x_Framesize/20);
		Workoutgraph.setLocation((int) (x_Framesize/3), (int) (y_Framesize/3));
		Workoutgraph.addActionListener(new Workoutgraph_BUTTONCLICK());
		panel.add(Workoutgraph);
		
		calender.setSize(x_Framesize/7, x_Framesize/20);
		calender.setLocation((int) (x_Framesize/2), (int) (y_Framesize/3));
		calender.addActionListener(new Calender_BUTTONCLICK());
		panel.add(calender);
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
	public static void refresh() {
		Draw draw = new Draw();
		frame.repaint();
		panel.repaint();
		frame.revalidate();
		draw.revalidate();
		draw.repaint();
		
		if(choosed = true) {
			frame.remove(panel);
			frame.add(draw);
			
			draw.revalidate();
			
			choosed = false;
		}
		
		
	}
	
	
	
	

}
