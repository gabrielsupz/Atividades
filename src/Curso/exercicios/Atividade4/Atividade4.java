package Curso.exercicios.Atividade4;

public class Atividade4 {
	public static void main(String[] args) {

		Personagem darkElf = new Personagem(7, 9, 8, "Elfo Negro");
		Personagem orc = new Personagem(10, 9, 3, "Orc");
		Personagem anao = new Personagem(5, 5, 3, "Anao");
		Personagem lobisomem = new Personagem(7, 2, 5, "Lobisomem");
		Personagem hero = new Personagem(10, 9, 8, "Heroi");
		Personagem goblin = new Personagem(2, 3, 1, "Goblin");

		System.out.println(hero.getaRank());
		System.out.println(darkElf.getaRank());
		System.out.println(orc.getaRank());
		System.out.println(anao.getaRank());
		System.out.println(lobisomem.getaRank());
		System.out.println(goblin.getaRank());

	}
}

class Personagem {
	private int atk;
	private int def;
	private int evo;
	private String name;

	public Personagem(int atk, int def, int evo, String name) {
		super();
		this.atk = atk;
		this.def = def;
		this.evo = evo;
		this.name = name;
	}

	public String getaRank() {

		int poderTotal = ((atk * 45) / 100) + ((def * 35) / 100) + ((evo * 20) / 100);

		if (poderTotal >= 8) {
			return name + " | Rank: Personagem principal";

		}
		if (poderTotal >= 5) {
			return name + " | Rank: Personagem secundario";

		}
		if (poderTotal >= 3) {
			return name + " | Rank: Figurante";

		}

		return name + "  | Rank: Cone";
	}

}