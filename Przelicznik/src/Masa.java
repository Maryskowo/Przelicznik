
public class Masa {

	double kilogram = 1;
	double gram = 0.001;
	double tona = 1000;
	double kwdoubleal = 100;
	double funt = 0.453592;
	double uncja = 28.3 / gram;
	
	double kilogramGram( double kilogram ){
		return kilogram / gram;
	}
	
	double kilogramTona( double kilogram ){
		return kilogram / tona;
	}
	
	double kilogramKwdoubleal( double kilogram ){
		return kilogram / kwdoubleal;
	}
	
	double kilogramFunt( double kilogram ){
		return kilogram / funt;
	}
	
	double kilogramUncja( double kilogram ){
		return kilogram / uncja;
	}
	
	double gramKilogram( double gram ){
		return gram * this.gram;
	}
	
	double gramTona( double gram ){
		return gram * this.gram / tona;
	}
	
	double gramKwdoubleal( double gram ){
		return gram * this.gram / kwdoubleal;
	}
	
	double gramFunt( double gram ){
		return gram * this.gram / funt;
	}
	
	double gramUncja( double gram ){
		return gram * this.gram / uncja;
	}
	
	double tonaKilogram( double tona ){
		return tona * this.tona;
	}
	
	double tonaGram( double tona ){
		return tona * this.tona / gram;
	}
	
	double tonaKwdoubleal( double tona ){
		return tona * this.tona / kwdoubleal;
	}
	
	double tonaFunt( double tona ){
		return tona * this.tona / funt;
	}
	
	double tonaUncja( double tona ){
		return tona * this.tona / uncja;
	}
	
	double kwdoublealKilogram( double kwdoubleal ){
		return kwdoubleal * this.kwdoubleal;
	}
	
	double kwdoublealGram( double kwdoubleal ){
		return kwdoubleal * this.kwdoubleal / gram;
	}
	
	double kwdoublealTona( double kwdoubleal ){
		return kwdoubleal * this.kwdoubleal / tona;
	}
	
	double kwdoublealFunt( double kwdoubleal ){
		return kwdoubleal * this.kwdoubleal / funt;
	}
	
	double kwdoublealUncja( double kwdoubleal ){
		return kwdoubleal * this.kwdoubleal / uncja;
	}
	
	double funtKilogram( double funt ){
		return funt * this.funt;
	}
	
	double funtGram( double funt ){
		return funt * this.funt / gram;
	}
	
	double funtTona( double funt ){
		return funt * this.funt / tona;
	}
	
	double funtKwdoubleal( double funt ){
		return funt * this.funt / kwdoubleal;
	}
	
	double funtUncja( double funt ){
		return funt * this.funt / uncja;
	}
	
	double uncjaKilogram( double uncja ){
		return uncja * this.uncja;
	}
	
	double uncjaGram( double uncja ){
		return uncja * this.uncja / gram;
	}
	
	double uncjaTona( double uncja ){
		return uncja * this.uncja / tona;
	}
	
	double uncjaKwdoubleal( double uncja ){
		return uncja * this.uncja / kwdoubleal;
	}
	
	double uncjaFunt( double uncja ){
		return uncja * this.uncja / funt;
	}
}
