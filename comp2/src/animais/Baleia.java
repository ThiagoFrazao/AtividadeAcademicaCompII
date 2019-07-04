package animais;

import animais.abstracts.TerrrestreAbstract;
import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;

public class Baleia extends TerrrestreAbstract{

	public Baleia(Sexo sexo,Porte porte){		
		super(sexo,porte);
		this.alimentosConsumiveis.add(Alimento.PEIXES);
	}	
}
