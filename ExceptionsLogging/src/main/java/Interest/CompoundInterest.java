package Interest;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
public class CompoundInterest {
	double calculate() {
		Scanner s=new Scanner(System.in);
		Logger logger=Logger.getLogger(CompoundInterest.class.getName());
		logger.log(Level.INFO,"enter principle amount");
		float p=s.nextFloat();
		
		logger.log(Level.INFO,"enter rate of interest");
		int r=s.nextInt();
		
		logger.log(Level.INFO,"time (in years)");
		double t=s.nextFloat();
		
		double amount=p*Math.pow(1+r/100, t);
		s.close();
		return amount;
	}
}
