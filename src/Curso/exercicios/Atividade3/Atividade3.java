package Curso.exercicios.Atividade3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Atividade3 {
	public static void main(String[] args) {

		Pessoa jilberto = new Pessoa("Jilberto Alves", 34, 110.0, 1.80);
		Pessoa ana = new Pessoa("Ana Julia", 21, 90.0, 1.60);
		Pessoa algusto = new Pessoa("Algusto Alberto", 45, 130.0, 1.74);
		Pessoa gabriel = new Pessoa("Gabriel Suptitz", 17, 64.0, 1.83);
		Pessoa renan = new Pessoa("Renan Sparrow", 43, 50, 1.78);

		System.out.println(jilberto.getIMC());
		System.out.println(ana.getIMC());	
		System.out.println(algusto.getIMC());
		System.out.println(gabriel.getIMC());
		System.out.println(renan.getIMC());

	}
}

class Pessoa {
	private String name;
	private int age;
	private double weight;
	private double height;

	public Pessoa(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public String getIMC() {
		double IMCDouble = this.weight / (height * height);
		String message = "";
		BigDecimal IMC = new BigDecimal(IMCDouble).setScale(2, RoundingMode.HALF_DOWN);
		if (IMCDouble >= 40.0) {
			message = "Obesidade classe 3";
		}

		if (IMCDouble > 35.0 && IMCDouble <= 39.9) {
			message = "Obesidade classe 2";
		}
		if (IMCDouble > 30.0 && IMCDouble <= 34.9) {
			message = "Obesidade classe 1";
		}
		if (IMCDouble > 25.0 && IMCDouble <= 29.9) {
			message = "Excesso de peso ";
		}

		if (IMCDouble > 18.5 && IMCDouble <= 24.9) {
			message = "Peso normal ";
		}
		if (IMCDouble < 18.5) {
			message = "Abaixo do peso normal ";
		}

		String phrase = "Nome: " + name + "|  Age: " + age + "|  IMC: " + IMC + " " + message;

		return phrase;
	}

}