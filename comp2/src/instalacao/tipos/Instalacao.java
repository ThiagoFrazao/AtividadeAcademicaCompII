package instalacao.tipos;

import java.util.HashSet;
import java.util.Set;

import animais.interfaces.Animal;
import instalacao.enums.Localizacao;

public abstract class Instalacao {
	
	private int capacidadeMaxima;
	private Localizacao localizacao;
	private double temperatura;
	private Set<Animal> animaisInstalados;
	private Set<ElementoInstalacao> elementosInstalacao;
	
	public Instalacao(int capacidadeMaxima, Localizacao localizacao, double temperatura) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.localizacao = localizacao;
		this.temperatura = temperatura;
		this.animaisInstalados = new HashSet<>() ;
		this.elementosInstalacao = new HashSet<>();
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public Set<Animal> getAnimaisInstalados() {
		return animaisInstalados;
	}	
	
	public Set<ElementoInstalacao> getElementosInstalacao() {
		return elementosInstalacao;
	}
	
	public void adicionaInstalacao(ElementoInstalacao elemento) {
		this.elementosInstalacao.add(elemento);
	}
	public boolean instalaAnimal(Animal animal){
		
		if(this.animaisInstalados.size() < this.capacidadeMaxima){
			this.animaisInstalados.add(animal);
			System.out.println(animal.getClass().getSimpleName() + " instalado com sucesso!");
			return true;
		} else {
			System.out.println("O animal"+  animal.getClass().getSimpleName() + 
					           " nao pode ser instalado instalacao com capacidade maxima!");
			return false;
		}
	}
	
}