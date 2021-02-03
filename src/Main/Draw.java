package Main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;




public class Draw extends JPanel{
	
	

	
	
	public static int[] xPoints = {10, 70, 130 ,190 ,250, 310, 370, 430};
	public static int[] yPoints = {350, 330, 140, 60, 20, 80, 120, 90};
	private static int size = xPoints.length;
	private static int i = 0;
	
	
	
	public void paintComponent(Graphics g) {
		
		int Points = xPoints.length;
		
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);
		setBackground(Color.LIGHT_GRAY);
		
			
		
		
		g2d.setColor(Color.BLACK);
		g2d.setStroke(new BasicStroke(2));
		g2d.drawPolyline(xPoints, yPoints, Points);
		
		
		
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i], yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString("06.12", xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		i++;	
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i]- 5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString("06.12", xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString("06.12", xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString("06.12", xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString("06.12", xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString("06.12", xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		i++;
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString("06.12", xPoints[i], 400);
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		i++;
		g2d.setColor(Color.green);
		g2d.drawLine(xPoints[i], yPoints[i], xPoints[i], 400);
		g2d.setColor(Color.red);
		g2d.drawRect(xPoints[i] -5, yPoints[i] - 5, 10, 10);
		g2d.setColor(Color.BLACK);
		g2d.drawString("06.12", xPoints[i], 400);
		
		
	
	
	
		
		
		
			
			
	}
	
	
	
	

}
