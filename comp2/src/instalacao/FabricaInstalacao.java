package instalacao;

import instalacao.enums.Localizacao;
import instalacao.tipos.InstalacaoTubarao;
import instalacao.tipos.Tanque;

public class FabricaInstalacao {
	
	public InstalacaoTubarao criarInstalacaoTubarao(Localizacao localizacao) {
		Tanque tanque = new Tanque(500);
		InstalacaoTubarao instalacao = new InstalacaoTubarao(2, localizacao, 22);
		instalacao.adicionaInstalacao(tanque);
		return instalacao;
	}
	
	

}
