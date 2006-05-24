import java.util.Arrays;

public class ServerComponent {

	//static int counter = 0;
	
	public void providedMethod1(){
		activeWaiting();
		//passiveWaiting();
	}

	private void activeWaiting() {
		double[] lotsOfDoubles = new double[10000];
		for (int i=0; i<10000; i++){
			lotsOfDoubles[i] = Math.random();
		}
		Arrays.sort(lotsOfDoubles);
	}
	
	private void passiveWaiting() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
	
		
}
