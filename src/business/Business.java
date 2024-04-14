package business;

public class Business {

	 public static double calculateErlangC(double traffic, int servers, double averageServiceTime) {
	        double rho = traffic / (servers * averageServiceTime);

	        double sum = 0;
	        double factorial = 1;

	        for (int i = 0; i < servers; i++) {
	            factorial *= i > 0 ? i : 1;
	            sum += Math.pow(rho, i) / factorial;
	        }

	        double denominator = factorial + (Math.pow(servers * rho, servers) / (factorial * (servers - rho)));

	        return Math.pow(rho, servers) / denominator * 100;
	    }
}
