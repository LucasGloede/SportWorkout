package Window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


public class Calender_BUTTONCLICK implements ActionListener {
	
	public static JPanel panel = new JPanel();
	private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	private static int x_Framesize = (int) dim.getWidth()/2;
	private static int y_Framesize = (int) dim.getHeight()/2;
	
	
	public static JButton day1 = new JButton("01");
	public static JButton day2 = new JButton("02");
	public static JButton day3 = new JButton("03");
	public static JButton day4 = new JButton("04");
	public static JButton day5 = new JButton("05");
	public static JButton day6 = new JButton("06");
	public static JButton day7 = new JButton("07");
	public static JButton day8 = new JButton("08");
	public static JButton day9 = new JButton("09");
	public static JButton day10 = new JButton("10");
	public static JButton day11 = new JButton("11");
	public static JButton day12 = new JButton("12");
	public static JButton day13 = new JButton("13");
	public static JButton day14 = new JButton("14");
	public static JButton day15 = new JButton("15");
	public static JButton day16 = new JButton("16");
	public static JButton day17 = new JButton("17");
	public static JButton day18 = new JButton("18");
	public static JButton day19 = new JButton("19");
	public static JButton day20 = new JButton("20");
	public static JButton day21 = new JButton("21");
	public static JButton day22 = new JButton("22");
	public static JButton day23 = new JButton("23");
	public static JButton day24 = new JButton("24");
	public static JButton day25 = new JButton("25");
	public static JButton day26 = new JButton("26");
	public static JButton day27 = new JButton("27");
	public static JButton day28 = new JButton("28");
	public static JButton day29 = new JButton("29");
	public static JButton day30 = new JButton("30");
	public static JButton day31 = new JButton("31");

	
	private static String[] MonthChoose = {"Januar", "Februar", "März", "April", "Mai", "Juni", 
			"Juli", "August", "September", "Oktober", "November", "Dezember"};
	
	public static JComboBox choosebox = new JComboBox(MonthChoose);
	@Override
	public void actionPerformed(ActionEvent e)  {
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   
		   
		
		
		int tag1x = (int) Math.round(x_Framesize/30);
		int tag1y = (int) Math.round(y_Framesize/30);
		
		int tag2x = (int) Math.round(x_Framesize/11);
		int tag2y = (int) Math.round(y_Framesize/30);
		
		int tag3x = (int) Math.round(x_Framesize/6.75);
		int tag3y = (int) Math.round(y_Framesize/30);
		
		int tag4x = (int) Math.round(x_Framesize/4.87);
		int tag4y = (int) Math.round(y_Framesize/30);
		
		int tag5x = (int) Math.round(x_Framesize/3.82);
		int tag5y = (int) Math.round(y_Framesize/30);
		
		int tag6x = (int) Math.round(x_Framesize/3.15);
		int tag6y = (int) Math.round(y_Framesize/30);
		


		int tag7x = (int) Math.round(x_Framesize/30);
		int tag7y = (int) Math.round(y_Framesize/7.5);
		
		int tag8x = (int) Math.round(x_Framesize/11);
		int tag8y = (int) Math.round(y_Framesize/7.5);
		
		int tag9x = (int) Math.round(x_Framesize/6.75);
		int tag9y = (int) Math.round(y_Framesize/7.5);
		
		int tag10x = (int) Math.round(x_Framesize/4.87);
		int tag10y = (int) Math.round(y_Framesize/7.5);
		
		int tag11x = (int) Math.round(x_Framesize/3.82);
		int tag11y = (int) Math.round(y_Framesize/7.5);
		
		int tag12x = (int) Math.round(x_Framesize/3.15);
		int tag12y = (int) Math.round(y_Framesize/7.5);
		
		
		
		int tag13x = (int) Math.round(x_Framesize/30);
		int tag13y = (int) Math.round(y_Framesize/4.28);
		
		int tag14x = (int) Math.round(x_Framesize/11);
		int tag14y = (int) Math.round(y_Framesize/4.28);
		
		int tag15x = (int) Math.round(x_Framesize/6.75);
		int tag15y = (int) Math.round(y_Framesize/4.28);
		
		int tag16x = (int) Math.round(x_Framesize/4.87);
		int tag16y = (int) Math.round(y_Framesize/4.28);
		
		int tag17x = (int) Math.round(x_Framesize/3.82);
		int tag17y = (int) Math.round(y_Framesize/4.28);
		
		int tag18x = (int) Math.round(x_Framesize/3.15);
		int tag18y = (int) Math.round(y_Framesize/4.28);
		
		
		
		int tag19x = (int) Math.round(x_Framesize/30);
		int tag19y = (int) Math.round(y_Framesize/3);
		
		int tag20x = (int) Math.round(x_Framesize/11);
		int tag20y = (int) Math.round(y_Framesize/3);
		
		int tag21x = (int) Math.round(x_Framesize/6.75);
		int tag21y = (int) Math.round(y_Framesize/3);
		
		int tag22x = (int) Math.round(x_Framesize/4.87);
		int tag22y = (int) Math.round(y_Framesize/3);
		
		int tag23x = (int) Math.round(x_Framesize/3.82);
		int tag23y = (int) Math.round(y_Framesize/3);
		
		int tag24x = (int) Math.round(x_Framesize/3.15);
		int tag24y = (int) Math.round(y_Framesize/3);
		
		
		
		int tag25x = (int) Math.round(x_Framesize/30);
		int tag25y = (int) Math.round(y_Framesize/2.31);
		
		int tag26x = (int) Math.round(x_Framesize/11);
		int tag26y = (int) Math.round(y_Framesize/2.31);
		
		int tag27x = (int) Math.round(x_Framesize/6.75);
		int tag27y = (int) Math.round(y_Framesize/2.31);
		
		int tag28x = (int) Math.round(x_Framesize/4.87);
		int tag28y = (int) Math.round(y_Framesize/2.31);
		
		int tag29x = (int) Math.round(x_Framesize/3.82);
		int tag29y = (int) Math.round(y_Framesize/2.31);
		
		int tag30x = (int) Math.round(x_Framesize/3.15);
		int tag30y = (int) Math.round(y_Framesize/2.31);
		
		int tag31x = (int) Math.round(x_Framesize/5.65);
		int tag31y = (int) Math.round(y_Framesize/1.87);
		
		
		create.frame.remove(create.panel);
		panel.setLayout(null);
		
		int choosex = (int) Math.round(x_Framesize/2.6);
		int choosey = (int) Math.round(y_Framesize/30);
		
		
		choosebox.setBounds(choosex, choosey ,x_Framesize/10, y_Framesize/7);
		choosebox.addActionListener(new monthchoose_CLICK());
		panel.add(choosebox);
		
		
		
		
		day1.setBounds(tag1x, tag1y, 50, 50);
		day1.setBackground(Color.getHSBColor(255, 80, 80));
		day1.addActionListener(new day1_click());
		panel.add(day1);
		
		day2.setBounds(tag2x, tag2y, 50, 50);
		day2.setBackground(Color.getHSBColor(255, 80, 80));
		day2.addActionListener(new day2_click());
		panel.add(day2);
		
		day3.setBounds(tag3x, tag3y, 50, 50);
		day3.addActionListener(new day3_click());
		day3.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day3);
		
		day4.setBounds(tag4x, tag4y, 50, 50);
		day4.addActionListener(new day4_click());
		day4.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day4);
		
		day5.setBounds(tag5x, tag5y, 50, 50);
		day5.addActionListener(new day5_click());
		day5.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day5);
		
		day6.setBounds(tag6x, tag6y, 50, 50);
		day6.addActionListener(new day6_click());
		day6.setBackground(Color.getHSBColor(255, 80, 80));
		
		panel.add(day6);
		
		day7.setBounds(tag7x, tag7y, 50, 50);
		day7.addActionListener(new day7_click());
		day7.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day7);
		
		day8.setBounds(tag8x, tag8y, 50, 50);
		day8.addActionListener(new day8_click());
		day8.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day8);
		
		day9.setBounds(tag9x, tag9y, 50, 50);
		day9.addActionListener(new day9_click());
		day9.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day9);
		
		day10.setBounds(tag10x, tag10y, 50, 50);
		day10.addActionListener(new day10_click());
		day10.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day10);
		
		day11.setBounds(tag11x, tag11y, 50, 50);
		day11.addActionListener(new day11_click());
		day11.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day11);
		
		day12.setBounds(tag12x, tag12y, 50, 50);
		day12.addActionListener(new day12_click());
		day12.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day12);
		
		day13.setBounds(tag13x, tag13y, 50, 50);
		day13.addActionListener(new day13_click());
		day13.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day13);
		
		day14.setBounds(tag14x, tag14y, 50, 50);
		day14.addActionListener(new day14_click());
		day14.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day14);
		
		day15.setBounds(tag15x, tag15y, 50, 50);
		day15.addActionListener(new day15_click());
		day15.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day15);
		
		day16.setBounds(tag16x, tag16y, 50, 50);
		day16.addActionListener(new day16_click());
		day16.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day16);
		
		day17.setBounds(tag17x, tag17y, 50, 50);
		day17.addActionListener(new day17_click());
		day17.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day17);
		
		day18.setBounds(tag18x, tag18y, 50, 50);
		day18.addActionListener(new day18_click());
		day18.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day18);
		
		day19.setBounds(tag19x, tag19y, 50, 50);
		day19.addActionListener(new day19_click());
		day19.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day19);
		
		day20.setBounds(tag20x, tag20y, 50, 50);
		day20.addActionListener(new day20_click());
		day20.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day20);
		
		day21.setBounds(tag21x, tag21y, 50, 50);
		day21.addActionListener(new day21_click());
		day21.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day21);
		
		day22.setBounds(tag22x, tag22y, 50, 50);
		day22.addActionListener(new day22_click());
		day22.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day22);
		
		day23.setBounds(tag23x, tag23y, 50, 50);
		day23.addActionListener(new day23_click());
		day23.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day23);
		
		day24.setBounds(tag24x, tag24y, 50, 50);
		day24.addActionListener(new day24_click());
		day24.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day24);
		
		day25.setBounds(tag25x, tag25y, 50, 50);
		day25.addActionListener(new day25_click());
		day25.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day25);
		
		day26.setBounds(tag26x, tag26y, 50, 50);
		day26.addActionListener(new day26_click());
		day26.setBackground(Color.getHSBColor(255, 80, 80));
		
		panel.add(day26);
		
		day27.setBounds(tag27x, tag27y, 50, 50);
		day27.addActionListener(new day27_click());
		day27.setBackground(Color.getHSBColor(255, 80, 80));
		
		panel.add(day27);
		
		day28.setBounds(tag28x, tag28y, 50, 50);
		day28.addActionListener(new day28_click());
		day28.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day28);
		
		day29.setBounds(tag29x, tag29y, 50, 50);
		day29.addActionListener(new day29_click());
		day29.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day29);
		
		day30.setBounds(tag30x, tag30y, 50, 50);
		day30.addActionListener(new day30_click());
		day30.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day30);
		
		day31.setBounds(tag31x, tag31y, 50, 50);
		day31.addActionListener(new day31_click());
		day31.setBackground(Color.getHSBColor(255, 80, 80));
		panel.add(day31);
		
		create.frame.add(panel);
		panel.revalidate();
		
		
		   

		
	}

}
