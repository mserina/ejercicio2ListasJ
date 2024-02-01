package controladores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class inicio {

	public static void main(String[] args) {
		int numeros = 0;
		List<Integer> listaNumeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Inserte numeros enteros");
			numeros = sc.nextInt();
			if (numeros > 0) 
			{
				listaNumeros.add(numeros);
			}
		} while (numeros != -1 && numeros != 0);

		
		System.out.println("----------------------");
		System.out.println("LISTA DE NUMEROS");
		for (Integer numerosDeLista : listaNumeros) {
			
			System.out.print(numerosDeLista + " ");
		}
		
		
		for (int i = 0; i < listaNumeros.size(); i++) {
            for (int j = i + 1; j < listaNumeros.size(); j++) {
            // Compara cada elemento [i] con el resto de elementos que le siguen [j]
                if (listaNumeros.get(i).equals(listaNumeros.get(j))) {
            // Si encuentra una repetición, lo reemplazara por 0
                    listaNumeros.set(j, 0);
                }
            }
        }
		
		System.out.println(" ");
		System.out.println("----------------------");
		System.out.println("LISTA DE NUMEROS SIN DUPLICADOS");
		for (Integer numerosDeLista : listaNumeros) {
			
			System.out.print(numerosDeLista + " ");
		}
		
	}
}
