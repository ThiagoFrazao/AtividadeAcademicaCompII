package entidades;

import java.util.Random;

import utils.Organizador;

public class Tabuleiro {
	
	private Pecas[][] mapa;
	private Random random;
	
	public Tabuleiro(String corJogador, String corMaquina){
		this.mapa = new Pecas[5][5];
		this.random  = new Random();
	}
	
	public void distribuirAleatoriamente(Organizador organizador){
		int linha;
		int coluna;
		
		while(organizador.getPecasDisponiveis().size() > 0){
			linha = this.random.nextInt(2);
			if(organizador.getCor().equals("vermelho")){
				//Exercito Vermelho distribui peças na linha 3 e 4
				linha += 3;
			}
			coluna = this.random.nextInt(5);
			
			if(this.verificarPosicao(linha, coluna)){
				Pecas novaPeca = organizador.recuperarPeca();
				this.mapa[linha][coluna] = novaPeca;
				System.out.println("Peça " + novaPeca.getNome() +" . Na posicao [" + linha + "] [" + coluna + "]");
			}
		}		
	}
	
	public boolean verificarPosicao(int x, int y){
		if(this.mapa[x][y] != null){
			return false;
		}
		return true;		
	}
/*	
	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro("vermelho","azul");
		tab.distribuirAleatoriamente(new Organizador("azul"));
	}
*/
}
