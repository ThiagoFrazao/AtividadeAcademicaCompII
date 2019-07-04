package instalacao.tipos;

public class Tanque extends ElementoInstalacao {
	
	private double volumeEmLitros;

	public Tanque(double volumeEmLitros) {
		super();
		this.volumeEmLitros = volumeEmLitros;
	}

	public double getVolumeEmLitros() {
		return volumeEmLitros;
	}

	public void setVolumeEmLitros(double volumeEmLitros) {
		this.volumeEmLitros = volumeEmLitros;
	}
	
	

}
