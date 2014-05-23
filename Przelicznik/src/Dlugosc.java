
public class Dlugosc {

	int metr = 1;
	double milimetr = 0.001;
	double cal = 25.4 * milimetr;
	double yard = 0.9144;
	double milam = 1852;
	double mila = 1609.344;
	
	double metrMilimetr( int metr ){
		System.out.println("Metr na milimetr: ");
		return metr / milimetr;
	}
	
	double metrCal( double metr ){
		return metr / cal;
	}
	
	double metrYard( double metr ){
		return metr / yard;
	}
	
	double metrMilaM( double metr ){
		return metr / milam;
	}
	
	double metrMila( double metr ){
		return metr / mila;
	}
	
	double milimetrMetr( double milimetr ){
		return milimetr / metr;
	}
	
	double milimetrCal( double milimetr ){
		return milimetr / cal;
	}
	
	double milimetrMilaM( double milimetr ){
		return milimetr / milam;
	}
	
	double milimetrMila( double milimetr ){
		return milimetr / mila;
	}
	
	double calMetr( double cal ){
		return cal * this.cal / metr; 
	}
	
	double calMilimetr( double cal ){
		return cal * this.cal / milimetr;
	}
	
	double calYard( double cal ){
		return cal * this.cal / milimetr;
	}
	
	double calMilaM( double cal ){
		return cal * this.cal / milam;
	}
	
	double calMila( double cal ){
		return cal * this.cal / mila;
	}
	
	double yardMetr( double yard ){
		return yard * this.yard;
	}
	
	double yardMilimetr( double yard ){
		return yard * this.yard / milimetr;
	}
	
	double yardCal( double yard ){
		return yard * this.yard / cal;
	}
	
	double yardMilaM( double yard ){
		return yard * this.yard / milam;
	}
	
	double yardMila( double yard ){
		return yard * this.yard / mila;
	}
	
	double milaMmetr( double milam ){
		return milam * this.milam;
	}
	
	double milaMmilimetr( double milam ){
		return milam * this.milam / milimetr;
	}
	
	double milaMcal( double milam ){
		return milam * this.milam / cal;
	}
	
	double milaMyard( double milam ){
		return milam * this.milam / yard;
	}
	
	double milaMmila( double milam ){
		return milam * this.milam / mila;
	}
	
	double milaMetr( double mila ){
		return mila * this.mila;
	}
	
	double milaMilimetr( double mila ){
		return mila * this.mila / milimetr;
	}
	
	double milaCal( double mila ){
		return mila * this.mila / cal;
	}
	
	double milaYard( double mila ){
		return mila * this.mila / yard;
	}
	
	double milaMilaM( double mila ){
		return mila * this.mila / milam;
	}

}
