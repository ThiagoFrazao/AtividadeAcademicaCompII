package animais;

import animais.abstracts.TerrrestreAbstract;
import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;

public class Pinguim extends TerrrestreAbstract{

	public Pinguim(Sexo sexo,Porte porte){		
		super(sexo,porte);
		this.alimentosConsumiveis.add(Alimento.PEIXES);
	}	
}
