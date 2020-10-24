package JavaBasic;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	/**
	 * Haz una aplicación que calcule el área de un círculo(pi*R2). 
	 * El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
	 * Usa la constante PI y el método pow de Math.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = JOptionPane.showInputDialog("Ingresa el radio");
		double radio = Double.parseDouble(valor);
		
		double area = Math.PI * Math.pow(radio, 2);
		JOptionPane.showMessageDialog(null, "El área del circulo es: "+ area);
	}

}
