package Window;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;







public class setup  {
	
	public static JPanel panel = new JPanel();
	public static JFrame frame = new JFrame("Workout Planer");
	
	private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	private static int x_Framesize = (int) dim.getWidth()/2;
	private static int y_Framesize = (int) dim.getHeight()/2;
	
	
	
	
	public static void create() throws IOException {
		
	
		
		
		
		frame.setSize(x_Framesize, y_Framesize);
		
		
		frame.setLocationRelativeTo(null);
		panel.setLayout(null);
		
		
		
		
		
		
		
		 File orignalImage = new File("C:\\Users\\lucas\\Downloads\\workout_zuhause.jpg");
	        rezise.resizer(orignalImage,x_Framesize,y_Framesize/2,"JPEG");
	        BufferedImage img = ImageIO.read(new File("C:\\Users\\lucas\\Downloads\\workout_zuhause_960x270.JPEG"));
	        JLabel picLabel = new JLabel(new ImageIcon(img));
	        panel.add(picLabel);
	        
		int i = 0;
		int ypos = y_Framesize/2;
		frame.add(panel);
		frame.setVisible(true);
		while(i <= ypos) {
			
			picLabel.setBounds(0, y_Framesize/2 , y_Framesize/2, x_Framesize);
			picLabel.revalidate();
			panel.revalidate();
			i++;
		}
		
		
		
		
		
		
		
	}

}
