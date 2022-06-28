package exercAlura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.lang.Comparable;
import java.util.Collections;


public class Lista {
	public static void main(String[] args) {
		
		ArrayList<String> classes = new ArrayList<String>();


		classes.add("Arian limas;62-999260798");
		classes.add("Geovane;62-544574");
		classes.add("Teodoro;62-48745");
		classes.add("Abacate;62-456454");
		classes.add("Feijao;95-456454");
		classes.add("Mamao;59-456454");
	//	classes.add(0, "dougas-6656");

		for (String classe : classes) {

			

			System.out.println(classe);

			

		}
		System.out.println();
		System.out.println(classes);
		System.out.println(classes.equals(classes));
		System.out.println("Tamanho da lista: " + classes.size());
		
		System.out.println();
		Collections.reverse(classes);
		System.out.println("lista listaada ao inverso" + classes);
		
		System.out.println();
		Collections.shuffle(classes);
		System.out.println("Lista embaralhada" + classes);
		
		System.out.println();
		Collections.rotate(classes, 1);
		System.out.println("Lista rotacionada 1 posições"+ classes);
		
	
	}

}
