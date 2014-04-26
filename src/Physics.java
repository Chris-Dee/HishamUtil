public class Physics {
	public static double gc(double E, double Ec) { //Review 1.16
		System.out.print("Density of states in conduction band (cm^-3/eV): ");
		double h2 = C.p(C.hbarEV,2);
		double a = 1/(2*C.p(Math.PI,2));
		double b = C.p(2*C.mndos/h2, 3/2);
		double c = Math.sqrt(E-Ec);
		return C.s(a*b*c);
	}
	
	public static double gv(double E, double Ev) { //Review 1.16
		System.out.print("Density of states in valence band (cm^-3/eV): ");
		double h2 = C.p(C.hbarEV,2);
		double a = 1/(2*C.p(Math.PI,2));
		double b = C.p(2*C.mpdos/h2, 3/2);
		double c = Math.sqrt(Ev-E);
		return C.s(a*b*c);
	}
	
	public static double fFD(double E, double Ef, double T) { //Review 1.17
		System.out.print("Fermi-Dirac probability at energy E (unitless): ");
		double e = Math.exp((E-Ef)/(C.kb*T));
		return C.s(1/(1+e));
	}
	
	public static double fMB(double E, double Ef, double T) { //Review 1.18
		System.out.print("Maxwell-Boltzmann approximation of Fermi-Dirac at energy E (unitless): ");
		return C.s( Math.exp( -(E-Ef)/(C.kb*T) ) );
	}
	
	public static double n_thermaleq(double Ec, double Ef, double T, double Nc) { //Review 1.20
		double prob = fMB(Ec, Ef, T);
		System.out.print("Electron concentration at thermal equilibrium (cm^-3): ");
		return C.s(Nc*prob);
	}
	
	public static double Nc(double T) { //Review 1.20 (other eqn on 1.22)
		double a = 2*Math.PI*C.mndos*C.kb*T;
		double h3 = Math.pow(C.hEV, 3);
		System.out.print("Conduction-band effective density of states: ");
		return C.s(2*Math.pow(a, 3/2)/h3);
	}
	
	public static double p_thermaleq(double Ef, double Ev, double T, double Nv) { //Review 1.21
		double prob = Math.exp( -(Ef-Ev)/(C.kb*T) );
		System.out.print("Hole concentration at thermal equilibrium (cm^-3): ");
		return C.s(Nv*prob);
	}
	
	public static double Nv(double T) { //Review 1.21 (other eqn on 1.22)
		double a = 2*Math.PI*C.mpdos*C.kb*T;
		double h3 = Math.pow(C.hEV, 3);
		System.out.print("Valence-band effective density of states: ");
		return C.s(2*Math.pow(a, 3/2)/h3);
	}
	
	public static double n_I() { //Review 1.24
		System.out.print("Electron concentration at thermal eq in intrinsic Si (cm^-3): ");
		return C.s( C.ni );
	}
	
	public static double p_I() { //Review 1.25
		System.out.print("Hole concentration at thermal eq in intrinsic Si (cm^-3): ");
		return C.s( C.ni );
	}
	
	public static double p_P(double Na) { //Review 1.31
		System.out.print("Hole concentration at thermal eq in p-Si (cm^-3): ");
		return C.s(Na);
	}
	
	public static double n_P(double Na) { //Review 1.31
		System.out.print("Electron concentration at thermal eq in p-Si (cm^-3): ");
		return C.s( Math.pow(C.ni,2) / Na );
	}
	
	public static double n_N(double Nd) { //Review 1.31
		System.out.print("Electron concentration at thermal eq in n-Si (cm^-3): ");
		return C.s(Nd);
	}
	
	public static double p_N(double Nd) { //Review 1.31
		System.out.print("Hole concentration at thermal eq in p-Si (cm^-3): ");
		return C.s( Math.pow(C.ni,2) / Nd );
	}
	
	// Electron RMS velocity, l_col, t_col - Review 1.36
	
	public static double u_pP(double Na) { //Review 1.42
		double denom = 1 + Math.pow( Na/(1.6*C.EE(17)), .70 );
		System.out.print("Low-field hole mobility in p-Si (cm^2/(V*s): ");
		return C.s(49.7 + (418.3/denom));
	}
	
	public static double u_nP(double Na) { //Review 1.42
		double denom = 1 + Math.pow( Na/(8.0*C.EE(16)), .90 );
		System.out.print("Low-field electron mobility in p-Si (cm^2/(V*s): ");
		return C.s(232 + (1180/denom));
	}
	
	public static double u_nN(double Nd) { //Review 1.43
		double denom = 1 + Math.pow( Nd/(1.3*C.EE(17)), .91 );
		System.out.print("Low-field electron mobility in n-Si (cm^2/(V*s): ");
		return C.s(92 + (1268/denom));
	}
	
	public static double u_pN(double Nd) { //Review 1.42
		double denom = 1 + Math.pow( Nd/(8.0*C.EE(17)), 1.25 );
		System.out.print("Low-field hole mobility in n-Si (cm^2/(V*s): ");
		return C.s(130 + (370/denom));
	}
	
	
	////start at 1.44 -> drift current density
}
