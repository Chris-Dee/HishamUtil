
public class Amplifiers {
	
	//Neglecting Channel Length Modulation
	public static double Idq(double Kn, double Vgs, double Vtn){
		return Kn/2*Math.pow((Vgs-Vtn),2);
	}

	//Channel Length Modulation
	public static double Idq2(double Kn, double Vgs, double Vtn, double lambda, double Vds, double Vdsat){
		return Kn/2*Math.pow((Vgs-Vtn),2)*(1+lambda*(Vds-Vdsat));
	}

	//Neglecting Channel Length Modulation
	public static double gmsat(double Kn, double Vgs, double Vtn){
		return Math.sqrt(2*Kn*Idq(Kn,Vgs,Vtn));
	}

	//Channel Length Modulation
	public static double gmsat2(double Kn, double Vgs, double Vtn, double lambda, double Vds, double Vdsat){
		return Math.sqrt(2*Kn*Idq2(Kn,Vgs,Vtn,lambda,Vds,Vdsat));
	}

	public static double rosat(double Kn, double Vgs, double Vtn, double lambda, double Vds, double Vdsat){
		return 1/(lambda*Idq2(Kn,Vgs,Vtn,lambda,Vds,Vdsat));   
	}
}
