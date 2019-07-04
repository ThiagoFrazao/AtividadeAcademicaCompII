package animais.abstracts;

import java.util.HashSet;
import java.util.Set;

import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;
import animais.interfaces.Animal;

public abstract class AnimalAbstract implements Animal {
	
	protected Sexo sexo;
	protected Porte porte;
	protected Set<Alimento>  alimentosConsumiveis;
	
	public AnimalAbstract(Sexo sexo, Porte porte){
		this.porte = porte;
		this.sexo = sexo;
		this.alimentosConsumiveis = new HashSet<>();
	}
	
	public AnimalAbstract(Sexo sexo, Porte porte, Set<Alimento> alimentos){
		this.porte = porte;
		this.sexo = sexo;
		this.alimentosConsumiveis = alimentos;
	}	

	@Override
	public boolean alimentar(Alimento alimento) {
		return this.alimentosConsumiveis.contains(alimento);
	}
	
	public boolean adicionarAlimento(Alimento alimento){
		return this.alimentosConsumiveis.add(alimento);
	}


	@Override
	public Sexo getSexo() {
		return this.sexo;
	}

	@Override
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public Porte getPorte() {
		return this.porte;
	}

	@Override
	public void setPorte(Porte porte) {
		this.porte = porte;		
	}
}
