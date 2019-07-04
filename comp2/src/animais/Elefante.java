package animais;

import animais.abstracts.TerrrestreAbstract;
import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;

public class Elefante extends TerrrestreAbstract{
	public Elefante(Sexo sexo,Porte porte){		
		super(sexo,porte);
		this.alimentosConsumiveis.add(Alimento.FRUTAS);
		this.alimentosConsumiveis.add(Alimento.VERDURAS);
	}	
}
