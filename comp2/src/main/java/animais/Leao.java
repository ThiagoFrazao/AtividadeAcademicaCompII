package animais;

import java.util.HashSet;
import java.util.Set;

import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;
import animais.tipos.Terrestre;

public class Leao implements Terrestre {
	
	private Sexo sexo;
	private Porte porte;
	private Set<Alimento> alimentosConsumiveis = new HashSet<Alimento>();
	
	public Leao(Sexo sexo,Porte porte){		
		this.sexo = sexo;
		this.porte = porte;
		this.alimentosConsumiveis.add(Alimento.CARNES);
	}	

	public boolean alimentar(Alimento alimento) {
		return this.alimentosConsumiveis.contains(alimento);
	}

	public void locomover() {
		System.out.println("Estou andando!");
	}

	public Sexo getSexo() {
		return this.sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Porte getPorte() {
		return this.porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}
}
