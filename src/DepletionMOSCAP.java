
public class DepletionMOSCAP extends MOSCAP{
	public static double Vsc(double Vgs,double Na, double Xox, double QfQit){
		return Vgs-Vfb(Na,Xox,QfQit)+(C.q*C.esi*Na)/C.p(Cox(Xox), 2)
				*(1-Math.sqrt(1+(2*C.p(Cox(Xox),2)/(C.q*C.esi*Na)*(Vgs-Vfb(Na,Xox,QfQit)))));
	}
	public static double Wd(double Na, double Vgs, double Xox, double QfQit){
		return Math.sqrt((2*C.esi/(C.q*Na))*Vsc(Vgs,Na,Xox,QfQit));
	}
	public static double Qsc(double Na,double Vgs,double Xox,double QfQit){
		return -Math.sqrt(2*C.q*C.esi*Na*Vsc(Vgs,Na,Xox,QfQit));
	}
	public static double Qg(double Na,double Vgs,double Xox,double QfQit){
		return -Qsc(Na,Vgs,Xox,QfQit)-QfQit;
	} 
	public static double Eox(double Na,double Vgs,double Xox,double QfQit){
		return Qg(Na,Vgs,Xox,QfQit)/C.eox;
	}
	public static double Vox(double Na,double Vgs,double Xox,double QfQit){
	return Eox(Na,Vgs,Xox,QfQit)*Xox;	
	}
	public static double  Vgb(double Na, double Vgs, double Xox, double QfQit){
		return -Qsc(Na,Vgs,Xox,QfQit)/Cox(Xox)+Vsc(Vgs,Na,Xox,QfQit)+Vfb(Na,Xox,QfQit);
	}
	}
