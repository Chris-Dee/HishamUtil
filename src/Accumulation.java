
public class Accumulation extends MOSCAP {

	//Vgb<Vfb
	public static double Eox(double Vgb, double Na, double Nd, double Xox){
		return (Vgb-PhiPm(Na))/Xox;
	}
	public static double  Qg(double Vgb, double Xox, double Na, double Nd){
		return (Cox(Xox)*(Vgb-PhiPm(Na)));
	}
	public static double Qsc(double Xox,double Vgb, double Na, double QfQit){
		return Cox(Xox)*(Vgb-Vfb(Na,Xox,QfQit));
	}
	public static double Qg(double Xox,double Na, double Vgb){
		return Cox(Xox)*(Vgb-PhiPm(Na));
	}
}
