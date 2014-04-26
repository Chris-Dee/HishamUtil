import java.util.*;

public class Inverter {
	
	private static double Vdsat;
	
	//Drain Current In Linear Bias Range
	public static double Idlinear(double Kn,double Vin, double Vtn, double Vout){
		return Kn*((Vin-Vtn)*Vout - (1/2)*Math.pow(Vout,2));
	}
	
	//Drain Current In Saturation Bias Range
	public static double Idsat(double Kn,double Vin, double Vtn, double Vout, double lambda, double Vdsat){
		return (Kn/2)*Math.pow(Vin-Vtn,2)*(1+lambda*(Vout-Vdsat));
	}
	
	//First Equation For Vdsat
	public static double Vdsat1(double Vgs, double Vtn){
		Vdsat = Vgs- Vtn;
		return Vdsat;
	}
	
	//Second Equation for Vdsat
	public static double Vdsat2(double Vin, double Vtn){
		Vdsat = Vin - Vtn;
		return Vdsat;
	}
	
	//Equation for V output low
	public static double Vol(double Vdd, double Vtn, double Kn, double Rl){
		return (Vdd - Vtn + (1/(Kn*Rl)))- Math.sqrt(C.p((Vdd-Vtn+1/(Kn*Rl)), 2)-(2*Vdd)/(Kn*Rl));
	}
	
	//Maximum Drain Current
	public static double Iddmax(double Vdd, double Vol, double Rd){
		return (Vdd-Vol)/Rd;
	}
	
	//Maximum Power Dissipation
	public static double Pddmax(double Vdd, double Vol, double Rd){
		return Iddmax(Vdd, Vol, Rd)*Vdd;
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("Value of Vtn(V): ");
		double Vtn = s.nextDouble();
		System.out.print("Value of Vdd(V): ");
		double Vdd = s.nextDouble();
		System.out.print("Value of Rd: ");
		double Rd = s.nextDouble();
		System.out.print("Value of Kn: ");
		double Kn = s.nextDouble();
		System.out.print("Value of Vin: ");
		double Vin = s.nextDouble();
		System.out.print("Value of Vout: ");
		double Vout = s.nextDouble();
		
		if(Vin<=Vtn){
			System.out.println("Bias Range 1");
			System.out.println("Idn = 0");
			System.out.println("Voh = "+ Vdd);
		}
	}
	
}
