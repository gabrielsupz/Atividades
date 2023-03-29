package Curso.exercicios.Atividade1;

import java.util.ArrayList;
import java.util.Collection;

public class Atividade1 {
	public static void main(String[] args) {

	
		
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(30);
		numbers.add(-20);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(11);
		numbers.add(-5);
		numbers.add(60);


	
		
		
		programa: for (int index = 0, valor = 0; index < numbers.size(); index++) {

			if (numbers.get(index) < 0) {
				System.err.println("Numero Negativo: " + numbers.get(index));
				break programa;
			}
			 if(numbers.get(index) > 0){
				System.out.println( numbers.get(index) + "+" +  valor + " = " + (numbers.get(index) + valor) );
				valor = numbers.get(index) + valor;
			
			}

			

		}

	}

}
