
public class ThresholdMOSCAP extends MOSCAP {
	public static double Vtn(double Na,double QfQit,double Xox){
		return Vfb(Na,Xox,QfQit)+2*phiFb(Na)+Math.sqrt(2*C.q*C.esi*Na*phiFb(Na))/Cox(Xox);
	}
	public static double VSC(double Na){
		return 2*phiFb(Na);
	}
	public static double Wd (double Na){
		return Math.sqrt(4*C.esi*phiFb(Na)/(C.q*Na));
	}
	public static double Qsc(double Na){
		return -Math.sqrt(4*C.q*C.esi*Na*phiFb(Na));
	}
	public static double Qg(double Na,double QfQit){
		return Math.sqrt(4*C.q*C.esi*Na*phiFb(Na))-QfQit;
	}
	public static double Eox(double Na, double QfQit){
		return Qg(Na,QfQit)/C.eox;
	}
	public static double Vox(double Xox, double Na, double QfQit){
		return Eox(Na,QfQit)*Xox;
	}
}
