package JavaBasic;

import javax.swing.JOptionPane;

public class ejercicio6 {
		/**
		 * 6) Lee un n�mero por teclado e indica si es divisible entre 2 (resto = 0). 
		 * Si no lo es, tambi�n debemos indicarlo.
		 **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Ingresa un n�mero");
		int numero = Integer.parseInt(texto);
		
		if(numero%2==0) {
			System.out.println("El numero ingresado [ "+numero+" ] es divisible entre 2.");
		}else {
			System.out.println("El numero ingresado [ "+numero+" ] no es divisible entre 2.");
		}
	}

}
