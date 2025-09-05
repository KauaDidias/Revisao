package atividadesRevisao;

import java.util.Random;

public class Atividade5 {
	public static void main(String[] args) {
		Random random = new Random();
		int faceDado = 0;
		int tentativa = 0;
		
		while (faceDado != 6) {
		faceDado = random.nextInt(6);
		 tentativa++;
		}
		System.out.println("Foram " + tentativa + " tentativas!");
	}
}
