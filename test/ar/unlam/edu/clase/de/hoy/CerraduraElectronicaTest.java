//Metodos: debe permitir abrirse, debe permitir cerrarse, debe permitir crearse,
//cuando se crea se crea con una clave de acceso, cantidad de intentos fallidos a bloqueo(3),
//debe responder a la pregunta si está abierta O cerrada(1 sola)


package ar.unlam.edu.clase.de.hoy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class CerraduraElectronicaTest {

	@Test
	public void queEsteCerrada(){
	CerraduraElectronica miCerradura = new CerraduraElectronica(123,3);
	Boolean Estado = true;
	Assert.assertTrue(miCerradura.queEsteCerrada(Estado));
	}
	
	
	@Test
	public void queEsteAbierta(){
	CerraduraElectronica miCerradura = new CerraduraElectronica(123,3);
	Boolean Estado = true;
	Assert.assertTrue(miCerradura.queEsteAbierta(Estado));
	}
	
	
	@Test
	public void queSeBloquea(){
	CerraduraElectronica miCerradura = new CerraduraElectronica(123,3);
	Boolean Estado = true;
	Assert.assertTrue(miCerradura.queSeBloquea(Estado));
		
	}
	
}
