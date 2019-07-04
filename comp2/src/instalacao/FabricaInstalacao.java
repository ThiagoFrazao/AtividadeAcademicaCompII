package instalacao;

import instalacao.enums.Localizacao;
import instalacao.tipos.InstalacaoBaleia;
import instalacao.tipos.InstalacaoElefante;
import instalacao.tipos.InstalacaoFoca;
import instalacao.tipos.InstalacaoLeao;
import instalacao.tipos.InstalacaoMacaco;
import instalacao.tipos.InstalacaoPeixeBoi;
import instalacao.tipos.InstalacaoPinguim;
import instalacao.tipos.InstalacaoTartaruga;
import instalacao.tipos.InstalacaoTubarao;
import instalacao.tipos.InstalacaoZebra;
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
	
	public static InstalacaoElefante criarInstalacaoElefante(Localizacao localizacao) {
		Jaula jaula = new Jaula(20, 30, 25);
		InstalacaoElefante instalacao = new InstalacaoElefante(2, localizacao, 23);
		instalacao.adicionaInstalacao(jaula);
		return instalacao;
	}
	
	public static InstalacaoMacaco criarInstalacaoMacaco(Localizacao localizacao) {
		Jaula jaula = new Jaula(40, 35.7, 90);
		InstalacaoMacaco instalacao = new InstalacaoMacaco(10, localizacao, 25);
		instalacao.adicionaInstalacao(jaula);
		return instalacao;
	}
	
	public static InstalacaoTartaruga criarInstalacaoTartaruga(Localizacao localizacao) {
		Tanque tanque = new Tanque(200);
		InstalacaoTartaruga instalacao = new InstalacaoTartaruga(17, localizacao, 20);
		instalacao.adicionaInstalacao(tanque);
		return instalacao;
	}
	
	public static InstalacaoPinguim criarInstalacaoPinguim(Localizacao localizacao) {
		Tanque tanque = new Tanque(100);
		InstalacaoPinguim instalacao = new InstalacaoPinguim(25, localizacao, 15);
		instalacao.adicionaInstalacao(tanque);
		return instalacao;
	}
	
	public static InstalacaoFoca criarInstalacaoFoca(Localizacao localizacao) {
		Tanque tanque = new Tanque(100);
		InstalacaoFoca instalacao = new InstalacaoFoca(5, localizacao, 15);
		instalacao.adicionaInstalacao(tanque);
		return instalacao;
	}

	public static InstalacaoPeixeBoi criarInstalacaoPeixeBoi(Localizacao localizacao) {
		Tanque tanque = new Tanque(750);
		InstalacaoPeixeBoi instalacao = new InstalacaoPeixeBoi(7, localizacao, 18);
		instalacao.adicionaInstalacao(tanque);
		return instalacao;
	}
	
	public static InstalacaoBaleia criarInstalacaoBaleia(Localizacao localizacao) {
		Tanque tanque = new Tanque(1000);
		InstalacaoBaleia instalacao = new InstalacaoBaleia(2, localizacao,19);
		instalacao.adicionaInstalacao(tanque);
		return instalacao;
	}

	public static InstalacaoZebra criarInstalacaoZebra(Localizacao localizacao) {
		Jaula tanque = new Jaula(20,30,25);
		InstalacaoZebra instalacao = new InstalacaoZebra(2, localizacao, 24);
		instalacao.adicionaInstalacao(tanque);
		return instalacao;
	}
}
