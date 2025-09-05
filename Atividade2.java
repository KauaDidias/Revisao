package atividadesRevisao;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		int robo1, robo2;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Rodada " + (i+1));
			System.out.println("Informe a força do primeiro robô (1-100): ");
			robo1 = scanner.nextInt();
			System.out.println("Informe a força do segundo robô (1-100):");
			robo2 = scanner.nextInt();
			
			if(robo1 > robo2) {
				System.out.println("O vencedor é o primeiro robô!");
			}
			else if (robo2 > robo1) {
				System.out.println("O vencedor é o segundo robô!");
			}
			else {
				System.out.println("Empate!");
			}
		}
		scanner.close();
	}
}
