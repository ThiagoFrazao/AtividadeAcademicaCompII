package animais;

import animais.abstracts.AnfibioAbstract;
import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;

public class Foca extends AnfibioAbstract {

	public Foca(Sexo sexo, Porte porte) {
		super(sexo, porte);
		this.alimentosConsumiveis.add(Alimento.PEIXES);
	}
}
