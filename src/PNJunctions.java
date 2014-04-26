
public class PNJunctions {

	public static double Vbi(double Na, double Nd){
		System.out.println();
		return C.kbtq*Math.log((Na*Nd)/C.p(C.ni,2));
	}
	public static double Wd(double Na, double Nd,double Vpn){
	return Math.sqrt((2*C.esi*(Na+Nd)*(Vbi(Na,Nd)-Vpn))/(C.q*Na*Nd));
	}
	public static double Wdp(double Na, double Nd,double Vpn){
		return (Nd*Wd(Na,Nd,Vpn))/(Na+Nd);
	}
	public static double Wdn(double Na, double Nd, double Vpn){
		return(Na*Wd(Na,Nd,Vpn))/(Na+Nd);
	}
	public static double zeroField(double Na,double Nd,double Vpn){
		double E=(C.q*Na*Wdp(Na,Nd,Vpn))/C.esi;
		System.out.println("field at x=0:  "+E);
		return E;
	}
	public static void lawOfJunctionp(double Na, double Nd, double Vpn){
		double Pno=Nd/(C.p(C.ni, 2));
		System.out.println("Pno= "+Pno);
		double Npo=Na/(C.p(C.ni, 2));
		System.out.println("Npo= "+Npo);
		double Pn=Pno*C.exp((Vpn)/C.kbtq);
		System.out.println("Holes at Depletion region edge: "+Pn);
		double Np=Npo*C.exp((Vpn)/C.kbtq);
		System.out.println("Electrons at Depletion Region: "+Np);
		}
	//Add dioode current density (12 review 2)
	public static double depletionCapacitance(double Na, double Nd, double Vpn){
		return Math.sqrt((C.q*C.esi*Na*Nd)/(2*(Na+Nd)*(Vbi(Na,Nd)-Vpn)));
	}
	//other capacitances on 22. Get a lotta ugly stuff in there
}
