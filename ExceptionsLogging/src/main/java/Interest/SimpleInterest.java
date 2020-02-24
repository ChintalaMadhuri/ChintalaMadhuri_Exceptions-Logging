package Interest;
import java.util.logging.Level; 
import java.util.logging.Logger;
import java.util.Scanner;
public class SimpleInterest {
	float calculate() {
		Scanner s=new Scanner(System.in);
		Logger logger = Logger.getLogger(SimpleInterest.class.getName()); 
		logger.log(Level.INFO,"enter principle amount");
		float p=s.nextFloat();
		
		logger.log(Level.INFO,"enter rate of interest");
		int r=s.nextInt();
		
		logger.log(Level.INFO,"time (in years)");
		float t=s.nextFloat();
		
		float amount=p*t*r/100;
		s.close();
		return amount;
	}
}
