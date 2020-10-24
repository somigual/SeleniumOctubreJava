package JavaBasic;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjercicioGuai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido");
		
		String numero1 =JOptionPane.showInputDialog("Introduce el 1er. número");
		int numUno = Integer.parseInt(numero1);
		
		String numero2 =JOptionPane.showInputDialog("Introduce el 2do. número");
		int numDos = Integer.parseInt(numero2);
		
		JOptionPane.showMessageDialog(null, "La suma es: " + (numUno + numDos));
		JOptionPane.showMessageDialog(null, "La resta es: " + (numUno - numDos));
		JOptionPane.showMessageDialog(null, "La multiplicación es: " + (numUno * numDos));
		JOptionPane.showMessageDialog(null, "La divisió es: " + (numUno / numDos));
		JOptionPane.showMessageDialog(null, "El módulo/resto es: " + (numUno % numDos)); //(numUno - (numUno / numDos * numDos))

	}
}
