
public class Ilosc {

	double ilosc;
	double kopa = 60;
	double tuzin = 12;
	double mendel= 15;
	
	
	double iloscKopa( double ilosc ){
		return ilosc / kopa;
	}
	
	double iloscTuzin( double iloscn ){
		return ilosc / tuzin;
	}
	
	double iloscMendel( double ilosc ){
		return ilosc / mendel;
	}
	
	double kopaIlosc( double kopa ){
		return kopa * this.kopa;
	}
	
	double kopaTuzin( double kopa ){
		return kopa * this.kopa / tuzin;
	}
	
	double kopaMendel( double kopa ){
		return kopa * this.kopa / mendel;
	}
	
	double mendelIlosc( double mendel ){
		return mendel * this.mendel;
	}
	
	double mendelKopa( double mendel ){
		return mendel * this.mendel / kopa;
	}
	
	double mendelTuzin( double mendel ){
		return mendel * this.mendel / tuzin;
	}
	
}
