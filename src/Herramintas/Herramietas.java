package Herramintas;
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
		// es para decidir que numero de carro en la posicion del array se retiran de carros del estacionamieto
		for (int i= 0; i<estacionamieto.length-1; i++) {
			int desicion=numero_ramdomRandom.nextInt(100);
			if (desicion<=49) {
				// si el numero entra dentro de este rango de ejcutara el inetercabio de las posiciones 
			}else {
				//si no etra detro del rango del numero generado 
			}
		}
}
}