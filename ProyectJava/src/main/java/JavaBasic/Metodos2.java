package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
	//Cuando se hereda deben ser declarados como static todas las variables
	static String heredar = "Mensaje de texto";
	
	protected static List<String> listaDeNombres(){
		List<String> listaNombres = new ArrayList<>();
			listaNombres.add("Sergio");
			listaNombres.add("Juan");
			listaNombres.add("Sofia");
			listaNombres.add("Agustín");
			listaNombres.add("Sergio");
		return listaNombres;
	}

	protected static List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList <>();
			listaNumeros.add(1);
			listaNumeros.add(12);
			listaNumeros.add(20);
			listaNumeros.add(6);
			listaNumeros.add(78);
			listaNumeros.add(1);
			listaNumeros.add(12);
			listaNumeros.add(1);
		return listaNumeros;
	}
	
}
