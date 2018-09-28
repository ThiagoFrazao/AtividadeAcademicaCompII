package entidades;

public class Pecas {
	
	private String nome;
	private int nivel;
	boolean visivel;
	
	public Pecas(){
		
	}
	
	public Pecas(String nome, int nivel){
		this.nome = nome;
		this.nivel = nivel;
		this.visivel = true;
	}
	
	public Pecas(String nome, int nivel, boolean visibilidade){
		this.nome = nome;
		this.nivel = nivel;
		this.visivel = visibilidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}

}
