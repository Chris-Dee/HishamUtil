
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Physics.u_pN(3.25E16);
		Physics.u_nP(4.5E17);
		Physics.L_pN(Physics.Dp(437.84, C.t),Physics.tau_recN(3.25E16));
		Physics.L_nP(Physics.Dn(437.84, C.t), Physics.tau_recP(4.5E17));
		PNJunctions.Vbi(4.5E17, 3.25E16);
		
		MOSCAP.PhiPm(2.5E16);
		Amplifiers.gmsat(120E-6, 3.69, 0.40);
		Amplifiers.Idq(120E-6, 3.69, 0.40);
		Inverter.Vol(3.3, 0.5, 250E-6, 15000);
	}
	


}
