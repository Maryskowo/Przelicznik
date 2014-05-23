
public class Objetosc {

	int litr;
	double metrsz = 0.001;
	double kwaterka = 0.25;
	double galon = 4.5456;
	
	double litrMetrsz( double litr ){
		return litr / metrsz;
	}
	
	double litrKwaterka( double litr ){
		return litr / kwaterka;
	}
	
	double litrGalon( double litr ){
		return litr / galon;
	}
	
	double metrszLitr( double metrsz ){
		return metrsz / this.metrsz;
	}
	
	double metrszKwaterka( double metrsz ){
		return metrsz * this.metrsz / kwaterka;
	}
	
	double metrszGalon( double metrsz ){
		return metrsz * this.metrsz / galon;
	}
	
	double kwaterkaLitr( double kwaterka ){
		return kwaterka * this.kwaterka;
	}
	
	double kwaterkaMetrsz( double kwaterka ){
		return kwaterka * this.kwaterka / metrsz; 
	}
	
	double kwaterkaGalon( double kwaterka ){
		return kwaterka * this.kwaterka / galon;
	}
	
	double galonLitr( double galon ){
		return galon * this.galon;
	}
	
	double galonMetrsz( double galon ){
		return galon * this.galon / metrsz;
	}
	
	double galonKwaterka( double galon ){
		return kwaterka * this.kwaterka / kwaterka;
	}

}
