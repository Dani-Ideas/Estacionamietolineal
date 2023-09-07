package Herramintas;
import fes.aragon.utilerias.estaticas.arreglos.Arreglos;
import java.util.Random;

public class Herramietas {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Arreglos <Integer> estacionamieto=new Arreglos<Integer>(5);
		
		Random numero_ramdomRandom=new Random();
		
		// para rellenar el array
		for(int i =0; i<=estacionamieto.longitud()-1; i++) {
			try {
				estacionamieto.asignar(i, i+1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println(estacionamieto.recupera(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// es para decidir el carro dentro del estacionamieto es retirado o se queda
		for (int i= 0; i<=estacionamieto.longitud()-1; i++) {
			int desition=numero_ramdomRandom.nextInt(101);
			// si el numero entra dentro de este rango del no se ejcutara el inetercabio de las posiciones 
			if (desition<=100&&desition>=50) {
				/* Este rango fue selecionado por que el metodo nextInt(100) genera numeros aleatorios del 0 al 100 este metodo puede ser modificado en proximas versiones
				 *  de la aberracion llamada Java
				 * */
				System.out.println("-----------------------------------"+i);
			}else {
				//si no entra detro del rango del numero generado
				
				System.out.println("Si"+i);
				int calle;
				try {
					calle = estacionamieto.recupera(estacionamieto.ultimo());
					for (int j =i; j<=(estacionamieto.longitud()-1-j);j++) {
						try {
							//guarda el dato siguiente antes de ser sobre escrito
							int temporal= estacionamieto.recupera(estacionamieto.siguiente(j));
							// sobre escribe el dato de la siguiente posicion  haciendo que en la posiscion n, n+1 tengan el mismo dato
							estacionamieto.asignar(estacionamieto.siguiente(j), estacionamieto.recupera(j));
							//una vez que n+1 tine el dato en 
							estacionamieto.asignar(j, temporal);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(" esta es la calle "+calle);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}