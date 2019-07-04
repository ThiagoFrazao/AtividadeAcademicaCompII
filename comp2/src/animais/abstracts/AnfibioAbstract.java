package animais.abstracts;

import java.util.Set;

import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;
import animais.interfaces.Anfibio;

public class AnfibioAbstract extends AnimalAbstract implements Anfibio {
	
	public AnfibioAbstract(Sexo sexo, Porte porte){
		super(sexo, porte);
	}
	
	public AnfibioAbstract(Sexo sexo, Porte porte, Set<Alimento> alimentos){
		super(sexo,porte,alimentos);
	}	
	@Override
	public void locomover() {
		this.andar();
		this.nadar();		
	}

	@Override
	public void andar() {
		System.out.println("Estou andando!");
	}

	@Override
	public void nadar() {
		System.out.println("Estou nadando!");
	}		
}
