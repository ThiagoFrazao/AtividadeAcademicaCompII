import animais.Baleia;
import animais.Elefante;
import animais.Foca;
import animais.Leao;
import animais.Macaco;
import animais.PeixeBoi;
import animais.Pinguim;
import animais.Tartaruga;
import animais.Tubarao;
import animais.Zebra;
import animais.enums.Alimento;
import animais.enums.Porte;
import animais.enums.Sexo;
import instalacao.FabricaInstalacao;
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

public class Zoologico {	
	public static void main(String[] args) {
		
		// Todos Mamiferos terrestres ficarao na Ala Oeste
		
		Leao leao = new Leao(Sexo.MASCULINO, Porte.MEDIO);
		Leao leoa = new Leao(Sexo.FEMININO, Porte.MEDIO);
		InstalacaoLeao instalacaoLeao = FabricaInstalacao.criarInstalacaoLeao(Localizacao.OESTE);
		instalacaoLeao.instalaAnimal(leoa);
		instalacaoLeao.instalaAnimal(leao);
		leao.alimentar(Alimento.CARNES);
		leao.alimentar(Alimento.FRUTAS);
		
		Elefante elefante = new Elefante(Sexo.MASCULINO, Porte.GRANDE);
		Elefante elefanta = new Elefante(Sexo.FEMININO, Porte.GRANDE);
		InstalacaoElefante instalacaoElefante = FabricaInstalacao.criarInstalacaoElefante(Localizacao.OESTE);
		instalacaoElefante.instalaAnimal(elefante);
		instalacaoElefante.instalaAnimal(elefanta);
		elefante.alimentar(Alimento.PEIXES);
		elefante.alimentar(Alimento.FRUTAS);
		
		Macaco macaco = new Macaco(Sexo.MASCULINO, Porte.PEQUENO);
		Macaco macaca = new Macaco(Sexo.FEMININO, Porte.PEQUENO);		
		InstalacaoMacaco instalacaoMacaco = FabricaInstalacao.criarInstalacaoMacaco(Localizacao.OESTE);
		instalacaoMacaco.instalaAnimal(macaco);
		instalacaoMacaco.instalaAnimal(macaca);
		macaco.alimentar(Alimento.FRUTAS);
		macaco.alimentar(Alimento.CARNES);
		
		Zebra zebraMacho = new Zebra(Sexo.MASCULINO, Porte.MEDIO);
		Zebra zebraFemea = new Zebra(Sexo.FEMININO, Porte.MEDIO);
		zebraMacho.alimentar(Alimento.VERDURAS);
		zebraMacho.alimentar(Alimento.PEIXES);
		InstalacaoZebra instalacaoZebra = FabricaInstalacao.criarInstalacaoZebra(Localizacao.OESTE);
		instalacaoZebra.instalaAnimal(zebraMacho);
		instalacaoZebra.instalaAnimal(zebraFemea);
		
		//Animais anfibios ficarao todos na Ala Leste
		
		Tartaruga tartarugaMacho = new Tartaruga(Sexo.MASCULINO, Porte.PEQUENO);
		Tartaruga tartarugaFemea = new Tartaruga(Sexo.FEMININO, Porte.PEQUENO);
		tartarugaMacho.alimentar(Alimento.FRUTAS);
		tartarugaMacho.alimentar(Alimento.PEIXES);
		InstalacaoTartaruga instalacaoTartaruga = FabricaInstalacao.criarInstalacaoTartaruga(Localizacao.LESTE);
		instalacaoTartaruga.instalaAnimal(tartarugaMacho);
		instalacaoTartaruga.instalaAnimal(tartarugaFemea);
		
		Pinguim pinguimMacho = new Pinguim(Sexo.MASCULINO, Porte.PEQUENO);
		Pinguim pinguimFemea = new Pinguim(Sexo.FEMININO, Porte.PEQUENO);
		pinguimFemea.alimentar(Alimento.PEIXES);
		pinguimFemea.alimentar(Alimento.CARNES);
		InstalacaoPinguim instalacaoPinguim = FabricaInstalacao.criarInstalacaoPinguim(Localizacao.LESTE);
		instalacaoPinguim.instalaAnimal(pinguimMacho);
		instalacaoPinguim.instalaAnimal(pinguimFemea);
		
		Foca focaMacho = new Foca(Sexo.MASCULINO, Porte.MEDIO);
		Foca focaFemea = new Foca(Sexo.FEMININO, Porte.MEDIO);
		focaFemea.alimentar(Alimento.PEIXES);
		focaFemea.alimentar(Alimento.FRUTAS);
		InstalacaoFoca instalacaoFoca = FabricaInstalacao.criarInstalacaoFoca(Localizacao.LESTE);
		instalacaoFoca.instalaAnimal(focaMacho);
		instalacaoFoca.instalaAnimal(focaFemea);

		//Animais aquatico ficarao todos na Aala Sul
		
		Baleia baleiaMacho = new Baleia(Sexo.MASCULINO, Porte.GRANDE);
		Baleia baleiaFemea = new Baleia(Sexo.FEMININO, Porte.GRANDE);
		baleiaMacho.alimentar(Alimento.PEIXES);
		baleiaFemea.alimentar(Alimento.PEIXES);
		InstalacaoBaleia instalacaoBaleia = FabricaInstalacao.criarInstalacaoBaleia(Localizacao.SUL);
		instalacaoBaleia.instalaAnimal(baleiaMacho);
		instalacaoBaleia.instalaAnimal(baleiaFemea);
		
		Tubarao tubaraoMacho = new Tubarao(Sexo.MASCULINO, Porte.GRANDE);
		Tubarao tubaraoFemea = new Tubarao(Sexo.FEMININO, Porte.GRANDE);
		tubaraoMacho.alimentar(Alimento.CARNES);
		tubaraoMacho.alimentar(Alimento.PEIXES);
		tubaraoFemea.alimentar(Alimento.CARNES);
		tubaraoFemea.alimentar(Alimento.PEIXES);
		InstalacaoTubarao instalacaoTubarao = FabricaInstalacao.criarInstalacaoTubarao(Localizacao.SUL);
		instalacaoTubarao.instalaAnimal(tubaraoMacho);
		instalacaoTubarao.instalaAnimal(tubaraoFemea);
		
		PeixeBoi peixeBoiMacho = new PeixeBoi(Sexo.MASCULINO, Porte.GRANDE);
		PeixeBoi peixeBoiFemea = new PeixeBoi(Sexo.MASCULINO, Porte.GRANDE);
		peixeBoiMacho.alimentar(Alimento.PEIXES);
		peixeBoiFemea.alimentar(Alimento.PEIXES);
		InstalacaoPeixeBoi instalacaoPeixeBoi = FabricaInstalacao.criarInstalacaoPeixeBoi(Localizacao.SUL);
		instalacaoPeixeBoi.instalaAnimal(peixeBoiMacho);
		instalacaoPeixeBoi.instalaAnimal(peixeBoiFemea);		
	}
}