
public class InversionBias extends MOSCAP {

	public static double Qdep(double Na){
		return -Math.sqrt(4*C.q*C.esi*Na*phiFb(Na));
	}
	public static double Qsc(double Na, double QfQit, double Xox, double Vgs){
		return -Cox(Vgs-2*phiFb(Na)-Vfb(Na,Xox,QfQit));
	}
//	public static double Qinv(double Na, double QfQit,double Xox,double Vgs){
//		return Qsc(Na,QfQit,Xox,Vgs)+Math.sqrt(4*C.q*C.esi*Na*phiFb(Na));
//	}
	public static double Vox(double Vgs,double Na){
		return Vgs-2*phiFb(Na)-PhiPm(Na);
	}
	public static double Eox(double Xox,double Vgs,double Na){
		return Vox(Vgs,Na)/Xox;
	}
	public static double Qg(double Xox,double Na,double Vgs){
		return Cox(Xox)*(Vgs-2*phiFb(Na)-PhiPm(Na));
	}
	public static double Qinv(double Xox,double Vgs,double QfQit, double Na){
		return -Cox(Xox)*(Vgs-Vtn(Na,QfQit,Xox));
	}
	}
