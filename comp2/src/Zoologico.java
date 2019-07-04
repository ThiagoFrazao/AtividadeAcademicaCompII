import animais.Leao;
import animais.enums.Porte;
import animais.enums.Sexo;
import instalacao.FabricaInstalacao;
import instalacao.enums.Localizacao;
import instalacao.tipos.InstalacaoLeao;

public class Zoologico {	
	public static void main(String[] args) {
		
		Leao leao = new Leao(Sexo.MASCULINO, Porte.MEDIO);
		Leao leoa = new Leao(Sexo.FEMININO, Porte.MEDIO);
		// Todos Mamiferos ficarao na Ala Oeste
		InstalacaoLeao instalacaoLeao = FabricaInstalacao.criarInstalacaoLeao(Localizacao.OESTE);
		instalacaoLeao.instalaAnimal(leoa);
		instalacaoLeao.instalaAnimal(leao);
		
		
		
		
	}
}
