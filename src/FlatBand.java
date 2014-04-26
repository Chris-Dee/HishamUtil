
public class FlatBand extends MOSCAP {
//34
	public static double EoxFB(double QfQit, double Xox){
		return QfQit/C.eox;
	}
	public static double VoxFB(double Xox, double QfQit){
		return -QfQit/Cox(Xox);
	}
	public static double Qsc(){
		return 0;
	}
	public static double Vsc(){
		return 0;
	}
	public static double nb(double Na){
		return C.p(C.ni,2)/Na;
	}
	public static double pb(double Na){
		return Na;
	}
}
