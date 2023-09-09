package Herramintas;
import fes.aragon.utilerias.estaticas.arreglos.Arreglos;
import java.util.Random;

public class Herramietas {

	public static void main(String[] args) { try {
		Arreglos <Integer> estacionamieto=new Arreglos<Integer>(20);
		Random numberRandom=new Random();
		
		// para rellenar el array
		for(int i =0; i<=estacionamieto.longitud()-1; i++) {
			estacionamieto.asignar(i, i+1);
			System.out.println(estacionamieto.recupera(i));
		}
		
		// es para decidir el carro dentro del estacionamieto es retirado o se queda
		for (int i= 0; i<=estacionamieto.longitud()-1; i++) {
			int choose=numberRandom.nextInt(2);
			// si el numero entra dentro de este rango del no se ejecutara el inetercabio de las posiciones 
			if (choose==1) {
				/* Este rango fue selecionado por que el metodo nextInt(2) genera numeros aleatorios del 0 al 1 este metodo puede ser modificado en proximas versiones
				 *  de la aberracion llamada Java
				 * */
				System.out.println("-----------------------------------\n El carrro "+(i+1)+" permanece dentro del estacionamiento\n");
			}else {
				System.out.println("***********************************\n El carrro "+(i+1)+" se va, llego el dueño\n");
				//si no entra detro del rango del numero generado
				estacionamieto.asignar(i, -1);
				int calle=estacionamieto.ultimo();
				// en  este caso el -2 se va a tomar como null en lo que encuetro una manera de que calle pueda alamacenar null
				// en  este caso el -2 se va a tomar como null en lo que encuetro una manera de que calle pueda alamacenar null
				// en  este caso el -2 se va a tomar como null en lo que encuetro una manera de que calle pueda alamacenar null
				// en  este caso el -2 se va a tomar como null en lo que encuetro una manera de que calle pueda alamacenar null
				// en  este caso el -2 se va a tomar como null en lo que encuetro una manera de que calle pueda alamacenar null
				while(calle!=-1&&estacionamieto.ultimo()!=-1) {
					for (int j= estacionamieto.longitud()-2;j>=0;j--) {
						estacionamieto.asignar(j+1, estacionamieto.recupera(j));
						if (j==0) {
							estacionamieto.asignar(0, calle);
							calle=estacionamieto.ultimo();
							if (calle==-1) {
								estacionamieto.asignar(estacionamieto.longitud()-1, null/*-2*/);
								System.out.println(" ________ ___  ________      \n"+ "|\\  _____\\\\  \\|\\   ___  \\    \n"+ "\\ \\  \\__/\\ \\  \\ \\  \\\\ \\  \\   \n"+ " \\ \\   __\\\\ \\  \\ \\  \\\\ \\  \\  \n"+ "  \\ \\  \\_| \\ \\  \\ \\  \\\\ \\  \\ \n"+ "   \\ \\__\\   \\ \\__\\ \\__\\\\ \\__\\\n"+ "    \\|__|    \\|__|\\|__| \\|__|");
							}
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