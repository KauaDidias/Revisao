package atividadesRevisao;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao ChatBot!");
		System.out.println("Você é legal?");
		String resposta = scanner.next();
		
		if (resposta.equalsIgnoreCase("Sim")) {
			System.out.println("Você merece um bombom!");
		}
		else {
			System.out.println("Todo mundo tem seus dias");
		}
		scanner.close();
	}
}
