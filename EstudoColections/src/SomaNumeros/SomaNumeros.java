package SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adiconarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		return soma;
	}
	
	public Integer encontrarMaiorNumero() {
		if (numeros.isEmpty()) {
			return null;
		}
		int maior = numeros.get(0);
		for(int numero : numeros) {
			if (numero > maior) {
				maior = numero;
			}
			
		}
		return maior;
	}
	
	public Integer encontrarMenorNumero() {
		if(numeros.isEmpty()) {
			return null;
		}
		int menor = numeros.get(0);
		for (int numero : numeros) {
			if(numero < menor) {
				menor = numero;
			}
		}
		return menor;
		
	}
	
	public List<Integer> exibirNumeros(){
		return new ArrayList<>(numeros);
	}
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adiconarNumero(5);
		somaNumeros.adiconarNumero(10);
		somaNumeros.adiconarNumero(8);
		
		System.out.println("Números:" + somaNumeros.exibirNumeros());
		System.out.println("Soma:" + somaNumeros.calcularSoma());
		System.out.println("Soma:" + somaNumeros.encontrarMaiorNumero());
		System.out.println("Soma:" + somaNumeros.encontrarMenorNumero());
	}
	
	
		
	
	
}
