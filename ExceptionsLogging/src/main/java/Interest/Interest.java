package Interest;
import java.util.logging.Level; 
import java.util.logging.Logger;
import java.util.Scanner;

public class Interest {
	public  Interest(){
		Scanner s=new Scanner(System.in);
		Logger logger = Logger.getLogger(Interest.class.getName()); 
		while(true) {
			try {
				logger.log(Level.INFO,"Enter choice\n1.SimpleInterest\n2.CompoundInterest");
				
				
				String choice2=s.next();
				
				int choice=Integer.parseInt(choice2);
				
				if(choice!=1&&choice!=2) {
					logger.log(Level.INFO,"...please enter valid input...");
					continue;
				}
				
				if (choice==1) {
					SimpleInterest Si=new SimpleInterest();
					
					float si=Si.calculate();
					
					logger.log(Level.INFO,"Simple Interest :"+si);
					break;
				}
				else if(choice==2) {
					CompoundInterest Ci=new CompoundInterest();
					
					double ci=Ci.calculate();
					
					logger.log(Level.INFO,"Compound Interest :"+ci);
					break;
				}
		
			}
		
			catch(Exception e) {
				logger.log(Level.INFO,"...Please enter a valid input...");
			}
		
		}
		s.close();
	}
}
