package Herramintas;
import java.util.Random;

public class Herramietas {

	public static void main(String[] args) {
		int estacionamieto[]= new int[100];
		Random numero_ramdomRandom=new Random();
		for(int i =0; i<estacionamieto.length-1; i++) {
			estacionamieto[i]=numero_ramdomRandom.nextInt(100);
		}
		
}
}