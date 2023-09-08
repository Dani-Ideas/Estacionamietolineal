package Herramintas;
import fes.aragon.utilerias.estaticas.arreglos.Arreglos;
import java.util.Random;

public class Herramietas {

	public static void main(String[] args) { try {
		Arreglos <Integer> estacionamieto=new Arreglos<Integer>(5);
		Random numero_ramdomRandom=new Random();
		
		// para rellenar el array
		for(int i =0; i<=estacionamieto.longitud()-1; i++) {
			estacionamieto.asignar(i, i+1);
			System.out.println(estacionamieto.recupera(i));
		}
		
		// es para decidir el carro dentro del estacionamieto es retirado o se queda
		for (int i= 0; i<=estacionamieto.longitud()-1; i++) {
			int desition=numero_ramdomRandom.nextInt(101);
			// si el numero entra dentro de este rango del no se ejecutara el inetercabio de las posiciones 
			if (desition<=100&&desition>=50) {
				/* Este rango fue selecionado por que el metodo nextInt(100) genera numeros aleatorios del 0 al 100 este metodo puede ser modificado en proximas versiones
				 *  de la aberracion llamada Java
				 * */
				System.out.println("-----------------------------------\n El carrro "+i+" permanece dentro del estacionamiento\n");
			}else {
				//si no entra detro del rango del numero generado
				int calle,carroSolicitado;
				boolean carroEntregado=false;
				calle = estacionamieto.recupera(estacionamieto.ultimo());
				
				carroSolicitado=estacionamieto.recupera(i);
				while(!carroEntregado) {
					if (calle==carroSolicitado) {
						System.out.println("Borrar");
						calle=0;
						carroEntregado= true;
					}else {
						for (int j =estacionamieto.longitud()-1; j>0;j--) {
							// sobre escribe el dato de la siguiente posicion  haciendo que en la posiscion n, n+1 tengan el mismo dato
							estacionamieto.asignar(j, estacionamieto.anterior(j));
						}
						estacionamieto.asignar(0, calle);
					}
					estacionamieto.imprime();
					System.out.println(" esta es la calle "+calle);	
				}		
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
		}
	}
}