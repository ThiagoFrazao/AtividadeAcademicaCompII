package instalacao.tipos;

public class Jaula extends ElementoInstalacao {
	
	private double altura;
	private double largura;
	private double comprimento;	
	
	public Jaula(double altura, double largura, double comprimento) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	public double calcularArea() {
		return this.altura * this.largura * this.comprimento;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	

}
