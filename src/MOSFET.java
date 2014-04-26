
public class MOSFET {

	public static double Vtn(double VBS, double Na,double Xox, double QfQit) {
		
		double phifb = MOSCAP.phiFb(Na);
		double result = MOSCAP.Vfb(Na,Xox,QfQit) + 2*phifb + (1/MOSCAP.Cox(Xox)) * Math.sqrt(2*C.q*C.esi*Na*((2*phifb)-VBS));
		System.out.print("The MOSFET threshold voltage due to V_BS is: ");
		return C.s(result);
	}
	
	public static double vtn0(double Na,double Xox, double QfQit){
		double result = Vtn(0, Na, Xox, QfQit);
		System.out.print("The MOSFET threshold voltage at V_BS=0 is: ");
		return C.s(result);
	}
	
	public static double gammaBn(double Na, double Xox){
		double result = Math.sqrt(2*C.q*C.esi*Na) / MOSCAP.Cox(Xox);
		System.out.print("The bulk body effect coefficient for the MOSFET is: ");
		return C.s(result);
	}
	
	public static double VDsat(double VGS, double VBS, double Na,double Xox, double QfQit){
		double result = VGS - Vtn(VBS, Na, Xox, QfQit);
		System.out.print("The drain voltage at saturation VDsat is: ");
		return C.s(result);
	}
	
}
