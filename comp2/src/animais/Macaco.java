package animais;

import animais.abstracts.TerrrestreAbstract;
import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;

public class Macaco extends TerrrestreAbstract{
	public Macaco(Sexo sexo,Porte porte){		
		super(sexo,porte);
		this.alimentosConsumiveis.add(Alimento.FRUTAS);
	}	

}
