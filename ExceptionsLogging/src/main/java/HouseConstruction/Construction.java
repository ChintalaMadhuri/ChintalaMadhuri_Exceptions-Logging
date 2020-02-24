package HouseConstruction;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
public class Construction {
	public Construction() {
		Scanner s=new Scanner(System.in);
		Logger logger=Logger.getLogger(Construction.class.getName());
		while(true) {
			
			try {
		
				logger.log(Level.INFO,"Enter choice of Material Type:\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
		
				String choice2=s.next();
		
				int choice=Integer.parseInt(choice2);
				
				if(choice>3 || choice<1) {
				
					logger.log(Level.INFO,"...please look at choices numbers....");
					
					continue;
				}
				String choice1="";
				
				int[] cost= {1200,1500,1800,2500};
				
				double Cost;
		
				if (choice==3) {
					logger.log(Level.INFO,"Do you want fully automated home?(yes/no):\n");
					choice1=s.next();
				}
		
				logger.log(Level.INFO,"Area of House (in square feet):");
				
				float area=s.nextFloat();
				
				if(choice==3) {
					
					if(choice1.equals("yes")) {
				
						Cost=cost[3]*area;
					}
					else 
					{
						Cost=cost[2]*area;
					}
				}
				else 
				{
					Cost=cost[choice-1]*area;
				}
		
				logger.log(Level.INFO,"Cost is needed to construct by using your wished materials:"+Cost);
		
				break;
		
			}
			catch(Exception e) {
				logger.log(Level.INFO,"...Please enter a valid choice...");
			}
		}
		s.close();
	}
}
