import java.util.Random;


public class TareaImprimir implements Runnable{
	
	private final int tiempoInactividad;
	private final String nombreTarea;
	private final static Random generador  = new Random();
	
	public TareaImprimir(String nombre){
		nombreTarea = nombre;
		tiempoInactividad = generador.nextInt(5000);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("%s va a estar inactivo durante %d milisegundos. \n",nombreTarea, tiempoInactividad);
		try {
			Thread.sleep(tiempoInactividad);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.printf("%s %s \n",nombreTarea,"termino en forma prematura, debidoa la interrupcion");
		}
		System.out.printf("%s termina su inactividad\n",nombreTarea);
	}

}
