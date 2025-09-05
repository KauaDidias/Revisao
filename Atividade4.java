package atividadesRevisao;

import java.util.Random;
import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int vida = 100;
		
		System.out.println("CAVERNA DO DRAGÃO");
		while (vida > 0) {
			Random random = new Random();
			int dano = random.nextInt(20);
			vida -= dano;
			System.out.println("A vida nessa rodada é : " + vida);
		}
		scanner.close();
		
	}
}
