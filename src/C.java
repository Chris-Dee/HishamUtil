
public class C {

public static double q=1.612177*EE(-19);	
public static double kb=8.617385*EE(-5);
public static double mo=9.909389*EE(-28);
public static double eo=8.854187*EE(-14);
public static double esi=11.7*eo;
public static double eox=3.9*eo;
public static double Navo=6.022136*EE(23);
public static double eV=1.602177*EE(-19);
public static double h=6.626*EE(-34); //in joules. slide 1.5
public static double hbar=1.054572*EE(-34);
public static double kbtq=0.02585;
public static double latticeSi=5.4037; //in angstroms. rest are on 1.6
public static double ni=1.07*EE(10);
public static double mndos=1.090;
public static double exp(double arg){
	return p(Math.E,arg);
}
public static double EE(double sci){
	return p(10,sci);
}
public static double p(double num, double othNum){
	return Math.pow(num,othNum);
}
}
