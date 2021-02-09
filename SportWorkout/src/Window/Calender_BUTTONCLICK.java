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
import javax.swing.JSlider;
import javax.swing.JTextField;


public class Calender_BUTTONCLICK implements ActionListener {
	
	public static JPanel panel = new JPanel();
	private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	private static int x_Framesize = (int) dim.getWidth()/2;
	private static int y_Framesize = (int) dim.getHeight()/2;
	
	
	public static JButton[] days = new JButton[31];
	
	
	
	
	public static JButton add = new JButton("Trainingseinheit hinzufügen!");
	
	public static JSlider minutes = new JSlider();
	
	public static JTextField minutestext = new JTextField("0");
	public static JTextField text = new JTextField("Dein Training hat");
	public static JTextField text2 = new JTextField("Minuten gedauert");
	
	private static String[] MonthChoose = {"Januar", "Februar", "März", "April", "Mai", "Juni", 
			"Juli", "August", "September", "Oktober", "November", "Dezember"};
	
	public static JComboBox choosebox = new JComboBox(MonthChoose);
	@Override
	public void actionPerformed(ActionEvent e)  {
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   
		   days[0] = new JButton();
		   days[1] = new JButton("1");
		   days[2] = new JButton("1");
		   days[3] = new JButton("1");
		   days[4] = new JButton("1");
		   days[5] = new JButton("1");
		   days[6] = new JButton("1");
		   days[7] = new JButton("1");
		   days[8] = new JButton("1");
		   days[9] = new JButton("1");
		   days[10] = new JButton("1");
		   days[11] = new JButton("1");
		   days[12] = new JButton("1");
		   days[13] = new JButton("1");
		   days[14] = new JButton("1");
		   days[15] = new JButton("1");
		   days[16] = new JButton("1");
		   days[17] = new JButton("1");
		   days[18] = new JButton("1");
		   days[19] = new JButton("1");
		   days[20] = new JButton("1");
		   days[21] = new JButton("1");
		   days[22] = new JButton("1");
		   days[23] = new JButton("1");
		   days[24] = new JButton("1");
		   days[25] = new JButton("1");
		   days[26] = new JButton("1");
		   days[27] = new JButton("1");
		   days[28] = new JButton("1");
		   days[29] = new JButton("1");
		   days[30] = new JButton("1");
		
		   
		
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
		
		int minutesx = (int) Math.round(x_Framesize/2.6);
		int minutesy = (int) Math.round(y_Framesize/2.8);
		
		int minutestextx = (int) Math.round(x_Framesize/1.85);
		int minutestexty = (int) Math.round(y_Framesize/3.7);
		
		int textx = (int) Math.round(x_Framesize/2.3);
		int texty = (int) Math.round(y_Framesize/3.7);
		
		int text2x = (int) Math.round(x_Framesize/1.78);
		int text2y = (int) Math.round(y_Framesize/3.7);
		
		int addx = (int) Math.round(x_Framesize/2.25);
		int addy = (int) Math.round(y_Framesize/2);
		
		choosebox.setBounds(choosex, choosey ,x_Framesize/10, y_Framesize/7);
		choosebox.addActionListener(new monthchoose_CLICK());
		panel.add(choosebox);
		
		
		
		
		days[0].setBounds(tag1x, tag1y, 50, 50);
		
		days[0].addActionListener(new day1_click());
		
		
		days[1].setBounds(tag2x, tag2y, 50, 50);
		days[1].addActionListener(new day2_click());
		
		
		days[2].setBounds(tag3x, tag3y, 50, 50);
		days[2].addActionListener(new day3_click());
		
		
		days[3].setBounds(tag4x, tag4y, 50, 50);
		days[3].addActionListener(new day4_click());
		
		
		days[4].setBounds(tag5x, tag5y, 50, 50);
		days[4].addActionListener(new day5_click());
		
		
		days[5].setBounds(tag6x, tag6y, 50, 50);
		days[5].addActionListener(new day6_click());
		
		
		days[6].setBounds(tag7x, tag7y, 50, 50);
		days[6].addActionListener(new day7_click());
		
		
		days[7].setBounds(tag8x, tag8y, 50, 50);
		days[7].addActionListener(new day8_click());
		
		days[8].setBounds(tag9x, tag9y, 50, 50);
		days[8].addActionListener(new day9_click());
		
		days[9].setBounds(tag10x, tag10y, 50, 50);
		days[9].addActionListener(new day10_click());
		
		days[10].setBounds(tag11x, tag11y, 50, 50);
		days[10].addActionListener(new day11_click());
		
		days[11].setBounds(tag12x, tag12y, 50, 50);
		days[11].addActionListener(new day12_click());
		
		days[12].setBounds(tag13x, tag13y, 50, 50);
		days[12].addActionListener(new day13_click());
		
		days[13].setBounds(tag14x, tag14y, 50, 50);
		days[13].addActionListener(new day14_click());
		
		days[14].setBounds(tag15x, tag15y, 50, 50);
		days[14].addActionListener(new day15_click());
		
		days[15].setBounds(tag16x, tag16y, 50, 50);
		days[15].addActionListener(new day16_click());
		
		days[16].setBounds(tag17x, tag17y, 50, 50);
		days[16].addActionListener(new day17_click());
		
		
		days[17].setBounds(tag18x, tag18y, 50, 50);
		days[17].addActionListener(new day18_click());
		
		
		days[18].setBounds(tag19x, tag19y, 50, 50);
		days[18].addActionListener(new day19_click());
		
		
		days[19].setBounds(tag20x, tag20y, 50, 50);
		days[19].addActionListener(new day20_click());
		
		
		days[20].setBounds(tag21x, tag21y, 50, 50);
		days[20].addActionListener(new day21_click());
		
		
		days[21].setBounds(tag22x, tag22y, 50, 50);
		days[21].addActionListener(new day22_click());
		
		
		days[22].setBounds(tag23x, tag23y, 50, 50);
		days[22].addActionListener(new day23_click());
		
		
		days[23].setBounds(tag24x, tag24y, 50, 50);
		days[23].addActionListener(new day24_click());
		
		
		days[24].setBounds(tag25x, tag25y, 50, 50);
		days[24].addActionListener(new day25_click());
		
		
		days[25].setBounds(tag26x, tag26y, 50, 50);
		days[25].addActionListener(new day26_click());
		
		
		days[26].setBounds(tag27x, tag27y, 50, 50);
		days[26].addActionListener(new day27_click());
		
		
		days[27].setBounds(tag28x, tag28y, 50, 50);
		days[27].addActionListener(new day28_click());
		
		
		days[28].setBounds(tag29x, tag29y, 50, 50);
		days[28].addActionListener(new day29_click());
		
		
		days[29].setBounds(tag30x, tag30y, 50, 50);
		days[29].addActionListener(new day30_click());
		
		
		days[30].setBounds(tag31x, tag31y, 50, 50);
		days[30].addActionListener(new day31_click());
		
		int i = 0;
		int i1 = 1;
		
		while(i < 31) {
			days[i].setText(""+ i1);
			days[i].setBackground(Color.getHSBColor(255, 80, 80));
			panel.add(days[i]);
			i++;
			i1++;
		}
		
		
		minutes.setBounds(minutesx, minutesy, 350, 50);
		minutes.setMinimum(0);
		minutes.setMaximum(60);
		minutes.setMajorTickSpacing(5);
		minutes.setMinorTickSpacing(1);
		minutes.createStandardLabels(1);
		minutes.setPaintTicks(true);
		minutes.setPaintLabels(true);
		minutes.setValue(0);
		minutes.addChangeListener(new minuteschange());
		minutes.setBorder(null);
		panel.add(minutes);
		
		
		minutestext.setBounds(minutestextx, minutestexty, 20, 25);
		minutestext.setEditable(false);
		minutestext.setBorder(null);
		panel.add(minutestext);
		
		text.setEditable(false);
		text.setBounds(textx, texty, 100, 25);
		text.setBorder(null);
		panel.add(text);
		text2.setBorder(null);
		text2.setEditable(false);
		text2.setBounds(text2x, text2y, 100, 25);
		panel.add(text2);
		
		
		add.setBounds(addx, addy, 200, 30);
		add.addActionListener(new addtraining());
		panel.add(add);
		
		
		create.frame.add(panel);
		panel.revalidate();
		
		
		   

		
	}

}
