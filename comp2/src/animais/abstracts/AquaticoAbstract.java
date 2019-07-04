package animais.abstracts;

import java.util.Set;

import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;
import animais.interfaces.Aquatico;

public class AquaticoAbstract extends AnimalAbstract implements Aquatico {

	public AquaticoAbstract(Sexo sexo, Porte porte){
		super(sexo, porte);
	}
	
	public AquaticoAbstract(Sexo sexo, Porte porte, Set<Alimento> alimentos){
		super(sexo,porte,alimentos);
	}	
	@Override
	public void locomover() {
		this.nadar();		
	}

	@Override
	public void nadar() {
		System.out.println("Estou nadando!");
	}		
}
