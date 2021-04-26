package JoKenPo;

import java.util.Random;
import java.util.Scanner;

public class Escolhas {
	
	private int jogada;

	public int getJogada() {
		
		Scanner leitor = new Scanner(System.in);
		int uEscolha;
		uEscolha = leitor.nextInt();
		
		Random geradorN = new Random();
		int cEscolha;
		cEscolha = geradorN.nextInt(3);
	
		if (uEscolha - cEscolha == 0) {
			System.out.println("Empate");
		}
		
		else if ((uEscolha - cEscolha) == -1 || uEscolha - cEscolha == 2){
			System.out.println("Usuario venceu");
		}
		
		else {
			System.out.println("Computador venceu");
		}
		return jogada;
	}
	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	
}