package Window;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class rezise {
	
public static void resizer(File orignalImage,int width,int height,String extension) {
        
        try {
              BufferedImage origBuffImg = ImageIO.read(orignalImage);
              int type = origBuffImg.getType() == 0? BufferedImage.TYPE_INT_ARGB : origBuffImg.getType();
             
              BufferedImage resizedBuffImg = new BufferedImage(width, height, type);
              Graphics2D g = resizedBuffImg.createGraphics();
              g.drawImage(origBuffImg, 0, 0, width, height, null);
              g.dispose();
             
              String newFile = orignalImage.getAbsolutePath().substring(0,orignalImage.getAbsolutePath().lastIndexOf("."))+"_"+width+"x"+height+"."+extension;
              ImageIO.write(resizedBuffImg, extension, new File(newFile));
             
              System.out.println("File created : "+newFile);
             
        } catch (IOException e) {
              e.printStackTrace();
        }
  }

}
