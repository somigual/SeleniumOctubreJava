package JavaBasic;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int numUno = 20;
				int numDos = 25;
				
				System.out.println("Declara 2 variables num�ricas he indica cual es mayor de los dos. Si son iguales indicarlo tambi�n.");
				System.out.println();
				System.out.println("1er. n�mero: "+numUno);
				System.out.println("2do. n�mero: "+numDos);
				System.out.println();
			
				if(numUno > numDos) {
					System.out.println("El n�mero "+numUno+" es mayor");
				}else if (numUno < numDos) {
					System.out.println("El n�mero "+numDos+" es mayor");
				}else {
					System.out.println("Los n�meros son iguales");
				}

	}

}
