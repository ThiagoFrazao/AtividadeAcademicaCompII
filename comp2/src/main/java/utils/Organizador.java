package utils;

import java.util.ArrayList;

import entidades.Pecas;

public class Organizador {
	
	private ArrayList<Pecas> pecasDisponiveis;
	private String cor;
	
	public Organizador(String cor){
		this.cor = cor;
		this.pecasDisponiveis = new ArrayList<Pecas>();
		
		Pecas bandeira = new Pecas("bandeira",0);
		Pecas bomba = new Pecas("bomba",0);
		Pecas espiao = new Pecas("espiao",1);
		Pecas soldado = new Pecas("soldado",2);
		Pecas cabo = new Pecas("cabo",3);
		Pecas marechal = new Pecas("marechal",10);
		
		this.pecasDisponiveis.add(bandeira);
		this.pecasDisponiveis.add(espiao);
		this.pecasDisponiveis.add(marechal);
		
		this.pecasDisponiveis.add(cabo);
		this.pecasDisponiveis.add(cabo);	
		
		this.pecasDisponiveis.add(bomba);
		this.pecasDisponiveis.add(bomba);		
		
		this.pecasDisponiveis.add(soldado);
		this.pecasDisponiveis.add(soldado);
		this.pecasDisponiveis.add(soldado);		
	}
	
	public Pecas recuperarPeca(String nome){
		Pecas retorno = null;
		ArrayList<Pecas> pecasDisp = this.getPecasDisponiveis();
		
		for(Pecas peca : pecasDisp){			
			if(peca.getNome().equals(nome)){
				retorno = peca;
			}		
		}		
		pecasDisp.remove(retorno);
		this.setPecasDisponiveis(pecasDisp);
		return retorno;		
	}
	
	public Pecas recuperarPeca(){			
		Pecas retorno = null;
		int posicao;
		ArrayList<Pecas> pecasDisp = this.getPecasDisponiveis();
		if(pecasDisp.size() > 0){
			posicao = RandomGenerator.gerarNumero(pecasDisp.size());
			retorno = pecasDisp.remove(posicao);
		}
		this.setPecasDisponiveis(pecasDisp);
		return retorno;		
	}

	public ArrayList<Pecas> getPecasDisponiveis() {
		return pecasDisponiveis;
	}

	public void setPecasDisponiveis(ArrayList<Pecas> pecasDisponiveis) {
		this.pecasDisponiveis = pecasDisponiveis;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
/*	public static void main(String[] args) {
		Organizador org = new Organizador();
		System.out.println(org.getPecasDisponiveis().size());
	}*/
	
	

}
