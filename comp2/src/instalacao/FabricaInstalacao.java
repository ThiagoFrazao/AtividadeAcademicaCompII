package instalacao;

import instalacao.enums.Localizacao;
import instalacao.tipos.InstalacaoLeao;
import instalacao.tipos.InstalacaoTubarao;
import instalacao.tipos.Jaula;
import instalacao.tipos.Tanque;

public class FabricaInstalacao {
	
	public static InstalacaoTubarao criarInstalacaoTubarao(Localizacao localizacao) {
		Tanque tanque = new Tanque(500);
		InstalacaoTubarao instalacao = new InstalacaoTubarao(2, localizacao, 22);
		instalacao.adicionaInstalacao(tanque);
		return instalacao;
	}
	
	public static InstalacaoLeao criarInstalacaoLeao(Localizacao localizacao) {
		Jaula jaula = new Jaula(20, 30, 25);
		InstalacaoLeao instalacao = new InstalacaoLeao(3, localizacao, 21.5);
		instalacao.adicionaInstalacao(jaula);
		return instalacao;
	}
	
	

}
