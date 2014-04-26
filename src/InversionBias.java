
public class InversionBias extends MOSCAP {

	public static double Qdep(double Na){
		System.out.print("Depletion region charge: ");
		return C.s( -Math.sqrt(4*C.q*C.esi*Na*phiFb(Na)));
	}
	public static double Qsc(double Na, double QfQit, double Xox, double Vgs){
		System.out.print("Space charge: ");
		return C.s( -Cox(Vgs-2*phiFb(Na)-Vfb(Na,Xox,QfQit)));
	}
//	public static double Qinv(double Na, double QfQit,double Xox,double Vgs){
//		return Qsc(Na,QfQit,Xox,Vgs)+Math.sqrt(4*C.q*C.esi*Na*phiFb(Na));
//	}
	public static double Vox(double Vgs,double Na){
		System.out.print("Voltage across the oxide: ");
		return C.s( Vgs-2*phiFb(Na)-PhiPm(Na));
	}
	public static double Eox(double Xox,double Vgs,double Na){
		System.out.print("Field across the oxide: ");
		return C.s(Vox(Vgs,Na)/Xox);
	}
	public static double Qg(double Xox,double Na,double Vgs){
		System.out.print("Charge on the gate: ");
		return C.s( Cox(Xox)*(Vgs-2*phiFb(Na)-PhiPm(Na)));
	}
	public static double Qinv(double Xox,double Vgs,double QfQit, double Na){
		System.out.print("Charge in the inversion region: ");
		return C.s(-Cox(Xox)*(Vgs-Vtn(Na,QfQit,Xox)));
	}
	}
