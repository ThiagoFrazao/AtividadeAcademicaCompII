package entidades;

import java.util.ArrayList;

import utils.RandomGenerator;

public class Tabuleiro {
	
	private Pecas[][] mapa;
	
	public Tabuleiro(){
		this.mapa = new Pecas[5][5];
		Pecas lago = new Pecas("lago",0);
		
		int posLago = RandomGenerator.gerarNumero(5);
		this.mapa[2][posLago] = lago;
	}
	
	public void distribuirAleatoriamente(Organizador organizador, String cor){
		int linha;
		int coluna;
		
		while(organizador.getPecasDisponiveis().size() > 0){
			linha = RandomGenerator.gerarNumero(2);
			if(cor.equals("vermelho")){
				//Exercito Vermelho distribui peças na linha 3 e 4
				linha += 3;
			}
			coluna = RandomGenerator.gerarNumero(5);
			
			if(this.verificarPosicao(linha, coluna)){
				Pecas novaPeca = organizador.recuperarPeca();
				this.mapa[linha][coluna] = novaPeca;
				
			}
		}	
	}
	
	public boolean distribuirPeca(Pecas peca, int x, int y){		
		if(verificarPosicao(x,y)){
			return false;
		}
		
		this.mapa[x][y] = peca;		
		return true;
	}
	
	public boolean verificarPosicao(int x, int y){
		if(this.mapa[x][y] == null){
			return false;
		}
		return true;		
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		int linha;
		int coluna;
		
		for(linha = 0; linha < 5; linha++){
			for(coluna = 0; coluna < 5; coluna++){
				if(!this.verificarPosicao(linha, coluna)){
					str.append("Posicao [" + linha + "] " + "[" + coluna +"] = " + this.mapa[linha][coluna].getNome() + "\n" );
				}
				else{
					str.append("Posicao [" + linha + "] " + "[" + coluna +"] = Vazio \n" );
				}				
			}
		}		
		return str.toString();		
	}
	
	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro();
		tab.distribuirAleatoriamente(new Organizador(), "vermelho");
		tab.distribuirAleatoriamente(new Organizador(), "azul");
		
		System.out.println(tab.toString());
		
	}

}
