package animais.abstracts;

import java.util.Set;

import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;
import animais.interfaces.Terrestre;

public abstract class TerrrestreAbstract extends AnimalAbstract implements Terrestre {
	
	public TerrrestreAbstract(Sexo sexo, Porte porte){
		super(sexo, porte);
	}
	
	public TerrrestreAbstract(Sexo sexo, Porte porte, Set<Alimento> alimentos){
		super(sexo,porte,alimentos);
	}	
	@Override
	public void locomover() {
		this.andar();
	}	
	
	@Override
	public void andar(){
		System.out.println("Estou andando!");
	}
}	
