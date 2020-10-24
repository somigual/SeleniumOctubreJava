package JavaBasic;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int numUno = 20;
				int numDos = 25;
				
				System.out.println("Declara 2 variables numéricas he indica cual es mayor de los dos. Si son iguales indicarlo también.");
				System.out.println();
				System.out.println("1er. número: "+numUno);
				System.out.println("2do. número: "+numDos);
				System.out.println();
			
				if(numUno > numDos) {
					System.out.println("El número "+numUno+" es mayor");
				}else if (numUno < numDos) {
					System.out.println("El número "+numDos+" es mayor");
				}else {
					System.out.println("Los números son iguales");
				}

	}

}
