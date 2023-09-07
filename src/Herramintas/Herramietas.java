package Herramintas;
import fes.aragon.utilerias.estaticas.arreglos.Arreglos;
import java.util.Random;

public class Herramietas {

	public static void main(String[] args) {
		int estacionamieto[]= new int[100];
		Random numero_ramdomRandom=new Random();
		// para rellenar el array
		for(int i =0; i<estacionamieto.length-1; i++) {
			estacionamieto[i]=i+1;
			System.out.println(estacionamieto[i]);
		}
		// es para decidir el carro dentro del estacionamieto es retirado o se queda
		for (int i= 0; i<estacionamieto.length-1; i++) {
			int desition=numero_ramdomRandom.nextInt(101);
			// si el numero entra dentro de este rango del no se ejcutara el inetercabio de las posiciones 
			if (desition<=100&&desition>=50) {
				/* Este rango fue selecionado por que el metodo nextInt(100) genera numeros aleatorios del 0 al 100 este metodo puede ser modificado en proximas versiones
				 *  de la aberracion llamada Java
				 * */
				System.out.println("-----------------------------------");
			}else {
				//si no entra detro del rango del numero generado 
				for (int j =i; j<=(estacionamieto.length-1-j);j++) {
					
				}
			}
		}
}
}