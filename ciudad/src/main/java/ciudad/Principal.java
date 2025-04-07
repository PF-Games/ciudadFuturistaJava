package ciudad;

import Drones.DronComercial;
import Misiones.Vigilancia;

public class Principal {

	public static void main(String[] args) {
		DronComercial otraInstancia = new DronComercial();
		DronComercial dronComercial  = new DronComercial(10, 4, new Vigilancia());
		//tipo           objeto       tipo de objeto (autonomia, procesamiento, mision)  //
		dronComercial.setAutonomia(12);
		System.out.println("La autonomía del dron comercial es: " + dronComercial.getAutonomia()
		);

	}

}
