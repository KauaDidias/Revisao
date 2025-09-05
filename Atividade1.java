package atividadesRevisao;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int exp;
		
		System.out.println("Informe o XP do jogador: ");
		exp = scanner.nextInt();
		
		if (exp <= 100) {
			System.out.println("Noob!");
		}
		else if (exp > 100 && exp <= 500) {
			System.out.println("Aprendiz");
		}
		else if (exp > 500 && exp <= 1000) {
			System.out.println("Pro");	
		}
		else {
			System.out.println("Lendário");
		}
		scanner.close();
	}
}
