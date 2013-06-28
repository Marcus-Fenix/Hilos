import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Thread hilo1 = new Thread(new TareaImprimir("Tarea1"));
		Thread hilo2 = new Thread(new TareaImprimir("Tarea2"));
		Thread hilo3 = new Thread(new TareaImprimir("Tarea3"));
		
		System.out.println("Subproceso creadis, iniciando tarea...");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		System.out.println("tareas iniciadas, terminar principal...");*/
		
		ExecutorService ejecutorSubprocesos = Executors.newCachedThreadPool();
		ejecutorSubprocesos.execute(new TareaImprimir("tarea1"));
		ejecutorSubprocesos.execute(new TareaImprimir("tarea2"));
		ejecutorSubprocesos.execute(new TareaImprimir("tarea3"));
		ejecutorSubprocesos.shutdown();

	}

}
