package JavaBasic;

import javax.swing.JOptionPane;

public class Ejercicio3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreUno = "Sofia Minerva";
		
		System.out.println("Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane)");
		System.out.println();
		
		String nombreDos = JOptionPane.showInputDialog("Introduce el nombre");
		Boolean captura = nombreUno.contentEquals(nombreDos);
	
		if(captura==true) {
			JOptionPane.showMessageDialog(null, "Bienvenida "+nombreUno);		
		}else {
			JOptionPane.showMessageDialog(null, nombreDos+" no es el nombre correcto");	
		}
	}
}
