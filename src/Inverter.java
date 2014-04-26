
public class Inverter {

	//Drain Current In Linear Bias Range
	public static double Idlinear(double Kn,double Vin, double Vtn, double Vout){
		System.out.print("Drain Current in the Linear Bias Range: ");
		return C.s(Kn*((Vin-Vtn)*Vout - (1/2)*Math.pow(Vout,2)));
	}

	//Drain Current In Saturation Bias Range
	public static double Idsat(double Kn,double Vin, double Vtn, double Vout, double lambda, double Vdsat){
		System.out.print("Drain Current in the Saturation Bias Range: ");
		return C.s((Kn/2)*Math.pow(Vin-Vtn,2)*(1+lambda*(Vout-Vdsat)));
	}

	//First Equation For Vdsat
	public static double Vdsat1(double Vgs, double Vtn){
		System.out.print("Vdsat: ");
		return C.s(Vgs- Vtn);
	}

	//Second Equation for Vdsat
	public static double Vdsat2(double Vin, double Vtn){
		System.out.print("Vdsat: ");
		return C.s(Vin - Vtn);
	}

	//Equation for V output low
	public static double Vol(double Vdd, double Vtn, double Kn, double Rl){
		System.out.print("Vol (V output low): ");
		return C.s((Vdd - Vtn + (1/(Kn*Rl)))- Math.sqrt(C.p((Vdd-Vtn+1/(Kn*Rl)), 2)-(2*Vdd)/(Kn*Rl)));
	}

	//Maximum Drain Current
	public static double Iddmax(double Vdd, double Vol, double Rd){
		System.out.print("Maximum Drain Current: ");
		return C.s((Vdd-Vol)/Rd);
	}

	//Maximum Power Dissipation
	public static double Pddmax(double Vdd, double Vol, double Rd){
		System.out.print("Maximum Power Dissipation: ");
		return C.s(Iddmax(Vdd, Vol, Rd)*Vdd);
	}
	
	//Calculating Vout at Transition Point
	public static void Voutb(double Vdd, double Kn, double Rd){
		double a = (Kn*Rd)/2;
		double b = 1;
		double c = -Vdd;
		quad(a,b,c);
	}

	//Quadratic Solver and Output Formatter (Shouldn't need to ever call this)
	public static void quad(double a, double b, double c){
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		System.out.print("Vout1: ");
		System.out.println(((-1 * b) + Math.sqrt(discriminant)) / (2 * a));
		System.out.print("Vout2: ");
		System.out.print(((-1 * b) - Math.sqrt(discriminant)) / (2 * a));
	}
	
}
