
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(PNJunctions.Vbi(500*C.EE(15), 400*C.EE(17)));
		//System.out.println(MOSFET.IDlin(5, 3, 6, 7, 8, 9, 10));
		//System.out.println("yay "+MOSCAP.Vtn(1.2*C.EE(18),3.2*C.EE(10)*C.q,22*C.EE(-8)));
		//System.out.println(PNJunctions.Vbi(500*C.EE(15), 400*C.EE(17)));
		
		//Physics.gc(2*C.kb*300); //needs integration...
		
		//double delta_Emin = 4.605170186*C.kb*300;
		//Physics.fFD(delta_Emin, 300);
		//Physics.Nc(300); //didn't give right value...
		
		//Physics.n_thermaleq(.34106, 300, Physics.NC_300K);
		//Physics.p_N(5.331440987525044E13);
		
		/*
		double Nd=5E15;
		Physics.n_N(Nd);
		Physics.p_N(Nd);
		System.out.println();
		double Na=2e18;
		Physics.p_P(Na);
		Physics.n_P(Na);
		System.out.println();
		Nd=2E20;
		Physics.n_N(Nd);
		Physics.p_N(Nd);
		*/
		
		Physics.rho_P(2E16);
	}
	


}
