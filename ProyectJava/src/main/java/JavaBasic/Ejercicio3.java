package JavaBasic;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		nombre="Sofia Minerva";
		
		System.out.println("Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.");
		System.out.println("Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Sergio”.");
		System.out.println();
		
		if(nombre != "Fernando") {
			System.out.println("Bienvenida "+nombre);
		}else {
			System.out.println(nombre);
		}

	}

}
