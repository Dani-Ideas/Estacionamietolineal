package Herramintas;
import fes.aragon.utilerias.estaticas.arreglos.Arreglos;
import java.util.Random;

public class Herramietas {

	public static void main(String[] args) { try {
		Arreglos <Integer> estacionamieto=new Arreglos<Integer>(20);
		Random numero_ramdomRandom=new Random();
		
		// para rellenar el array
		for(int i =0; i<=estacionamieto.longitud()-1; i++) {
			estacionamieto.asignar(i, i+1);
			System.out.println(estacionamieto.recupera(i));
		}
		
		// es para decidir el carro dentro del estacionamieto es retirado o se queda
		for (int i= 0; i<=estacionamieto.longitud()-1; i++) {
			int desition=numero_ramdomRandom.nextInt(2);
			// si el numero entra dentro de este rango del no se ejecutara el inetercabio de las posiciones 
			if (desition==1) {
				/* Este rango fue selecionado por que el metodo nextInt(100) genera numeros aleatorios del 0 al 100 este metodo puede ser modificado en proximas versiones
				 *  de la aberracion llamada Java
				 * */
				System.out.println("-----------------------------------\n El carrro "+i+" permanece dentro del estacionamiento\n");
			}else {
				System.out.println("***********************************\n El carrro "+i+" se va, llego el dueño\n");
				//si no entra detro del rango del numero generado
				estacionamieto.asignar(i, -1);
				estacionamieto.imprime();
				int calle=estacionamieto.ultimo();
				// en  este caso el -2 se va atomar como null en lo que encutro una manera de que calle pueda alamacenar null
				while(calle!=-1&&estacionamieto.ultimo()!=-1) {
					for (int j= estacionamieto.longitud()-2;j>=0;j--) {
						estacionamieto.asignar(j+1, estacionamieto.recupera(j));
						if (j==0) {
							estacionamieto.asignar(0, calle);
							calle=estacionamieto.ultimo();
							if (calle==-1)
								System.out.println(" ________ ___  ________      \n"+ "|\\  _____\\\\  \\|\\   ___  \\    \n"+ "\\ \\  \\__/\\ \\  \\ \\  \\\\ \\  \\   \n"+ " \\ \\   __\\\\ \\  \\ \\  \\\\ \\  \\  \n"+ "  \\ \\  \\_| \\ \\  \\ \\  \\\\ \\  \\ \n"+ "   \\ \\__\\   \\ \\__\\ \\__\\\\ \\__\\\n"+ "    \\|__|    \\|__|\\|__| \\|__|");
						}
						estacionamieto.imprime();
						System.out.println("Otra iteracion para sacar el carro\n\n\n\n");
					}
				}
			}
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		}
	}
}