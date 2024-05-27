
public class Consumatore implements Runnable{
	
	Vassoio v;
	
	Consumatore(Vassoio unVassoio)
	{
		
		v = unVassoio;
		new Thread(this, "Consumatore").start();
	}

	
	public void run() {
		for(int i = 0; i < 10; i++) {
			v.prendi();
		}
		
	}

}
