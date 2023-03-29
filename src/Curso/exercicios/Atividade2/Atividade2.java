package Curso.exercicios.Atividade2;

public class Atividade2 {

	public static void main(String[] args) {

		ValorParaPercentual votosBrancos = new ValorParaPercentual(3500, "Votos Brancos");
		ValorParaPercentual votosNulos = new ValorParaPercentual(4000, "Votos Nulos");
		double vv = votosBrancos.getTotalDePessoas()
				- (votosNulos.getNumeroDePessoas() + votosBrancos.getNumeroDePessoas());

		ValorParaPercentual votosValidos = new ValorParaPercentual(vv, "Votos Validos");

		votosBrancos.percentualParaTotalDeEleitores();
		System.out.println(" ");
		votosNulos.percentualParaTotalDeEleitores();
		System.out.println(" ");
		votosValidos.percentualParaTotalDeEleitores();

		

	}

}

class ValorParaPercentual {
	private String indentificador;
	private double numeroDePessoas;
	private double totalDePessoas = 200000;

	public ValorParaPercentual(double pessoas, String name) {
		numeroDePessoas = pessoas;
		indentificador = name;
	}


	public double percentualParaTotalDeEleitores() {
		System.out.println(indentificador + "  -->  Pessoas: " + this.numeroDePessoas + " | Total: " + this.totalDePessoas);

		double percentual = (100 * this.numeroDePessoas) / this.totalDePessoas;
		System.out.println("O percentual quanto ao total de pessoas é : " + percentual + "%");
		return percentual;

	}
	

	public double getTotalDePessoas() {
		return totalDePessoas;
	}

	public double getNumeroDePessoas() {
		return numeroDePessoas;
	}
}
