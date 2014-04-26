
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PNJunctions.Vbi(500*C.EE(15), 400*C.EE(17));
		//MOSFET.IDlin(5, 3, 6, 7, 8, 9, 10);
		MOSCAP.Vtn(1.2*C.EE(18),3.2*C.EE(10)*C.q,22*C.EE(-8));
		PNJunctions.Vbi(500*C.EE(15), 400*C.EE(17));
	}

}