
public class MOSCAP {
public static double PhiPm(double Na){
	return -0.51165-C.kbtq*Math.log(Na/C.ni);
}
public static double phiFb(double Na){
	return C.kbtq*Math.log(Na/C.ni);
}
public static double Cox(double Xox){
	return C.esi/Xox;
}
public static double EoxFB(double QfQit, double Xox){
	return QfQit/C.eox;
}
public static double VoxFB(double Xox, double QfQit){
	return -QfQit/Cox(Xox);
}
public static double Vfb(double Na,double Xox, double QfQit){
	return PhiPm(Na)-QfQit/Cox(Xox);
}
public static double Vtn(double Na, double QfQit, double Xox){
	return Vfb(Na,Xox,QfQit)+2*phiFb(Na)+Math.sqrt(2*C.q*C.esi*Na*phiFb(Na))/Cox(Xox);
}
public static double VSC(double Na){
	return 2*phiFb(Na);
}
}
