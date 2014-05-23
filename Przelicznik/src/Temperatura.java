
public class Temperatura {

	double kelvin;
	double celsjusz;
	double fh = 32 + (9/5 * celsjusz);
	
	double kelvinCelsjusz( double kelvin ){
		return kelvin - 273.15;
	}
	
	double kelvinFH( double kelvin ){
		return 9/5 * kelvin - 459.67 ;
	}
	
	double celcjuszKelvin( double celsjusz ){
		return celsjusz + 273.15;
	}
	
	double celcjuszFH( double celsjusz ){
		return 9/5 * celsjusz + 32;
	}
	
	double fhKelvin( double fh ){
		return (fh-32) / 1.8;
	}
	
	double fhCelsjusz( double fh ){
		return (fh + 459.67) * 5/9;
	}
}
