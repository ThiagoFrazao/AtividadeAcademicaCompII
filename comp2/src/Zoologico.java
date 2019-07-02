import animais.Elefante;
import animais.Leao;
import animais.Macaco;
import animais.enums.Porte;
import animais.enums.Sexo;
import instalacao.FabricaInstalacao;
import instalacao.enums.Localizacao;
import instalacao.tipos.InstalacaoElefante;
import instalacao.tipos.InstalacaoLeao;
import instalacao.tipos.InstalacaoMacaco;

public class Zoologico {	
	public static void main(String[] args) {
		
		Leao leao = new Leao(Sexo.MASCULINO, Porte.MEDIO);
		Leao leoa = new Leao(Sexo.FEMININO, Porte.MEDIO);
		// Todos Mamiferos ficarao na Ala Oeste
		InstalacaoLeao instalacaoLeao = FabricaInstalacao.criarInstalacaoLeao(Localizacao.OESTE);
		instalacaoLeao.instalaAnimal(leoa);
		instalacaoLeao.instalaAnimal(leao);
		
		Elefante elefante = new Elefante(Sexo.MASCULINO, Porte.GRANDE);
		Elefante elefanta = new Elefante(Sexo.MASCULINO, Porte.GRANDE);

		InstalacaoElefante instalacaoElefante = FabricaInstalacao.criarInstalacaoElefante(Localizacao.OESTE);
		instalacaoElefante.instalaAnimal(elefante);
		instalacaoElefante.instalaAnimal(elefanta);
		
		Macaco macaco = new Macaco(Sexo.MASCULINO, Porte.PEQUENO);
		Macaco macaca = new Macaco(Sexo.MASCULINO, Porte.PEQUENO);
		
		InstalacaoMacaco instalacaoMacaco = FabricaInstalacao.criarInstalacaoMacaco(Localizacao.OESTE);
		instalacaoMacaco.instalaAnimal(macaco);
		instalacaoMacaco.instalaAnimal(macaca);
		
		
		
	}
}
