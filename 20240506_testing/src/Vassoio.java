
public class Vassoio {
	int unDato;
	boolean datoSulVassoio = false;
	
	synchronized int prendi() {
		
		if(! datoSulVassoio)
			try {
				wait();
			}catch (InterruptedException e) {};
			System.out.println("\t\tPreso:"+ unDato);
			datoSulVassoio = false;
			notify();
		return unDato;
	}
	synchronized void metti (int d) {
		if (datoSulVassoio)
			try {
				wait();
			} catch(InterruptedException e) {};
		
		unDato = d;
		datoSulVassoio = true;
		System.out.println("Depositato" + d);
		notify();
	}

}
