package JavaBasic;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	/**
	 * Haz una aplicaci�n que calcule el �rea de un c�rculo(pi*R2). 
	 * El radio se pedir� por teclado (recuerda pasar de String a double con Double.parseDouble). 
	 * Usa la constante PI y el m�todo pow de Math.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = JOptionPane.showInputDialog("Ingresa el radio");
		double radio = Double.parseDouble(valor);
		
		double area = Math.PI * Math.pow(radio, 2);
		JOptionPane.showMessageDialog(null, "El �rea del circulo es: "+ area);
	}

}
