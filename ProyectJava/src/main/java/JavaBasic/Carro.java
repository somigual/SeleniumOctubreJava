package JavaBasic;

public class Carro {
	static double numero;
	
	public static void main(String[] args) {
		numero=4.5;
		int numero2=3;
		boolean verdaderoOfalso;		
		System.out.println(numero+numero2+numero);
		String cadeDeCaracteres;
		
		cadeDeCaracteres="Sofia Minerva";
		System.out.println(cadeDeCaracteres+" Curso de Selenium");

		verdaderoOfalso = cadeDeCaracteres.equals("Juan Agustín");
		System.out.println(verdaderoOfalso);
		
		if(verdaderoOfalso==true) {
			System.out.println("El nombre es igual");
		}else {
			System.out.println("El nombre no es igual");
		}
		
	}

}
