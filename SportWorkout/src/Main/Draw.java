package Main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JPanel;




public class Draw extends JPanel{
	
	

	
	
	
	
	
	public void paintComponent(Graphics g) {
		 
		
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("trainingsdays.csv");
		Scanner scan;
		try {
			scan = new Scanner(file);
			scan.useDelimiter(";");
			while(scan.hasNext()) {
				 list.add(scan.next()); 
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int allp = list.size();
		
		int p1 = Integer.parseInt(list.get(allp-15));
		int p2 = Integer.parseInt(list.get(allp-13));
		int p3 = Integer.parseInt(list.get(allp-11));
		int p4 = Integer.parseInt(list.get(allp-9));
		int p5 = Integer.parseInt(list.get(allp-7));
		int p6 = Integer.parseInt(list.get(allp-5));
		int p7 = Integer.parseInt(list.get(allp-3));
		int p8  = Integer.parseInt(list.get(allp-1));
		
		
		p1 = p1*2;
		p2 = p2*2;
		p3 = p3*2;
		p4 = p4*2;
		p5 = p5*2;
		p6 = p6*2;
		p7 = p7*2;
		p8 = p8*2;
		
		p1 = 200 - p1;
		p2 = 200 - p2;
		p3 = 200 - p3;
		p4 = 200 - p4;
		p5 = 200 - p5;
		p6 = 200 - p6;
		p7 = 200 - p7;
		p8 = 200 - p8;
		
		 int[] xPoints = {10, 70, 130 ,190 ,250, 310, 370, 430};
		 int[] yPoints = {p1, p2, p3, p4, p5, p6, p7, p8};
		 int size = xPoints.length;
		 int i = 0;
		
		
		int Points = xPoints.length;
		
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);
		setBackground(Color.LIGHT_GRAY);
		
			
		
		
		g2d.setColor(Color.BLACK);
		g2d.setStroke(new BasicStroke(2));
		
		
		
		
		
		
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i], yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString(list.get(0).toString(), xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		g2d.setColor(Color.black);
		g2d.drawLine(xPoints[i], p1, xPoints[1], yPoints[1]);
		
		i++;	
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i]- 5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString(list.get(2).toString(), xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(xPoints[i], p2, xPoints[2], yPoints[2]);
		
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString(list.get(4).toString(), xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(xPoints[i], p3, xPoints[3], yPoints[3]);
		
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString(list.get(6).toString(), xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(xPoints[i], p4, xPoints[4], yPoints[4]);
		
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString(list.get(8).toString(), xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(xPoints[i], p5, xPoints[5], yPoints[5]);
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString(list.get(10).toString(), xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(xPoints[i], p6, xPoints[6], yPoints[6]);
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString(list.get(12).toString(), xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(xPoints[i], p7, xPoints[7], yPoints[7]);
		i++;
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString(list.get(14).toString(), xPoints[i], 400);
		
		
		
	
	
	
		
		
		
			
			
	}
	
	
	
	

}
