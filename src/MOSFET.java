
public class MOSFET {

	public static double Vtn(double VBS, double Na,double Xox, double QfQit) {
		
		double phifb = MOSCAP.phiFb(Na);
		double result = MOSCAP.Vfb(Na,Xox,QfQit) + 2*phifb + (1/MOSCAP.Cox(Xox)) * Math.sqrt(2*C.q*C.esi*Na*((2*phifb)-VBS));
		System.out.print("The MOSFET threshold voltage due to V_BS is: ");
		return C.s(result);
	}
	
	public static double vtn0(double Na,double Xox, double QfQit){
		double result = Vtn(0, Na, Xox, QfQit);
		System.out.print("The MOSFET threshold voltage at V_BS=0 is (V): ");
		return C.s(result);
	}
	
	public static double gammaBn(double Na, double Xox){
		double result = Math.sqrt(2*C.q*C.esi*Na) / MOSCAP.Cox(Xox);
		System.out.print("The bulk body effect coefficient for the MOSFET is: ");
		return C.s(result);
	}
	
	public static double VDsat(double VGS, double VBS, double Na,double Xox, double QfQit){
		double vtn = Vtn(VBS, Na, Xox, QfQit);
		double result = VGS - vtn;
		if(VGS<=vtn){
			System.out.println("BTW, this NMOSFET is OFF and I_D_off = 0 A.");
		}
		else{
			System.out.println("BTW, this NMOSFET is ON, If V_DS < VDsat, linear range, else saturation range.");
		}
		System.out.print("The drain voltage at saturation VDsat is (V): ");
		return C.s(result);
	}
	
	public static double Kn(double mu, double W, double L, double Xox){
		double result = mu * MOSCAP.Cox(Xox) * (W/L);
		System.out.print("K_n for the MOSFET is: ");
		return C.s(result);
	}
	
	public static double IDlin(double Kn, double VDS, double VGS, double VBS, double Na,double Xox, double QfQit){
		double vtn = Vtn(VBS, Na, Xox, QfQit);
		double result = Kn*(((VGS-vtn)*VDS) - 0.5*(C.p(VDS, 2)));
		System.out.print("The drain current in the linear range for the MOSFET is (A): ");
		return C.s(result);
	}
	
	public static double IDsat(){
		return 0;
	}
	
}
