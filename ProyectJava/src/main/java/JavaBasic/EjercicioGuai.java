package JavaBasic;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjercicioGuai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido");
		
		String numero1 =JOptionPane.showInputDialog("Introduce el 1er. n�mero");
		int numUno = Integer.parseInt(numero1);
		
		String numero2 =JOptionPane.showInputDialog("Introduce el 2do. n�mero");
		int numDos = Integer.parseInt(numero2);
		
		JOptionPane.showMessageDialog(null, "La suma es: " + (numUno + numDos));
		JOptionPane.showMessageDialog(null, "La resta es: " + (numUno - numDos));
		JOptionPane.showMessageDialog(null, "La multiplicaci�n es: " + (numUno * numDos));
		JOptionPane.showMessageDialog(null, "La divisi� es: " + (numUno / numDos));
		JOptionPane.showMessageDialog(null, "El m�dulo/resto es: " + (numUno % numDos)); //(numUno - (numUno / numDos * numDos))

	}
}
