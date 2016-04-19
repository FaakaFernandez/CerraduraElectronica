package ar.unlam.edu.clase.de.hoy;

public class CerraduraElectronica {

	private Boolean Estado;
	private Integer Clave;
	private Integer IntentosFallidos;
	
	
	public CerraduraElectronica(Integer Clave,Integer IntentosFallidos){
		this.Clave = Clave;
		this.IntentosFallidos = IntentosFallidos;
	}
	
	public Boolean queEsteCerrada(Boolean Estado){
		return true;
	}

	public Boolean queEsteAbierta(Boolean Estado) {
		return true;
	}

	public Boolean queSeBloquea(Boolean Estado) {
		return true;
	}
	
}
