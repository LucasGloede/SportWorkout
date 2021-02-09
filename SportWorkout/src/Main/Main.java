package Main;

import java.io.File;
import java.io.IOException;

import Window.create;
import Window.setup;

public class Main {
	
	
	
	
		
		  public static void main(String[] args) throws IOException {
			  File file = new File("setup.csv");
			  
			  if(!file.exists()) {
				  setup.create();
			  } else {
				  create.Window();
			  }
				  
				  
				  
			  
			  
			
					
			  
			  
			  
			   
			   
				
			  
		  }
		  
		
	
		
	

}
